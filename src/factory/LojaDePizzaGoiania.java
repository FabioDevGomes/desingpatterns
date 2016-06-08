package factory;


public class LojaDePizzaGoiania extends LojaDePizza{

  @Override
  public Pizza produzirPizza(String sabor) {
    Pizza pizza = null;
    IngredienteFacory ingredienteFacory = new GoianiaIngrediente();
    
    if(sabor.equals("CALABRESA")){
      
      pizza = new PizzaCalabresaGoiania(ingredienteFacory);
      pizza.setNome("Pizza de Calabresa no estilo de Goi�nia");
      
    }else if(sabor.equals("MILHO")){
      
      pizza = new PizzaMilhoGoiania(ingredienteFacory);
      pizza.setNome("Pizza de Milho no estilo de Goi�nia");
      
    }
    return pizza;
  }

}
