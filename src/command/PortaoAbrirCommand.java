package command;

//Command
public class PortaoAbrirCommand implements Command{
  
  Portao portao;
  
  public PortaoAbrirCommand(Portao portao) {
    this.portao = portao;
  }

  @Override
  public void execute() {
    portao.abrir();
  }

  @Override
  public void undo() {
    portao.fechar();
    
  }

}
