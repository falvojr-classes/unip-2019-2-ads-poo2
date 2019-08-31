package np1;

public class Carro {

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private Double velocidadeMaxima;
	private Motor motor;

	// Comando Getters e Setters (Shift + Alt + S, depois R)
	// Comando Formatar/Identar o código: Ctrl + Shift + F

	public Carro(Motor motor) {
		this.motor = motor;
	}
	
	public void ligar( ) {
		System.out.println("Carro ligado e pronto para acelerar");
	}
	
	public void acelerar(Double quantidade) {
		this.velocidadeAtual += quantidade;
	}
	
	public void acelerar() {
		this.acelerar(10D);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}	
}
