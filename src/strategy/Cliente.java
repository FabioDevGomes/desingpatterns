package strategy;


public class Cliente {

  public static void main(String[] args) {
    
    Pato pato = new PatoComum();
    pato.iniciarVoo();
    pato.setVoo(new VooComFoguete());
    pato.iniciarVoo();
    
    
  }
  
}
