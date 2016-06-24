package padroesCompostos;


public class QuackCounter implements Quackable{
  Quackable duck;
  private static int numberOfQuack;
  Observable observable;
  
  public QuackCounter(Quackable duck) {
    super();
    this.duck = duck;
    observable  = new Observable(this);
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuack++;
  }
  
  public static int getQuacks(){
    return numberOfQuack;
  }

  @Override
  public void registerObserver(Observer observer) {
//    observable.registerObserver(observer);
    
  }

  @Override
  public void notifyObservers() {
//    observable.notifyObservers();
    
  }

}
