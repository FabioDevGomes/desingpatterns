import java.util.ArrayList;
import java.util.List;


public class Pedidos {

	public List<Command> pedidos = new ArrayList<Command>();
	
	public void addPedido(Command command){
		pedidos.add(command);
	}
	
	public void executarPedidos(){
		for (Command command : pedidos) {
			command.execute();
		}
	}
	
}
