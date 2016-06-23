package padroesCompostos;


public class QuackCounter implements Quackable{
  Quackable duck;
  private static int numberOfQuack;
  
  public QuackCounter(Quackable duck) {
    super();
    this.duck = duck;
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuack++;
  }
  
  public static int getQuacks(){
    return numberOfQuack;
  }

}
