package padroesCompostos;


public class DuckSimulator {

  public static void main(String[] args) {
     DuckSimulator duckSimulator = new DuckSimulator();
     duckSimulator.simulate();
  }
  
  void simulate(){
    Quackable mallardDuck = new MallardDuck();
    Quackable redHeadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new RubberDuck();
    
    System.out.println("Duck Simulator");
    
    simulate(mallardDuck);
    simulate(redHeadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
  }
  
  void simulate(Quackable duck){
    duck.quack();
  }
}
