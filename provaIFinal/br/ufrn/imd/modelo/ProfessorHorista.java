package br.ufrn.imd.modelo;

public class ProfessorHorista extends Professor{
	private int horasTrabalhadas;
	
	public ProfessorHorista() {
		
	}
	
	public double calcularSalario() {
		double total = 0.0;
		total = this.horasTrabalhadas*55;
		setSalario(total);
		
		return total;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
}
