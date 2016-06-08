package observer;


public class Cliente {

  public static void main(String[] args) {
    
    DadosClima sujeito = new DadosClima();
    
    new CondicoesAtuais(sujeito);
    
    sujeito.setDadosClima(36, 10, 50);
    
  }
}
