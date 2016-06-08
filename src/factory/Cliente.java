package factory;

public class Cliente {

  public static void main(String[] args) {
    LojaDePizza lojaDePizzaSaoPaulo = new LojaPizzaSaoPaulo();
    lojaDePizzaSaoPaulo.pedirPizza(Pizza.SABOR_CALABRESA);
    System.out.println();
    
    lojaDePizzaSaoPaulo.pedirPizza(Pizza.SABOR_MILHO);
    System.out.println();
    
    LojaDePizza lojaGoiania = new LojaDePizzaGoiania();
    lojaGoiania.pedirPizza(Pizza.SABOR_MILHO);
    System.out.println();
    
    lojaGoiania.pedirPizza(Pizza.SABOR_CALABRESA);
    System.out.println();
  }
}
