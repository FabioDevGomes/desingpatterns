package command;

//Command
public class LuzApagarCommand implements Command{

  Luz luz;
  
  
  public LuzApagarCommand(Luz luz) {
    this.luz = luz;
  
  }
  
  @Override
  public void execute() {
    luz.apagar();
  }

  @Override
  public void undo() {
    luz.ligar();
    
  }

}
