package adapter;


public class PatoComum implements Pato{

  @Override
  public void grasna() {
    System.out.println("quack quack");
    
  }

  @Override
  public void voar() {
    System.out.println("Voando");
  }

}
