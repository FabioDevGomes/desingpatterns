package state;


public class MaquinaTestDrive {

  public static void main(String[] args) {
    MaqinaGomaDeMascar maqinaGomaDeMascar = new MaqinaGomaDeMascar(6);
    
    System.out.println(maqinaGomaDeMascar);
    
    maqinaGomaDeMascar.inserirMoeda();
    
    maqinaGomaDeMascar.acionarAlavanca();

    maqinaGomaDeMascar.inserirMoeda();
//    maqinaGomaDeMascar.ejetarMoeda();
    maqinaGomaDeMascar.acionarAlavanca();

//    maqinaGomaDeMascar.inserirMoeda();
//    maqinaGomaDeMascar.inserirMoeda();
//    maqinaGomaDeMascar.acionarAlavanca();
//    
//    maqinaGomaDeMascar.inserirMoeda();
//    maqinaGomaDeMascar.acionarAlavanca();
//    
//    maqinaGomaDeMascar.inserirMoeda();
//    maqinaGomaDeMascar.acionarAlavanca();
//
//    System.out.println(maqinaGomaDeMascar);
//    
//    maqinaGomaDeMascar.recarregarGomas(10);

    System.out.println(maqinaGomaDeMascar);
  }

}
