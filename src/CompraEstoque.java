
public class CompraEstoque implements Command{

	private Estoque estoque;
	
	public CompraEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	@Override
	public void execute() {
		estoque.comprar();
	}
	
}
