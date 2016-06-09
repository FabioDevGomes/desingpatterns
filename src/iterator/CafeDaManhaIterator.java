package iterator;

import java.util.ArrayList;

public class CafeDaManhaIterator implements Iterator{

  ArrayList<MenuItem> itens;
  int index = 0;

  public CafeDaManhaIterator(ArrayList<MenuItem> itens) {
    super();
    this.itens = itens;
  }

  @Override
  public Object next() {
    MenuItem item = itens.get(index);
    index ++;
    return item;
  }

  @Override
  public boolean hasNext() {
    if(itens.size() == index){
      return false;
    }else{
      return true;
    }
  }
  
}
