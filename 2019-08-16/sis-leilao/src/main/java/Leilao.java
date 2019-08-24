import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
			this.itemAtual.setInicio(LocalDateTime.now());
		} else {
			System.err.println("Não existem mais itens para leilão.");
		}
	}
	
	public void incluirLance(Lance lance) {
		this.itemAtual.incluirLance(lance);
	}
	
	public void finalizar() {
		this.itemAtual.setFim(LocalDateTime.now());
		Lance lanceVencedor = this.itemAtual.buscarLanceVencedor();
		if (lanceVencedor != null) {
			imprimirRecibo(lanceVencedor);
		} else {
			System.err.println("O Item não teve lances válidos.");
		}
	}

	private void imprimirRecibo(Lance lanceVencedor) {
		System.out.println("-----------CUPOM-----------");
		System.out.println(String.format("Item: %s", this.itemAtual.getNome()));
		
		DateTimeFormatter formatterPtBr = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss.SSS");
		String inicio = this.itemAtual.getInicio().format(formatterPtBr);
		String fim = this.itemAtual.getFim().format(formatterPtBr);
		System.out.println(String.format("Intervalo: %s a %s", inicio, fim));
		// Chama o toString da classe Lance implicitamente
		System.out.println(lanceVencedor);
	}
}
