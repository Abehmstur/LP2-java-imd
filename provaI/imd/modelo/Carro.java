package imd.modelo;

public class Carro extends Veiculo{
	private int qtdPortas;
	
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public Carro() {
		
	}
	
	public void listaCarro() {
		System.out.printf("Carro: %s Placa: %s Motor: %.2f Portas: %d", getMarca(), getPlaca(), getMotor(), getQtdPortas());
	}
	
}
