package command;


public class NoCommand implements Command{

  @Override
  public void execute() {
    System.out.println("Sem comando registrado para esse slot");
    
  }

  @Override
  public void undo() {
    System.out.println("Sem comando UNDO registrado no momento");
    // TODO Auto-generated method stub
    
  }

}
