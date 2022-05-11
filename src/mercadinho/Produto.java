package mercadinho;
import java.util.UUID;

public class Produto {
	private String id;
	private String Nome;
	private String Fabricante;
	
	public Produto(String nome, String fabricante) {
		this.id = UUID.randomUUID().toString();
		Nome = nome;
		Fabricante = fabricante;
	}
	
	public String getID() {
		return id;
	}

	public String getNome() {
		return Nome;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public String toString() {
		return "Produto ID: " + getID() + " - Fabricante: " + getFabricante();
	}
}