package br.ufrn.imd.modelo;

public class Moto extends Veiculo implements ICarbonFootprint{
	private int cilindrada;
	
	public Moto() {
		this.cilindrada = 0;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public double getCarbonFootprint() {
// 		Requisitos
//		i. cilindradas acima de 650 (carbono = KmMes * 0.65);
//		ii. cilindradas abaixo de 150 (carbono = KmMes * 0.20)
//		iii. outras cilindradas (carbono = KmMes * 0.50).
		
		if( this.cilindrada > 650 ) {
			return (this.quilometragemMensal*0.65);
		} else if( this.cilindrada < 150 ) {
			return (this.quilometragemMensal*0.20);
		} else {
			return (this.quilometragemMensal*0.50);
		}
	}
	
}
