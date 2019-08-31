import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Criando as "Pessoas" para o Leilão:
		
		Leiloeiro leiloeiro = new Leiloeiro();
		leiloeiro.setNome("Fulano");
		
		Participante lucas = new Participante();
		lucas.setNome("Lucas");
		lucas.setCpf("659.088.710-10");
		
		Participante bruno = new Participante();
		bruno.setNome("Bruno");
		bruno.setCpf("372.955.200-74");
		
		// Criar os Items para o Leilão:
		
		Item item1 = new Item();
		item1.setNome("Celular");
		item1.setLanceMinimo(50);
		
		Item item2 = new Item();
		item2.setNome("Caneta");
		
		// Adicionar os itens em uma lista:
		
		List<Item> itens = new ArrayList<>();
		itens.add(item1);
		itens.add(item2);
		
		// Criar o Leilão com o Leiloeiro e os Items
		
		Leilao leilao = new Leilao(leiloeiro, itens);
		
		// Iniciar o Leilão do primeiro Item (Celular):
		
		leilao.iniciar();
		
		// Realizar os lances para o Item atual:
		
		Lance lance1 = new Lance();
		lance1.setParticipante(lucas);
		lance1.setValor(10);
		leilao.incluirLance(lance1);

		Lance lance2 = new Lance();
		lance2.setParticipante(bruno);
		lance2.setValor(50);
		leilao.incluirLance(lance2);
		
		Lance lance3 = new Lance();
		lance3.setParticipante(lucas);
		lance3.setValor(51);
		leilao.incluirLance(lance3);
		
		// Finalizar o Leilão do item atual (Celular)
		
		leilao.finalizar();
		
		// Iniciar o Leilão do próximo Item (Caneta)
		
		leilao.iniciar();

		// Realizar os lances para o Item atual:
		
		Lance lance4 = new Lance();
		lance4.setParticipante(lucas);
		lance4.setValor(0.55);
		leilao.incluirLance(lance4);
		
		// Finalizar o Leilão do item atual (Caneta)
		
		leilao.finalizar();
		
		// Tentar iniciar o próximo item (erro)

		leilao.iniciar();
	}

}
