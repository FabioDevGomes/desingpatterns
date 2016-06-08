package command;

//Invocador
public class ControleRemotoInvocador {

  Command command;
  
  public void setCommand(Command command){
    this.command = command;
  }
  
  public void pressionarBotao(){
    command.execute();
  }
  
}
