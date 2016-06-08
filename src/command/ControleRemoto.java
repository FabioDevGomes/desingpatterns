package command;

public class ControleRemoto {

  Command[] onCommand;
  Command[] offCommand;
  Command undoCommand;

  public ControleRemoto() {
    onCommand = new Command[7]; // ponto importante: declaração do tipo da interface
    offCommand = new Command[7];// para ser compatível no setCommand()

    Command noCommand = new NoCommand();
    for (int i = 0; i < offCommand.length; i++) {
      onCommand[i] = noCommand;
      offCommand[i] = noCommand;
    }
  }

  public void setCommand(int indice, Command onCommand, Command offCommand) {
    this.onCommand[indice] = onCommand;
    this.offCommand[indice] = offCommand;
  }

  public void pressionarBotaoLigar(int indice) {
    onCommand[indice].execute();
    undoCommand = onCommand[indice];
  }

  public void pressionarBotaoDesligar(int indice) {
    offCommand[indice].execute();
    undoCommand = offCommand[indice];
  }

  public void undo() {
    undoCommand.undo();
  }

}
