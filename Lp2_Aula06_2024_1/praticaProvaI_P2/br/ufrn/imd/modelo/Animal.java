package br.ufrn.imd.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Animal {
	protected String nome;
	protected Date dataNascimento;
	protected int peso;
	protected boolean alimentado;
	protected String alimentacao;
	protected int quantidadeAlimento;
	
	public Animal() {
		this.setAlimentado(false);
	}
	
	public void comer() {
		System.out.println("******************************************************");
		System.out.println("Animal "+ this.getNome() +" se alimentou de: " + this.getPeso()*0.05 + " quilos.");
		System.out.println("******************************************************");
		this.setAlimentado(true);
		this.quantidadeAlimento += this.getPeso()*0.05;
	}
	
	public void calcularQtdSeAlimentado() {
		System.out.println("Comeu: " + this.quantidadeAlimento += this.getPeso()*0.05);
	}
	
	public int calcularIdade(Animal a) {
        Calendar dataNasc = new GregorianCalendar();

        dataNasc.setTime(a.getDataNascimento());

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        dataNasc.add(Calendar.YEAR, idade);

        if (hoje.before(dataNasc)) {

            idade--;

        }
		return idade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isAlimentado() {
		return alimentado;
	}

	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public int getQuantidadeAlimento() {
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
	
}
