
public class Estoque {

	String nome = "Estoque da princesa";
	private int quantodade = 10;
	
	public void comprar(){
		System.out.println("Compra para o estoque: " + nome + " \nQuantidade em estoque: "+ quantodade);
	}

	public void vender(){
		System.out.println("Baixa no estoque: " + nome + " \nQuantidade em estoque: "+ quantodade);
	}
}
