package state;


public class EstadoVendido implements State {

  MaqinaGomaDeMascar maquina;
  
  public EstadoVendido(MaqinaGomaDeMascar maquina) {
    super();
    this.maquina = maquina;
  }

  @Override
  public void inserirMoeda() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void acionarAlavanca() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void ejetarMoeda() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void entregarGoma() {
    maquina.entregarGoma();
    if(maquina.getCount() > 0){
      
    }else{
      
    }
    
  }

}
