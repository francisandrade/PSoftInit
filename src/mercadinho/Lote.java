package mercadinho;
import java.util.Date;
import java.util.UUID;

public class Lote {
	private String id;
	private Produto produto;
	private Date dataFabricacao;
	private Date dataVencimento;
	private Long quantidade;
	
	public Lote(Produto produto, Long quantidade) {
		this.id = UUID.randomUUID().toString();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public String getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public Long getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "Lote ID: " + getId() + " - Produto: " + getProduto().getNome() + " - " + getQuantidade() + " itens";
	}
}
