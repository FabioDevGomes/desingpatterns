package observer;

import java.util.Observable;
import java.util.Observer;

public class CondicoesAtuais implements Observer, Display {

  private float temperatura;
  private float umidade;
  private Observable sujeito; //usar no futuro?
  
  
  public CondicoesAtuais(Observable sujeito) {
    this.sujeito = sujeito;
    sujeito.addObserver(this);
  }
  
  @Override
  public void display() {
    System.out.println("Temperatura autal: "+ temperatura);
    System.out.println("Umidade do ar autal: "+ umidade);

  }

  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof DadosClima){
      DadosClima dadosClima =  (DadosClima) o;
      this.temperatura = dadosClima.getTemperatura();
      this.umidade = dadosClima.getUmidade();
      display();
    }
  }

}
