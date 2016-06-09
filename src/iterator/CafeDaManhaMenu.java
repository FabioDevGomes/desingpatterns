package iterator;

import java.util.ArrayList;

public class CafeDaManhaMenu {
  
  ArrayList<MenuItem> menuItens;
  
  public CafeDaManhaMenu(){
    addItem("Café simples", "Bacom com ovos", true, 2.20);
    addItem("Café especial", "algo com tomate e ovo", true, 1.99);
    addItem("Café duplo", "algo com tomate e ovo", true, 2.50);
    addItem("Café triplo", "algo com tomate e ovo", true, 3.99);
    
  }
  
  public void addItem(String nome, String descricao, boolean vagetariano, double valor){
    MenuItem menuItem = new MenuItem(nome, descricao, vagetariano, valor);
    menuItens.add(menuItem);
  }
  
  public Iterator criarIterator(){
    return new CafeDaManhaIterator(menuItens);
  }
  
}
