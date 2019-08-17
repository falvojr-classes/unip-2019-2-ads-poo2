import java.util.List;

public class Leilao {

	private Leiloeiro leiloeiro;
	private List<Item> itens;
	private Item itemAtual;

	public Leilao(Leiloeiro leiloeiro, List<Item> itens) {
		super();
		this.leiloeiro = leiloeiro;
		this.itens = itens;
	}

	public void iniciar() {
		if (itens != null && !itens.isEmpty()) {
			this.itemAtual = itens.remove(0);
		} else {
			System.err.println("Não existem mais itens para leilão.");
		}
	}
	
	public void incluirLance(Lance lance) {
		this.itemAtual.incluirLance(lance);
	}
	
	public void finalizar() {
		Lance vencedor = this.itemAtual.buscarLanceVencedor();
		System.out.println(vencedor.getValor());
	}
	
	public Leiloeiro getLeiloeiro() {
		return leiloeiro;
	}

	public void setLeiloeiro(Leiloeiro leiloeiro) {
		this.leiloeiro = leiloeiro;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
