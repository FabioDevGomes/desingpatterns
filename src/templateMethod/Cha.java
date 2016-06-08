package templateMethod;


public class Cha extends BedidaCafeinada {
  
  @Override
  void infusao() {
    System.out.println("adicionar pacotinho de chá na água");
    
  }

  @Override
  void adicionarCondimentos() {
    System.out.println("adicionar limão");
    
  }

}
