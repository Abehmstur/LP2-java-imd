package br.ufrn.imd.repositorio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import br.ufrn.imd.modelo.Professor;
import br.ufrn.imd.modelo.ProfessorHorista;

public class Repositorio {
	private ArrayList<Professor> professores;
	private HashMap<String,String> map;
	
	public Repositorio() {
		professores = new ArrayList<Professor>();
		map = new HashMap<String,String>();
	}
	
	public void adicionarProfessor(Professor p) {
		professores.add(p);
		System.out.println("Professor adicionado com sucesso!");
	}
	
	public void listarProfessores() {
		System.out.println("**************Professores**************\n");
		for (Professor professor : professores) {
			System.out.println("Nome: " + professor.getNome() + "    Disciplina: " + professor.getDisciplina() + "   Turmas: " 
		+ " 4 temp"); //+ professor.lecionarTurmas()
			System.out.println("\n");
		}
		System.out.println("******************************************\n");
	}
	
	public void listarMaiorSalario() {
		System.out.println("************* Maior Salario *************");
		double maiorSalario = Integer.MIN_VALUE;
		String p = "Default";
		for (Professor professor : professores) {
			if (professor.getSalario() > maiorSalario) {
		        maiorSalario = professor.getSalario();
		        p = professor.getNome();
		    }				
		}
		System.out.printf("\nNome: %s \n Salario: %.2f", p, maiorSalario);
		System.out.println("\n***************************************");
	}
	
	public int calcularIdade(Professor p) {
        Calendar dataNasc = new GregorianCalendar();

        dataNasc.setTime(p.getDataNascimento());

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        dataNasc.add(Calendar.YEAR, idade);

        if (hoje.before(dataNasc)) {

            idade--;

        }
		return idade;
	}
	
	public void professorMaisJovem() {
		System.out.println("\n************* Professor Mais Jovem *************");
		int menorIdade = 10000000;
		Professor p = new Professor();
		for (Professor professor : professores) {
	            if (calcularIdade(professor) < menorIdade) {
	            	menorIdade = calcularIdade(professor);
	            	p.setNome(professor.getNome());
	            	p.setDataNascimento(professor.getDataNascimento());
	            }       
	    }
		System.out.println("\nNome: " + p.getNome() + "   Dt. Nascimento: " + p.getDataNascimento());
		System.out.println("\n***************************************\n");
		
	}
	
	public void totalSalariosPagosNaEscola() {
		System.out.println("\n************* Total Salarios Pagos *************");
		double totalSalarios = 0;
		for (Professor professor : professores) {
			totalSalarios += professor.getSalario();
		}
		System.out.println("\nTotal de Salarios Pagos: " + totalSalarios);
		System.out.println("\n***************************************");
	}
	
	public void qtdMediaHorasTrabHoristas() {
		System.out.println("\n** Qtd Horas Trabalhas Horistas **");
		double mediaHoras = 0;
		double soma = 0;
		int count = 0;
		for (Professor professor : professores) {
			if(professor instanceof ProfessorHorista) {
				soma += ((ProfessorHorista) professor).getHorasTrabalhadas();
				count++;
			}
		}
		mediaHoras = soma/count;
		System.out.println("Media Horas Trabalhadas dos Professores Horistas: " + mediaHoras);
		System.out.println("\n***************************************");
	}
	
	public void listarProfessoresLecionamMatematicaEPortugues() {
		System.out.println("\n** Professores que lecionam matematica e portugues **");
		for (Professor professor : professores) {
			if(map.containsKey(professor.getDisciplina())){
				if(professor.getDisciplina().equals("Matematica")) {
					map.put(professor.getDisciplina(), professor.getNome());
				}
				if(professor.getDisciplina().equals("Portugues")) {
					map.put(professor.getDisciplina(), professor.getNome());
				}
				System.out.println("\nNome: " + map.get(professor.getDisciplina()));
			}
		}
	}
	
	
}
