package iterator;

public class JantarMenuIteratos implements Iterator {

  MenuItem[] itens;
  int posicao = 0;

  public JantarMenuIteratos(MenuItem[] itens) {
    this.itens = itens;
  }

  @Override
  public Object next() {
    MenuItem item = itens[posicao];
    posicao++;
    return item;
  }

  @Override
  public boolean hasNext() {
    if (posicao >= itens.length || itens[posicao] == null) {
      return false;
    } else {
      return true;
    }
  }

}
