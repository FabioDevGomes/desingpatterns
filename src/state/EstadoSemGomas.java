package state;


public class EstadoSemGomas implements State{
  
  MaqinaGomaDeMascar maquina;
  
  public EstadoSemGomas(MaqinaGomaDeMascar maquina) {
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
    // TODO Auto-generated method stub
    
  }

}
