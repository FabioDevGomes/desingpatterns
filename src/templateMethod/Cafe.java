package templateMethod;


public class Cafe extends BedidaCafeinada{

  @Override
  void infusao() {
    System.out.println("adicionar café na água");
    
  }

  @Override
  void adicionarCondimentos() {
    System.out.println("adicionar açucar e leite");
    
  }

}
