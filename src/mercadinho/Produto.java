package mercadinho;

public class Produto {
	private String ID;
	private String Nome;
	private String Fabricante;
	
	public Produto(String nome, String fabricante) {
		Nome = nome;
		Fabricante = fabricante;
	}
	
	public String getID() {
		return ID;
	}

	public String getNome() {
		return Nome;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public String toString() {
		return "";
	}
}