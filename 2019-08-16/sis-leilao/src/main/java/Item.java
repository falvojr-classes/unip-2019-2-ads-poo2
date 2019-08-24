import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
	
	private String nome;
	private double lanceMinimo;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private List<Lance> lances = new ArrayList<>();

	public void incluirLance(Lance lance) {
		if (lance.getValor() >= this.lanceMinimo) {
			String cpf = lance.getParticipante().getCpf();
			try {
				new CPFValidator().assertValid(cpf);
				this.lances.add(lance);
			} catch (InvalidStateException e) {
				String msg = String.format("Lance não efetivado, %s inválido!", cpf);
				System.err.println(msg);
			}
		} else {
			String msg = String.format("Lance não efetivado, %.2f menor que %.2f!", lance.getValor(), this.lanceMinimo);
			System.err.println(msg);
		}
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
	
}
