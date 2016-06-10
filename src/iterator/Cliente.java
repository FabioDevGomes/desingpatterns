package iterator;

import java.util.ArrayList;

public class Cliente {

  public static void main(String[] args) {
    JantarMenu jantarMenu = new JantarMenu();
    AlmocoMenu almocoMenu = new AlmocoMenu();
    CafeDaManhaMenu cafeDaManhaMenu = new CafeDaManhaMenu();
    
    ArrayList<Menu> menus = new ArrayList<>();
    menus.add(cafeDaManhaMenu);
    menus.add(almocoMenu);
    menus.add(jantarMenu);
    
    Garconete garconete = new Garconete(menus);
    garconete.exibirMenu();

  }

}
