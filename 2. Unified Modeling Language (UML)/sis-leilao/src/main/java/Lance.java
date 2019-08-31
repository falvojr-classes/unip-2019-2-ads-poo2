import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lance {
	
	private Participante participante;
	private double valor;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Nome: %s", participante.getNome()));
		sb.append(System.lineSeparator());
		sb.append(String.format("CPF: %s", participante.getCpf()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Valor: R$%.2f", valor));
		sb.append(System.lineSeparator());
		return sb.toString();
	}
}
