package imd.modelo;

public class Prova {
	
	private double notaParte1;
	private double notaParte2;
	
	public Prova() {
		notaParte1 = 0.0;
		notaParte2 = 0.0;
	}

	public void setNotaParte1(double notaParte1) {
		if (notaParte1 <= 5 && notaParte1 >=0) {
			this.notaParte1 = notaParte1;
		}
		else {
			System.out.println("Nota parte 01 - invalida!");
		}
	}

	public void setNotaParte2(double notaParte2) {
		if (notaParte2 <= 5 && notaParte2 >=0) {
			this.notaParte2 = notaParte2;
		}
		else {
			System.out.println("Nota parte 02 - invalida!");
		}
	}
	
	public double calcularNotaTotal() {
		return (this.notaParte1 + this.notaParte2);
	}

}
