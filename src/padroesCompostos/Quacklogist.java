package padroesCompostos;


public class Quacklogist implements Observer{

  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologista: "+ duck +" acabou de quackar");
    
  }

}
