package command;

import javax.xml.ws.Endpoint;

public class Cliente {

  public static void main(String[] args) {

    Endpoint.publish("http://localhost:8080/Patterns/RemoteLoader", new RemoteLoaderWS());
    
  }

  // Luz luz = new Luz("");
  // Portao portao = new Portao();
  //
  // LuzApagarCommand apagarCommand = new LuzApagarCommand(luz);
  // PortaoAbrirCommand portaoAbrirCommand = new PortaoAbrirCommand(portao);
  // PortaoFecharCommand portaoFecharCommand = new PortaoFecharCommand(portao);
  //
  // ControleRemotoInvocador controleRemotoInvocador = new ControleRemotoInvocador();
  //
  // controleRemotoInvocador.setCommand(apagarCommand);
  // controleRemotoInvocador.pressionarBotao();
  //
  // controleRemotoInvocador.setCommand(portaoAbrirCommand);
  // controleRemotoInvocador.pressionarBotao();
  //
  // controleRemotoInvocador.setCommand(portaoFecharCommand);
  // controleRemotoInvocador.pressionarBotao();

//  }

  // Duplicação inútil
  public void testar() {

    Luz luz = new Luz("");
    Portao portao = new Portao();

    LuzApagarCommand apagarCommand = new LuzApagarCommand(luz);
    PortaoAbrirCommand portaoAbrirCommand = new PortaoAbrirCommand(portao);
    PortaoFecharCommand portaoFecharCommand = new PortaoFecharCommand(portao);

    ControleRemotoInvocador controleRemotoInvocador = new ControleRemotoInvocador();
    controleRemotoInvocador.setCommand(apagarCommand);
    controleRemotoInvocador.pressionarBotao();
    controleRemotoInvocador.setCommand(portaoAbrirCommand);
    controleRemotoInvocador.pressionarBotao();
    controleRemotoInvocador.setCommand(portaoFecharCommand);
    controleRemotoInvocador.pressionarBotao();

  }

}
