package br.unip.pim;

import br.unip.pim.entidades.Usuario;
import br.unip.pim.excecoes.NegocioException;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		try {
			usuario.validarCpfComTratamentoObrigatorio();
		} catch (NegocioException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Erro inesperado!");
		}
		usuario.validarCpfComTratamentoOpcional();
	}
}
