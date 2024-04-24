package br.ufrn.imd.modelo;

public class Carro extends Veiculo implements ICarbonFootprint{
	private double motor;

	
	public Carro() {
		this.motor = 0;
	}
	
	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	@Override
	public double getCarbonFootprint() {
// 		Requisitos
//		i. motor acima de 2.0 (carbono = KmMes * 1.85);
//		ii. motor abaixo de 1.0 (carbono = KmMes * 0.13);
//		iii. outros motores (carbono = KmMes * 1.22).
		double carbono = 0;
		if(this.motor > 2) {
			carbono = (this.quilometragemMensal * 1.85);
		} else if(this.motor < 1 ) {
			carbono = (this.quilometragemMensal * 0.13);
		} else {
			carbono = (this.quilometragemMensal * 1.22);
		}
		
		return carbono;
	}
	
}
