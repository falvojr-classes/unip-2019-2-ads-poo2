package np1;

public class Main {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
		motor1.setTipo("1.0");
		Motor motor2 = new Motor();
		motor2.setTipo("2.0 TSI");
		
		Carro carro1 = new Carro(motor1);
		Carro carro2 = new Carro(motor2);
		
		carro1.ligar();
		carro1.acelerar();
		
		carro2.ligar();
		carro2.acelerar(100D);
		
		double velocidadeCarro1 = carro1.getVelocidadeAtual();		
		double velocidadeCarro2 = carro2.getVelocidadeAtual();
		
		System.out.printf("Carro 1: %.2f\n", velocidadeCarro1);
		System.out.println("Carro 2: " + velocidadeCarro2);
	}

}
