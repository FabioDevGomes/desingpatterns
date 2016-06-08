package factory;


public class LojaPizzaSaoPaulo extends LojaDePizza{
  @Override
  public Pizza produzirPizza(String sabor) {
    
    if(sabor.equals("CALABRESA")){
      return new PizzaCalabresaSaoPaulo(new GoianiaIngrediente());
    }else if(sabor.equals("MILHO")){
      return new PizzaMilhoSaoPaulo(new GoianiaIngrediente());
    }
    return null;
  }
}
