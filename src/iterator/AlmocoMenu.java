package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class AlmocoMenu implements Menu{
  
  Hashtable<String, MenuItem> almoco;
  
  public AlmocoMenu() {
    almoco = new Hashtable<>();
    addItem("Arroz Carreteiro", "Arroz com carne", false, 15.5);
    addItem("Arroz com Bife", "Arroz com ovos e bife", false, 18.5);
    addItem("Feijoada", "Feijão preto com carne de porco", false, 17.25);
  }
  
  
  public void addItem(String nome, String descricao, boolean vagetariano, double valor){
      MenuItem item = new MenuItem(nome, descricao, vagetariano, valor);
      almoco.put(item.getNome(), item);
  }


  @Override
  public Iterator criarIterator() {
    return almoco.values().iterator();
  }
  
}
