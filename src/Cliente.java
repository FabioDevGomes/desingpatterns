
public class Cliente {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		CompraEstoque compraEstoque = new CompraEstoque(estoque);
		
		Pedidos pedidos = new Pedidos();
		pedidos.addPedido(compraEstoque);
		
		pedidos.executarPedidos();

	}

}
