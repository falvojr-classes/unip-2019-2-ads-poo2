import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Leiloeiro leiloeiro = new Leiloeiro();
		leiloeiro.setNome("Fulano");
		
		Item item1 = new Item();
		item1.setNome("Celular");
		
		Item item2 = new Item();
		item2.setNome("Caneta");
		
		List<Item> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		
		Leilao leilao = new Leilao(leiloeiro, itens);
		leilao.iniciar();
		
		Lance lance1 = new Lance();
		lance1.setValor(10);

		Lance lance2 = new Lance();
		lance2.setValor(50);
		
		leilao.incluirLance(lance1);
		leilao.incluirLance(lance2);
		
		leilao.finalizar();
	}

}
