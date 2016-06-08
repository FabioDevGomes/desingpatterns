package command;


public class ModoFesta implements Command{
  
  Command[] comandos;
  
  public ModoFesta(Command[] comandos) {
    this.comandos = comandos; 
  }

  @Override
  public void execute() {
    for (int i = 0; i < comandos.length; i++) {
      comandos[i].execute();
    }
  }

  @Override
  public void undo() {
    for (int i = 0; i < comandos.length; i++) {
      comandos[i].undo(); 
    }
  }
}
