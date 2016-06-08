package decorator;


public class CafeComun extends Bebida{
  
  
  public CafeComun() {
    setDescricao("Café comun");
  }

  @Override
  public double valor() {
    return 2.5;
    
  }

}
