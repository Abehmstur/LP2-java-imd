package imd.modelo;

public class Veiculo {
	protected String marca;
	protected String placa;
	protected double quilometragem;
	protected double valorDoAluguel;
	protected boolean isAlugado = false;
	protected double motor;

	public Veiculo() {
		
	}
	
	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public boolean isAlugado() {
		return isAlugado;
	}

	public void setAlugado(boolean isAlugado) {
		this.isAlugado = isAlugado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getValorDoAluguel() {
		return valorDoAluguel;
	}

	public void setValorDoAluguel(double valorDoAluguel) {
		this.valorDoAluguel = valorDoAluguel;
	}
	
	public void calcularAluguel() {
		double total = 0;
		total += this.valorDoAluguel;
		System.out.printf("Valor total dos alugueis: %.2f", total);
	}
	
}
