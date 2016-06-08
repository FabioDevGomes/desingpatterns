package observer;

import java.awt.List;
import java.util.ArrayList;
import java.util.Observable;

public class DadosClima extends Observable{

  private float temperatura;
  private float umidade;
  private float pressao;
  
  
  public DadosClima() {
  }
  
  private void dadosAtualizados(){
    setChanged();
    notifyObservers();
  }
  
  public void setDadosClima(float temperatura, float umidade, float pressao){
    this.temperatura = temperatura;
    this.umidade = umidade;
    dadosAtualizados();
  }
  
  public float getTemperatura() {
    return temperatura;
  }
  
  public float getUmidade() {
    return umidade;
  }

  public float getPressao() {
    return pressao;
  }

}
