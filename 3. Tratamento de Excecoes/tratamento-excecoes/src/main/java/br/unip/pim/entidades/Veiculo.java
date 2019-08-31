package br.unip.pim.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private Integer ano;
	private TipoVeiculo tipo;
	
}
