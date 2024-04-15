package br.ufrn.imd.modelo;

public class Elefante extends Animal{
	private int tamanhoTroba;
	
	public Elefante() {
	}

	public void comer() {
		System.out.println("******************************************************");
		System.out.println("Elefante "+ this.getNome() +" se alimentou de: " + this.getPeso()*0.15 + " quilos.");
		System.out.println("******************************************************");
		this.setAlimentado(true);
	}
	
	public int getTamanhoTroba() {
		return tamanhoTroba;
	}

	public void setTamanhoTroba(int tamanhoTroba) {
		this.tamanhoTroba = tamanhoTroba;
	}
	
}
