package padroesCompostos;


public class GooseAdapter implements Quackable{
  private Goose goose;
  
  public GooseAdapter(Goose goose) {
    super();
    this.goose = goose;
  }

  @Override
  public void quack() {
    goose.honk();
  }

}
