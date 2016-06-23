package padroesCompostos;

import java.util.ArrayList;
import java.util.Iterator;

//Composite
public class Bando implements Quackable{
  ArrayList<Quackable> quackers = new ArrayList<>();
  
  public void add(Quackable quackable){
    quackers.add(quackable);
  }
  
  @Override
  public void quack() {
    //Iterator
    Iterator iterator = quackers.iterator();
    while (iterator.hasNext()) {
      Quackable quacker = (Quackable) iterator.next();
      quacker.quack();
    }
  }

}
