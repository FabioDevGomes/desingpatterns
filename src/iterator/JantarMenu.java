package iterator;

import java.util.Arrays;
import java.util.List;

public class JantarMenu {

  static final int MAX_ITENS = 6;
  int numeroDeItens = 0;
  MenuItem[] menuItens;
  
  public JantarMenu() {
    menuItens = new MenuItem[MAX_ITENS];
      addItem("BLT Vegetariano", "algo com tomate e ovo", true, 2.99);
      addItem("Bacon", "Bacon com tomate e ovo", false, 1.99);
      addItem("BLT Vegetariano", "Bacon com tomate e ovo", true, 2.50);
      addItem("BLT ", "Bacon com tomate e ovo", false, 3.99);
  }
  
  public void addItem(String nome, String descricao, boolean vagetariano, double valor){
    MenuItem menuItem = new MenuItem(nome, descricao, vagetariano, valor);
    if(numeroDeItens >= MAX_ITENS){
      System.out.println("Desculpe, o menu está cheio! Não pode adicionar mais itens ao menu");
    }else{
      menuItens[numeroDeItens] = menuItem;
      numeroDeItens ++;
    }
  }
  
  public Iterator criarIterator(){
    
//    List<MenuItem> asList = Arrays.asList(menuItens);
//    asList.iterator();
    
    return new JantarMenuIterator(menuItens);
  }
  
  
//  public MenuItem[] getMenuItens(){
//    return menuItens;
//  }
  
}
