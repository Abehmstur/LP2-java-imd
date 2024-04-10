package br.ufrn.imd.modelo;

import java.util.Date;

public class ProfessorIntegral extends Professor{
	private Date dataInicio;

	
	public ProfessorIntegral() {
		
	}
	
	public double calcularSalario(double salario) {
		double total = 0.0;
		//40 h de atividades semanais
		setSalario(salario);
		
		return total = salario;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	
}
