package padroesCompostos;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{

  static ArrayList observers = new ArrayList<>();
  QuackObservable duck;
  
  public Observable(QuackObservable duck) {
    super();
    this.duck = duck;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
    
  }

  @Override
  public void notifyObservers() {
    @SuppressWarnings("rawtypes")
    Iterator iterator = observers.iterator();
    while (iterator.hasNext()) {
      Observer observer = (Observer) iterator.next();
      observer.update(duck);
    }
  }

}
