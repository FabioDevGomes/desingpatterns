package factory;


public class PizzaMilhoSaoPaulo extends Pizza{
  
  public PizzaMilhoSaoPaulo(IngredienteFacory ingredienteFacory) {
    super(ingredienteFacory);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void preparar() {
    System.out.println("Preparando pizza de Milho de São Paulo...");
  }

  @Override
  public void cortar() {
    System.out.println("Cortando pizza de Milho de São Paulo...");
  }

  @Override
  public void embalar() {
    System.out.println("Embalando pizza de Milho de São Paulo...");
  }

}
