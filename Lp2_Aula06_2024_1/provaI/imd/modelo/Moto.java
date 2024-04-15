package imd.modelo;

public class Moto extends Veiculo{
	private String partida;
	
	public Moto() {
		
	}
	
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	
	public void listaMoto() {
		System.out.printf("Moto: %s Placa: %s Motor: %.2f Partida: %s", getMarca(), getPlaca(), getMotor(), getPartida());
	}
	
}
