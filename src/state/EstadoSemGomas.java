package state;


public class EstadoSemGomas implements State{
  
  MaqinaGomaDeMascar maquina;
  
  public EstadoSemGomas(MaqinaGomaDeMascar maquina) {
    this.maquina = maquina;
  }

  @Override
  public void inserirMoeda() {
    System.out.println("Ação inválida para o estado atual");
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Ação inválida para o estado atual");
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Ação inválida para o estado atual");
  }

  @Override
  public void entregarGoma() {
    System.out.println("Ação inválida para o estado atual");
  }

}
