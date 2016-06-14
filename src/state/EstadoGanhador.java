package state;


public class EstadoGanhador implements State{
  
  MaqinaGomaDeMascar maquina;
  
  public EstadoGanhador(MaqinaGomaDeMascar maquina) {
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
    System.out.println("VOC� � O GANHADOR! vc receber� duas gomas de mascar");
    if(maquina.getCount() == 0){
      maquina.setEstadoAtual(maquina.getEstadoSemGomas());
    }else{
      maquina.entregarGoma();
      if(maquina.getCount() > 0){
        maquina.entregarGoma();
        maquina.setEstadoAtual(maquina.getEstadoSemMoedas());
      }else{
        System.out.println("Oops, as gomas acabaram");
        maquina.setEstadoAtual(maquina.getEstadoSemGomas());
      }
    }
  }
  
}
