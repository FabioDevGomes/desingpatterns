package iterator;


public class Garconete {

  JantarMenu jantarMenu;
  CafeDaManhaMenu cafeDaManhaMenu;
  
  public Garconete(JantarMenu jantarMenu, CafeDaManhaMenu cafeDaManhaMenu) {
    this.jantarMenu = jantarMenu;
    this.cafeDaManhaMenu = cafeDaManhaMenu;
  }
  
  public void exibirMenu(){
    Iterator jantarIterator = jantarMenu.criarIterator();
    
    System.out.println("Menu\n------\nJantar");
    exibirMenu(jantarIterator);
    
    System.out.println("Menu\n------\nCafé da Manhã");
    exibirMenu(cafeDaManhaMenu.criarIterator());
  }

  public void exibirMenu(Iterator iterator){
    MenuItem item = (MenuItem) iterator.next();
    while (iterator.hasNext()) {
      MenuItem type = (MenuItem) iterator.next();
      System.out.println(type.getNome());
      System.out.println(type.getDescricao());
      System.out.println(type.getValor());
      System.out.println("------");
      
    }
  }
  
  
}
