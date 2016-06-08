package templateMethod;

public abstract class BedidaCafeinada {
  
  void preparar(){
    
  }
  
  final void ferverAgua(){
    System.out.println("fervendo; super class");
  }
  
  abstract void infusao();

  final void colocarNoCopo(){
    System.out.println("colocando no copo; super class");
  }

  abstract void adicionarCondimentos();
}
