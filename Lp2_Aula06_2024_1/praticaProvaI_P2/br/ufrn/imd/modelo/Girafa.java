package br.ufrn.imd.modelo;

public class Girafa extends Animal {
	private int tamanhoLingua;
	
	public Girafa() {
		
	}
	
	public void comer() {
		System.out.println("******************************************************");
		System.out.println("Girafa "+ this.getNome() +" se alimentou de: " + this.getPeso()*0.1 + " quilos.");
		System.out.println("******************************************************");
		this.setAlimentado(true);
	}

	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}
	
}
