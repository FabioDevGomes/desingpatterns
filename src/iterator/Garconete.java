package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Garconete {

  ArrayList<Menu> menus;
  
  public Garconete(ArrayList<Menu> menus) {
    this.menus = menus;
  }
  
  public void exibirMenu(){
    for (Menu menu : menus) {
      System.out.println("=================");
      exibirMenu(menu.criarIterator());
    }
  }

  //Iteração polimórfica
  public void exibirMenu(Iterator iterator){
    while (iterator.hasNext()) {
      MenuItem type = (MenuItem) iterator.next();
      System.out.println(type.getNome());
      System.out.println(type.getDescricao());
      System.out.println(type.getValor());
      System.out.println("------");
      
    }
  }
  
}
