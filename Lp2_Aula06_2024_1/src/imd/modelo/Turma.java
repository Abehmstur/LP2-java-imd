package imd.modelo;

import java.util.ArrayList;

public class Turma {
	
	private ArrayList<Aluno> alunos;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void inserirAluno(Aluno a)  {
		alunos.add(a);
		System.out.println("Aluno inserido com sucesso!!");
	}
	
	public void calcularMediaTurma() {
		System.out.println("------------------------------------------------");
		String output = "";
		
		double mediaTurma = 0;
		for (Aluno a : alunos) {
			mediaTurma += a.calculaMedia();
		}
		mediaTurma = mediaTurma / alunos.size();
		output += "Media da Turma => " + mediaTurma + "\n";
		output += "------------------------------------------------\n";
		System.out.println(output);
	}
}
