package mvc;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModel implements BeatModelInterface, MetaEventListener{

  @SuppressWarnings("rawtypes")
  ArrayList beatObservers = new ArrayList<>();
  @SuppressWarnings("rawtypes")
  ArrayList bpmObservers = new ArrayList<>();
  int bpm = 90;
  Sequencer sequencer;
  Sequence sequence;
  Track track;
  
  

  @Override
  public void initialize() {
    setUpMidi();
    buildTrackAndStart();
  }

  @Override
  public void on() {
    sequencer.start();
    setBPM(90);
  }

  @Override
  public void off() {
    setBPM(0);
    sequencer.stop();
  }

  @Override
  public void setBPM(int bpm) {
    this.bpm = bpm;
    sequencer.setTempoInBPM(getBPM());
    notifyBPMObservers();
    
  }

  @Override
  public int getBPM() {
    return bpm;
  }

  //TODO Código deveria ser chamado pela biblioteca MIDI, mas não está quando sequencer.setLoopCount() é usado!
  private void beatEvent() {
    notifyBeatObservers();
  }

  @SuppressWarnings("unchecked")
  @Override
  public void registerObserver(BeatObserver observer) {
    beatObservers.add(observer);
  }
  
  private void notifyBeatObservers() {
    for (int i = 0; i < beatObservers.size(); i++) {
      BeatObserver beatObserver = (BeatObserver) beatObservers.get(i);
      beatObserver.updateBeat();
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public void registerObserver(BPMObserver observer) {
    bpmObservers.add(observer);
  }

  private void notifyBPMObservers() {
    for (int i = 0; i < bpmObservers.size(); i++) {
      BPMObserver bpmObserver = (BPMObserver) bpmObservers.get(i);
      bpmObserver.updateBpm();
    }
  }


  @Override
  public void removeObserver(BeatObserver observer) {
    int indice = beatObservers.indexOf(observer);
    if(indice >= 0){
      beatObservers.remove(indice);
    }
  }

  @Override
  public void removeObserver(BPMObserver observer) {
    int indice = bpmObservers.indexOf(observer);
    if(indice >= 0){
      bpmObservers.remove(indice);
    }
  }
  
  @Override
  public void meta(MetaMessage meta) {
    if(meta.getType() == 47){
      beatEvent();
      sequencer.start();
      setBPM(getBPM());
    }
  }


  public void setUpMidi(){
    try {
      sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.addMetaEventListener(this);
      sequence = new Sequence(Sequence.PPQ, 4);
      track = sequence.createTrack();
      sequencer.setTempoInBPM(getBPM());
      sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void buildTrackAndStart(){
    int[] trackList = {35, 0, 46, 0};
    sequence.deleteTrack(null);
    track = sequence.createTrack();
    makeTracks(trackList);
    track.add(makeEvent(192, 9, 1, 0, 4));
    try {
      sequencer.setSequence(sequence);
    } catch (InvalidMidiDataException e) {
      e.printStackTrace();
    }
  }

  private void makeTracks(int[] trackList) {
    for (int i = 0; i < trackList.length; i++) {
      int key = trackList[i];
      if(key != 0){
        track.add(makeEvent(144, 9, key, 100, i));
        track.add(makeEvent(128, 9, key, 100, i+1)); // 1+1 <> i+1
      }
    }
  }

  private MidiEvent makeEvent(int i, int j, int k, int l, int m) {
    MidiEvent event = null;
    try {
      ShortMessage a = new ShortMessage();
      a.setMessage(i, j, k, l);
      event = new MidiEvent(a, m);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return event;
  }

}
