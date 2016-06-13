package composite;


public class Waitress {
  
  MenuComposite allMenus;

  public Waitress(MenuComposite allMenus) {
    this.allMenus = allMenus;
  }
  
  public void printMenu(){
    allMenus.print();
  }

}
