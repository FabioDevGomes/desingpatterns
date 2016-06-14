package state;


public class EstadoSemMoeda implements State{

  
  MaqinaGomaDeMascar maquina;
  
  public EstadoSemMoeda(MaqinaGomaDeMascar maquina) {
    this.maquina = maquina;
  }
  
  
  @Override
  public void inserirMoeda() {
    System.out.println("\nVoc� inseriu uma moeda!");
    maquina.setEstadoAtual(maquina.getEstadoComMoedas());
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Voc� n�o inseriu uma moeda para poder acionar a alavanca!");
    // TODO Auto-generated method stub
    
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Voc� n�o inseriu uma moeda!");
    // TODO Auto-generated method stub
    
  }

  @Override
  public void entregarGoma() {
    System.out.println("Voc� precisa jogar primeiro!");
    // TODO Auto-generated method stub
    
  }

}
