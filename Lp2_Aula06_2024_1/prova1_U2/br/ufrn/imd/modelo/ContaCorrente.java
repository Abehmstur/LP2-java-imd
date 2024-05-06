package br.ufrn.imd.modelo;

public class ContaCorrente {
	private String agencia;
	private String numero;
	private double saldo;
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		boolean sacou = false;
		double novoValor = 0;
		
		if(this.saldo >= valor) {
			sacou = true;
			novoValor = this.saldo - valor;
			System.out.println("\nSaque de " + valor + "em" + this.getNumero() + " efetuado com sucesso!");
			if(novoValor >= 0) {
				setSaldo(novoValor);
			}
		} else {
			System.out.println("Saldo Insuficiente.");
		}
		
		return sacou;
	}
	
	public boolean depositar(double valor) {
		boolean depositou = false;
		double novoValor = 0;
		
		if(valor > 0) {
			depositou = true;
			novoValor = this.saldo + valor;
			setSaldo(novoValor);
			System.out.println("\nDeposito de " + valor + "em" + this.getNumero() + " efetuado com sucesso!");
		} else {
			System.out.println("Informe um valor maior que zero.");
		}
		
		return depositou;
	}
	
	public boolean transferir(double valor, ContaCorrente cc) {
		boolean transferiu = false;
		double novoValor = 0;
		
		if( this.saldo >= valor) {
			transferiu = true;
			novoValor = this.saldo - valor;
			setSaldo(novoValor);
			
			double s = 0;
			s = cc.getSaldo();
			s = s+valor;
			cc.setSaldo(s);
			
			System.out.println("\nTransferido " + valor + "em" + cc.getNumero() + " efetuado com sucesso!");

		} else {
			System.out.println("Saldo Insuficiente.");
		}
		
		
		return transferiu;
	}
		
}
