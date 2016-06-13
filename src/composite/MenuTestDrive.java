package composite;


public class MenuTestDrive {

  public static void main(String[] args) {
    
    MenuComposite pancakeHoueseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComposite dinnerMenu = new Menu("DINNER MENU", "Breakfast");
    MenuComposite cafeMenu = new Menu("CAFE MENU", "Breakfast");
    MenuComposite dessertMenu = new Menu("--- DESSERT MENU", "Submenu de DINNER");
    
    MenuComposite allMenus = new Menu("ALL MENUS", "all");
    allMenus.add(pancakeHoueseMenu);
    allMenus.add(dinnerMenu);
    allMenus.add(cafeMenu);
    
    dinnerMenu.add(new MenuItem("Janta 1", "arroz", false, 15.66));
    dinnerMenu.add(new MenuItem("Janta 2", "feijão", false, 16.66));
    dinnerMenu.add(new MenuItem("Janta 3", "carne", false, 17.66));
    
    dinnerMenu.add(dessertMenu);
    
    dessertMenu.add(new MenuItem("- Sobremesa 1", "uvas", false, 5.66));
    dessertMenu.add(new MenuItem("- Sobremesa 2", "Maçãs", false, 6.66));
    dessertMenu.add(new MenuItem("- Sobremesa 3", "Bananas", false, 7.66));
  
    Waitress waitress = new Waitress(allMenus); 
    waitress.printMenu();

  }

}
