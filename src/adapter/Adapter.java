package adapter;


public class Adapter implements Pato{
  Peru peru;
  
  public Adapter(Peru peru) {
    this.peru = peru;
  }

  @Override
  public void grasna() {
    peru.gruguleja();
    
  }

  @Override
  public void voar() {
    peru.voar();
  }

}
