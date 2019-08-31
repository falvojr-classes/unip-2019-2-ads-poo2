package br.unip.pim.excecoes;

import java.util.ArrayList;
import java.util.List;

public class NegocioException extends Exception {

	private static final long serialVersionUID = 1L;

	private List<String> mensagens = new ArrayList<>();
	
	public void adicionarMensagem(String mensagem) {
		this.mensagens.add(mensagem);
	}
	
	@Override
	public String getMessage() {
		return mensagens.toString();
	}
}
