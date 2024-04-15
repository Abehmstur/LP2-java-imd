package br.ufrn.imd.modelo;

public class Tigre extends Animal {
	private String tipoTigre;
	
	public Tigre() {
		
	}
	
	public void comer() {
		System.out.println("******************************************************");
		System.out.println("Tigre "+ this.getNome() +" se alimentou de: " + this.getPeso()*0.04 + " quilos.");
		System.out.println("******************************************************");
		this.setAlimentado(true);
	}

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
}
