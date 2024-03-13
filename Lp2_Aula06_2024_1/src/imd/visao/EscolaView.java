package imd.visao;

import imd.modelo.Aluno;
import imd.modelo.Prova;
import imd.modelo.Turma;

public class EscolaView {

	public static void main(String[] args) {
		
		Prova p1 = new Prova();
		p1.setNotaParte1(3.0);
		p1.setNotaParte2(3.5);
		System.out.println("Nota total p1 => " + p1.calcularNotaTotal());
		
		Prova p2 = new Prova();
		p2.setNotaParte1(4.0);
		p2.setNotaParte2(4.0);
		System.out.println("Nota total p2 => " + p2.calcularNotaTotal());
		
		Prova p3 = new Prova();
		p3.setNotaParte1(4.5);
		p3.setNotaParte2(5.0);
		System.out.println("Nota total p3 => " + p3.calcularNotaTotal());
		
		Prova p4 = new Prova();
		p4.setNotaParte1(1.0);
		p4.setNotaParte2(2.0);
		System.out.println("Nota total p4 => " + p4.calcularNotaTotal());
		
		Prova p5 = new Prova();
		p5.setNotaParte1(5.0);
		p5.setNotaParte2(2.5);
		System.out.println("Nota total p5 => " + p5.calcularNotaTotal());
		
		Prova p6 = new Prova();
		p6.setNotaParte1(4.5);
		p6.setNotaParte2(4.5);
		System.out.println("Nota total p6 => " + p6.calcularNotaTotal());
		
		Prova p7 = new Prova();
		p7.setNotaParte1(1.5);
		p7.setNotaParte2(3.0);
		System.out.println("Nota total p7 => " + p7.calcularNotaTotal());
		
		Prova p8 = new Prova();
		p8.setNotaParte1(3.5);
		p8.setNotaParte2(3.0);
		System.out.println("Nota total p8 => " + p8.calcularNotaTotal());
			
		System.out.println("");
		Aluno a1 = new Aluno();
		a1.setProva1(p1);
		a1.setProva2(p2);
		System.out.println("Media Aluno1 => " + a1.calculaMedia());
		
		Aluno a2 = new Aluno();
		a2.setProva1(p3);
		a2.setProva2(p4);
		System.out.println("Media Aluno2 => " + a2.calculaMedia());
		
		Aluno a3 = new Aluno();
		a3.setProva1(p5);
		a3.setProva2(p6);
		System.out.println("Media Aluno3 => " + a3.calculaMedia());
		
		Aluno a4 = new Aluno();
		a4.setProva1(p7);
		a4.setProva2(p8);
		System.out.println("Media Aluno4 => " + a4.calculaMedia());
		
		System.out.println("");
		Turma t1 = new Turma();
		t1.inserirAluno(a1);
		t1.inserirAluno(a2);
		t1.inserirAluno(a3);
		t1.inserirAluno(a4);
		
		t1.calcularMediaTurma();
	}
}
