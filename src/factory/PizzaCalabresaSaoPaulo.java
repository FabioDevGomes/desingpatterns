package factory;


public class PizzaCalabresaSaoPaulo extends Pizza{
  
  public PizzaCalabresaSaoPaulo(IngredienteFacory ingredienteFacory) {
    super(ingredienteFacory);
  }

  @Override
  public void preparar() {
    System.out.println("Preparando pizza de Calabresa de São Paulo..." + this.ingredienteFacory.createQueijo());
  }

  @Override
  public void cortar() {
    System.out.println("Cortando pizza de Calabresa de São Paulo...");
  }

  @Override
  public void embalar() {
    System.out.println("Embalando pizza de Calabresa de São Paulo...");
  }


}
