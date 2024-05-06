package br.ufrn.imd.controle;

import br.ufrn.imd.modelo.Pessoa;

public class GeradorImpostoRenda extends Pessoa{
	private double totalTributo;
	
	public double calculaValorTotalTributo(Pessoa p) {
		double tributos = 0;
		double t_salario = getSalario()*0.11;
		double t_conta = conta.getSaldo()*0.38;
		double t_seguroVida = 31.50;
		
		tributos = t_salario + t_conta + t_seguroVida;
		
		setTotalTributo(tributos);
		
		return tributos;
	}

	public double getTotalTributo() {
		return totalTributo;
	}

	public void setTotalTributo(double totalTributo) {
		this.totalTributo = totalTributo;
	}
	
}
