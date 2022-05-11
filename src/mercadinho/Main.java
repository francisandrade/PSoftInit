package mercadinho;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		
		System.out.println(produto);
		System.out.println(lote);
	}
}
