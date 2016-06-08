package decorator;


public class Leite extends DecoratorAdicinais{

  private Bebida bebida;
  
  public Leite(Bebida bebida) {
    this.bebida = bebida;
  }
  
  @Override
  public String getDescricao() {
    return bebida.getDescricao() + " + Leite";
  }

  @Override
  public double valor() {
    return 1 + bebida.valor();
  }

}
