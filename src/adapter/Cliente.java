package adapter;


public class Cliente {

  public static void main(String[] args) {

      Peru peru = new PeruAfricano();
      Pato patoAdapter = new Adapter(peru);
      
      patoAdapter.grasna();
      patoAdapter.voar();
  }

}
