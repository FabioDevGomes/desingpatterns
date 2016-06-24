package padroesCompostos;


public class DuckCall implements Quackable{
  Observable observable;
  
  public DuckCall() {
    observable = new Observable(this);
  }
  
  @Override
  public void quack() {
    System.out.println("Kwack - apito");
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }

}
