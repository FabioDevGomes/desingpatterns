package iterator;


public class Garconete {

  JantarMenu jantarMenu;
  
  public Garconete(JantarMenu jantarMenu) {
    this.jantarMenu = jantarMenu;
  }
  
  // TODO falar com Fábio
  public void exibirMenu(){
    Iterator jantarIterator = jantarMenu.criarIterator();
    
    System.out.println("Menu\n------\nJantar");
    exibirMenu(jantarIterator);
    
    //TODO
//    System.out.println("");
//    exibirMenu(jantarIterator);
  }

  // TODO falar com Fábio
  public void exibirMenu(Iterator iterator){
    MenuItem item = (MenuItem) iterator.next();
    while (iterator.hasNext()) {
      MenuItem type = (MenuItem) iterator.next();
      System.out.println("");
      System.out.println("");
      System.out.println("");
      
    }
  }
  
  
}
