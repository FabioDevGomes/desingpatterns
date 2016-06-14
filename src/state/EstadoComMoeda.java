package state;


public class EstadoComMoeda implements State{

  
  MaqinaGomaDeMascar maquina;
  
  public EstadoComMoeda(MaqinaGomaDeMascar maquina) {
    this.maquina = maquina;
  }
  
  @Override
  public void inserirMoeda() {
    System.out.println("Você não pode inserir outra moeda, ela será ejetada!");
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Você acionou a alavanca...");
    maquina.setEstadoAtual(maquina.getEstadoVendido());
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Você ejetou a moeda");
    maquina.setEstadoAtual(maquina.getEstadoSemMoedas());
  }

  @Override
  public void entregarGoma() {
    System.out.println("Ação inadequada");
    // TODO Auto-generated method stub
    
  }

}
