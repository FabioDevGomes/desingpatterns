package templateMethod;


public class Cafe extends BedidaCafeinada{

  @Override
  void infusao() {
    System.out.println("adicionar caf� na �gua");
    
  }

  @Override
  void adicionarCondimentos() {
    System.out.println("adicionar a�ucar e leite");
    
  }

}
