package padroesCompostos;

import java.util.ArrayList;
import java.util.Iterator;

//Composite
public class Bando implements Quackable{
  ArrayList<Quackable> quackers = new ArrayList<>();
  Observable observable;
  
  public void add(Quackable quackable){
    quackers.add(quackable);
    observable = new Observable(this);
  }
  
  @Override
  public void quack() {
    //Iterator
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
//    Iterator iterator = quackers.iterator();
//    while (iterator.hasNext()) {
//      Quackable quacker = (Quackable) iterator.next();
//      quacker.registerObserver(observer);
//    }
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }

}
