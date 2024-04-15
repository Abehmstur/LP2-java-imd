package br.ufrn.imd.modelo;

import java.util.Date;

public class Professor {
	protected String nome;
	protected String matricula;
	protected Date dataNascimento;
	protected double salario;
	protected String nivelEscolaridade;
	protected String disciplina;	
	
	public Professor() {
		
	}
	
	public double calcularSalario(double salario) {
		double total = 0.0;
		setSalario(salario);
		
		return total = salario;
	}
	
	public int lecionarTurmas() {
		int qtd = 0;
		switch ("Nivel") {
		
		case "Mestrado": {
			
			break;
		}
		case "Doutorado": {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
		return qtd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNivelEscolaridade() {
		return nivelEscolaridade;
	}
	public void setNivelEscolaridade(String nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}
