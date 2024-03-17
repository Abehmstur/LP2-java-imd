package aula05.modelo;

public class Aluno {
	
	private String nome;
	private Prova prova1;
	private Prova prova2;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Prova getProva1() {
		return prova1;
	}

	public void setProva1(Prova prova1) {
		this.prova1 = prova1;
	}

	public Prova getProva2() {
		return prova2;
	}

	public void setProva2(Prova prova2) {
		this.prova2 = prova2;
	}

	public Aluno(){
		nome = "Nome Default";
	}
	
	public double calculaMedia() {
		double media = 0.0;
		double soma = 0.0;
		
		soma = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
		media = soma/2;
		
		return media;
		
	}
}
