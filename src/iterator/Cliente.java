package iterator;


public class Cliente {

  public static void main(String[] args) {
    JantarMenu jantarMenu = new JantarMenu();
    CafeDaManhaMenu cafeDaManhaMenu = new CafeDaManhaMenu();
    
    Garconete garconete = new Garconete(jantarMenu, cafeDaManhaMenu);
    garconete.exibirMenu();

  }

}
