package factory;


public class PizzaMilhoGoiania extends Pizza{

  IngredienteFacory ingredienteFacory;
  public PizzaMilhoGoiania(IngredienteFacory ingredienteFacory) {
    super(ingredienteFacory);
  }

  @Override
  public void preparar() {
    //  Define os ingredientes    
    setQueijo(ingredienteFacory.createQueijo());
    setMassa(ingredienteFacory.createQueijo());
    
    System.out.println("Preparando "+ getNome());
  }

  @Override
  public void cortar() {
    System.out.println("Cortando "+ getNome());
  }

  @Override
  public void embalar() {
    System.out.println("Embalando "+ getNome());
  }
  
}
