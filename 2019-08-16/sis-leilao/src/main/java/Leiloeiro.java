
public class Leiloeiro extends Pessoa {

	public void iniciar(Leilao leilao) {
		leilao.setLeiloeiro(this);
		leilao.iniciar();
	}

	public void finalizar(Leilao leilao) {
		leilao.finalizar();
	}
}
