package aula05.modelo;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos;
	private String nomeDaTurma;
	
	public String getNomeDaTurma() {
		return nomeDaTurma;
	}

	public void setNomeDaTurma(String nomeDaTurma) {
		this.nomeDaTurma = nomeDaTurma;
	}

	public Turma(){
		alunos = new ArrayList<Aluno>();
		nomeDaTurma = "Nome Default";
	}
	
	public int qtdAlunosTurma() {
		return alunos.size();
	}
	
	public void inserirAlunoTurma(Aluno a) {
		alunos.add(a);
		System.out.println("Aluno: " + a.getNome() +" inserido com sucesso!!");
	}
	
	public void calcularMedia() {
		System.out.println("-------------------------------");
		String output = "";
		double media = 0.0;
		double soma = 0.0;
		
		for (Aluno aluno : alunos) {
			soma += aluno.calculaMedia();
		}
		
		media = soma/qtdAlunosTurma();
		System.out.printf("Media da turma => %.2f", media);
		output += "\n";
		output += "------------------------------------------------\n";
		System.out.println(output);
	}
}
