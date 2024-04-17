package pratica170424AbstracticImplements.br.ufrn.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	protected String nome;
	protected Date dataNascimento;
	protected double peso;
	protected double altura;
	
	public abstract String calcularIMC();
		
	public String toString() {
		
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(this.dataNascimento);
		String str = "";
	    str = ("\nNome: " + this.nome + "\nData de Nascimento: " + dataFormatada
	    		+ "\nPeso: " + this.peso + "\nAltura: " + this.altura);
		return str;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}


