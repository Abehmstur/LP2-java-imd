package br.ufrn.imd.modelo;

public class Taxi extends Veiculo implements ICarbonFootprint{
	private int quantidadeDePessoas;
	
	public Taxi() {
		this.quantidadeDePessoas = 0;
	}

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}
	
	@Override
	public double getCarbonFootprint() {
// 		Requisitos
//		i. carbono = KmMes * 1.10.

		return (this.quilometragemMensal * 1.10);
	}
	
}
