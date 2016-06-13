package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComposite{

  ArrayList<MenuComposite> composites = new ArrayList<>();
  String name;
  String description;
  
  public Menu(String name, String description) {
    super();
    this.name = name;
    this.description = description;
  }
  
  @Override
  public void add(MenuComposite menuComposite) {
    composites.add(menuComposite);
  } 
  
  @Override
  public void remove(MenuComposite menuComposite) {
    composites.remove(menuComposite);
  }
  
  @Override
  public MenuComposite getChild(int i) {
    return composites.get(i);
  }
  
  @Override
  public String getName() {
    return name;
  }
  
  @Override
  public String getDescription() {
    return description;
  }
  
  @Override
  public void print() {
    System.out.print("\n"+ getName());
    System.out.println(", "+getDescription());
    System.out.println("---------------------");
    
    Iterator iterator = composites.iterator();
    while (iterator.hasNext()) {
      MenuComposite composite = (MenuComposite) iterator.next();
      composite.print();
    }
  }
  
  
  
}
