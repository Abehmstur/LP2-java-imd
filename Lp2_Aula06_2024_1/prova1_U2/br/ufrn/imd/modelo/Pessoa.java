package br.ufrn.imd.modelo;

public class Pessoa implements ITributavel{
	protected String nome;
	protected double salario;
	protected ContaCorrente conta;
	protected SeguroVida seguro;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public SeguroVida getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
	
	@Override
	public double calcularTributos() {
		double tributos = 0;
		double t_salario = getSalario()*0.11;
		double t_conta = conta.getSaldo()*0.38;
		double t_seguroVida = 31.50;
		
		tributos = t_salario + t_conta + t_seguroVida;
		
		return tributos;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", salario=" + salario + ", \nAgencia=" + conta.getAgencia() + "Conta=" + conta.getNumero() + ", \nSeguro=" + seguro.getNumero() 
		+ "      Beneficiario: " + seguro.getBeneficiado() + "\nValor SEguro: " + seguro.getValor();
	}
	
	public Pessoa(){
		
	}

//	public static void main(String[] args) {
//		Pessoa p = new Pessoa();
//		p.setSalario(100);
//		System.out.println(p.getSalario());
//		System.out.println(p.calcularTributos());
//		String s1 = p.toString();
//		System.out.println(s1);
//	}

}
