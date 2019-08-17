import java.util.ArrayList;
import java.util.List;

public class Item {
	
	private String nome;
	private List<Lance> lances = new ArrayList<>();

	public void incluirLance(Lance lance) {
		this.lances.add(lance);
	}
	
	public Lance buscarLanceVencedor() {
		Lance maior = null;
		for (Lance lance : lances) {
			if (maior == null || lance.getValor() > maior.getValor()) {
				maior = lance;
			}
		}
		return maior;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

}
