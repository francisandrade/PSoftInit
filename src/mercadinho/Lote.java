package mercadinho;

public class Lote {
	private String ID;
	private Produto produto;
	private String dataFabricacao;
	private String dataVencimento;
	private int quantidade;
	
	public Lote(Produto produto, String dataFabricacao, String dataVencimento, int quantidade) {
		this.produto = produto;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public String getID() {
		return ID;
	}

	public Produto getProduto() {
		return produto;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "";
	}
}
