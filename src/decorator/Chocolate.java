package decorator;


public class Chocolate extends DecoratorAdicinais{

  private Bebida bebida;
  
  public Chocolate(Bebida bebida) {
    this.bebida = bebida;
  }
  
  @Override
  public String getDescricao() {
    return bebida.getDescricao() + " + Chocolate";
  }

  @Override
  public double valor() {
    return 1.5 + bebida.valor();
  }

}