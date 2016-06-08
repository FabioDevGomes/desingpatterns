package factory;


public abstract class LojaDePizza {
  
  public void pedirPizza(String sabor){
    Pizza pizza = produzirPizza(sabor);
    
    pizza.preparar();
    pizza.cortar();
    pizza.embalar();
    
  }

  public abstract Pizza produzirPizza(String sabor);
}
