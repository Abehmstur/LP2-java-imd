package aula05.visao;
import aula05.modelo.Aluno;
import aula05.modelo.Turma;
import aula05.modelo.Prova;

public class EscolaVIEW {
	public static void main(String[] args) {
		Prova p1 = new Prova();
		p1.setNotaParte1(4);
		p1.setNotaParte2(5.5);
		System.out.printf("Nota p1: %.2f", p1.calcularNotaTotal());
		
		Prova p2 = new Prova();
		p2.setNotaParte1(6);
		p2.setNotaParte2(2);
		System.out.printf("Nota p2: %.2f", p2.calcularNotaTotal());


		Prova p3 = new Prova();
		p3.setNotaParte1(3);
		p3.setNotaParte2(3.3);
		System.out.printf("Nota p3: %.2f", p3.calcularNotaTotal());

		
		Prova p4 = new Prova();
		p4.setNotaParte1(2.2);
		p4.setNotaParte2(3.1);
		System.out.printf("Nota p4: %.2f", p4.calcularNotaTotal());
		
		Prova p5 = new Prova();
		p5.setNotaParte1(4);
		p5.setNotaParte2(4);
		System.out.printf("Nota p5: %.2f", p5.calcularNotaTotal());
		
		Prova p6 = new Prova();
		p6.setNotaParte1(8);
		p6.setNotaParte2(10);
		System.out.printf("Nota p6: %.2f", p6.calcularNotaTotal());

		System.out.println("");
		Aluno a1 = new Aluno();
		a1.setNome("Joao");
		a1.setProva1(p1);
		a1.setProva2(p2);
		System.out.printf("Aluno: %s tem a media: %.2f", a1.getNome(), a1.calculaMedia());
		
		System.out.println("");
		Aluno a2 = new Aluno();
		a2.setProva1(p3);
		a2.setProva2(p4);
		System.out.printf("Aluno: %s tem a media: %.2f", a2.getNome(), a2.calculaMedia());
		
		System.out.println("");
		Aluno a3 = new Aluno();
		a3.setNome("Maria");
		a3.setProva1(p5);
		a3.setProva2(p6);
		System.out.printf("Aluno: %s tem a media: %.2f \n", a3.getNome(), a3.calculaMedia());

		System.out.println("");
		Turma t1 = new Turma();
		t1.setNomeDaTurma("TURV-A");
		System.out.println("Turma: " + t1.getNomeDaTurma() + " criada com sucesso!");
		t1.inserirAlunoTurma(a1);
		t1.inserirAlunoTurma(a2);
		t1.inserirAlunoTurma(a3);
		
		System.out.println("A turma: " + t1.getNomeDaTurma() + " tem " + t1.qtdAlunosTurma() + " Alunos");
		t1.calcularMedia();

	}
}
