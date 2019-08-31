package br.unip.pim.excecoes;

public class NegocioRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioRuntimeException(String mensagem) {
		super(mensagem);
	}
}
