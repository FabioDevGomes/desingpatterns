package command;

//Command
public class LuzLigarCommand implements Command{

  Luz luz;
  
  
  public LuzLigarCommand(Luz luz) {
    this.luz = luz;
  
  }
  
  @Override
  public void execute() {
    luz.ligar();
  }

  @Override
  public void undo() {
    luz.apagar();
  }

}
