package br.unip.pim.entidades;

import br.unip.pim.excecoes.NegocioException;
import br.unip.pim.excecoes.NegocioRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
	
	private String email;
	private String senha;
	private String cpf;
	private String telefone;
	private String logradouro;
	private String complemento;
	private String cep;
	private TipoUsuario tipo;
	
	public void validarCpfComTratamentoObrigatorio() throws Exception {
		if (cpf == null) {
			NegocioException erro = new NegocioException();
			erro.adicionarMensagem("CPF nulo.");
			erro.adicionarMensagem("CPF inválido.");
			throw erro;
		}
	}
	
	public void validarCpfComTratamentoOpcional() {
		if (cpf == null) {
			throw new NegocioRuntimeException("CPF nulo.");
		}
	}
}
