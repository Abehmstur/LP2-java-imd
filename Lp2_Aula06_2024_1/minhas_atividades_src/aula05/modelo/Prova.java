package aula05.modelo;

public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	public Prova(){
		notaParte1 = 0.0;
		notaParte2 = 0.0;
	}

	public double getNotaParte1() {
		return notaParte1;
	}

	public void setNotaParte1(double notaParte1) {
		this.notaParte1 = notaParte1;
	}

	public double getNotaParte2() {
		return notaParte2;
	}

	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}
	
	public double calcularNotaTotal() {
		double total = 0.0;
		
		total = this.notaParte1 + this.notaParte2;
		
		if(total >= 10 ) {
			total = 10;
		}
		
		return total;
	}
}
