package command;

import javax.jws.WebService;

@WebService
public class RemoteLoaderWS {

  public void pressionarBotoes() {
    ControleRemoto controleRemoto = new ControleRemoto();
    
    Luz luz = new Luz("Sala");
    Portao portao = new Portao();
    
    LuzApagarCommand luzApagarCommand = new LuzApagarCommand(luz);
    LuzLigarCommand luzLigarCommand = new LuzLigarCommand(luz);
    
    PortaoAbrirCommand portaoAbrirCommand = new PortaoAbrirCommand(portao);
    PortaoFecharCommand portaoFecharCommand = new PortaoFecharCommand(portao);
    
    Command[] comandos = {luzApagarCommand, portaoAbrirCommand};
    ModoFesta modoFesta = new ModoFesta(comandos);

    controleRemoto.setCommand(0, luzLigarCommand, luzApagarCommand);
    controleRemoto.setCommand(1, portaoAbrirCommand, portaoFecharCommand);
    controleRemoto.setCommand(2, modoFesta, modoFesta);
    
    controleRemoto.pressionarBotaoLigar(2);
//    controleRemoto.pressionarBotaoDesligar(0);
//    controleRemoto.pressionarBotaoLigar(1);
//    controleRemoto.pressionarBotaoDesligar(1);

  }

}
