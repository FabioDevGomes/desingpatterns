package decorator;


public class Cliente {
  
  public static void main(String[] args) {
    Bebida bebida = new CafeComun();
    bebida = new Chocolate(bebida);
    bebida = new Leite(bebida);
    
    System.out.println(bebida.getDescricao());
    System.out.println(bebida.valor());
    
  }

}
