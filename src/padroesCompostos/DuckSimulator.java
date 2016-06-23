package padroesCompostos;


public class DuckSimulator {

  public static void main(String[] args) {
     DuckSimulator duckSimulator = new DuckSimulator();
     AbstractDuckFactory duckFactory = new CountDuckFactory();
     duckSimulator.simulate(duckFactory);
  }
  
  void simulate(AbstractDuckFactory duckFactory){
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redHeadDuck = duckFactory.createRedHeadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    Bando bando = new Bando();
//    bando.add(mallardDuck);
    bando.add(redHeadDuck);
    bando.add(duckCall);
    bando.add(rubberDuck);
    bando.add(gooseDuck);

    Bando bandoDeMallardDucks = new Bando();
    
    Quackable mallardDuckOne = duckFactory.createMallardDuck();
    Quackable mallardDuckTwo = duckFactory.createMallardDuck();
    Quackable mallardDuckThree = duckFactory.createMallardDuck();
    Quackable mallardDuckFour = duckFactory.createMallardDuck();
    
    bandoDeMallardDucks.add(mallardDuckOne);
    bandoDeMallardDucks.add(mallardDuckTwo);
    bandoDeMallardDucks.add(mallardDuckThree);
    bandoDeMallardDucks.add(mallardDuckFour);
    
    bando.add(bandoDeMallardDucks);
    
    
    System.out.println("== Duck Simulator / Bando ==");
    simulate(bando);
    
    System.out.println("== Duck Simulator / Bando de Mallarduks ==");
    simulate(bandoDeMallardDucks);
    
    
    
    System.out.println("A quantidade de quaks é: "+QuackCounter.getQuacks());
  }
  
  void simulate(Quackable duck){
    duck.quack();
  }
}
