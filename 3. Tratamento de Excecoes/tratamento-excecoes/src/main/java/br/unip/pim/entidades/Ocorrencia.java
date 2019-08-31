package br.unip.pim.entidades;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ocorrencia {
	
	private String titulo;
	private String descricao;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Veiculo veiculo;
	private Usuario usuario;
	
}
