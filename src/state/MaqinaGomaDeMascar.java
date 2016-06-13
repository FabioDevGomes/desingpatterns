package state;


public class MaqinaGomaDeMascar {
 
  State estadoVendido;
  State estadoSemGomas;
  State estadoSemMoedas;
  State estadoComMoedas;
  
  State estadoAtual = estadoSemGomas;
  private int count = 0;
  
  public MaqinaGomaDeMascar(int numeroDeGomas) {
    estadoVendido = new EstadoVendido(this);
    estadoSemGomas = new EstadoSemGomas(this);
    estadoSemMoedas = new EstadoSemGomas(this);
    estadoSemMoedas = new EstadoComMoeda(this);
    
    count = numeroDeGomas;
    
    if(numeroDeGomas > 0){
      estadoAtual = estadoSemMoedas;
    }
  }
  
  void entregarGoma(){
    System.out.println("Um goma de mascar está saindo no compartimento!");
    if(count > 0){
      count --;
    }
  }

  public int getCount() {
    return count;
  }
  
  public State getEstadoAtual() {
    return estadoAtual;
  }

  
  public void setEstadoAtual(State estadoAtual) {
    this.estadoAtual = estadoAtual;
  }

  
  public State getEstadoVendido() {
    return estadoVendido;
  }

  
  public State getEstadoSemGomas() {
    return estadoSemGomas;
  }

  
  public State getEstadoSemMoedas() {
    return estadoSemMoedas;
  }

  
  public State getEstadoComMoedas() {
    return estadoComMoedas;
  }

}
