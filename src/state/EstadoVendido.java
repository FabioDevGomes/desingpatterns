package state;


public class EstadoVendido implements State {

  MaqinaGomaDeMascar maquina;
  
  public EstadoVendido(MaqinaGomaDeMascar maquina) {
    super();
    this.maquina = maquina;
  }

  @Override
  public void inserirMoeda() {
    System.out.println("Aguarde, vc j� receber� sua Goma");
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Voc� j� acionaou a alavanca");
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Voc� j� acionaou a alavanca");
  }

  @Override
  public void entregarGoma() {
    maquina.entregarGoma();
    if(maquina.getCount() > 0){
      maquina.setEstadoAtual(maquina.getEstadoSemMoedas());
    }else{
      System.out.println("As gomas acabaram!!!");
      maquina.setEstadoAtual(maquina.getEstadoSemGomas());
    }
  }

}
