package command;

//Command
public class PortaoFecharCommand implements Command{
  
  Portao portao;
  
  public PortaoFecharCommand(Portao portao) {
    this.portao = portao;
  }

  @Override
  public void execute() {
    portao.fechar();
  }

  @Override
  public void undo() {
    portao.abrir();
    
  }

}
