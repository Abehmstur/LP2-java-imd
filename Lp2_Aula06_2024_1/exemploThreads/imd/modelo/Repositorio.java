package imd.modelo;

import java.util.ArrayList;

public class Repositorio {
	
	private ArrayList<Lebre> lebres;
	private static Repositorio rDao;
	
	public Repositorio() {
		lebres = new ArrayList<Lebre>();
	}
	
	public static Repositorio getInstance() {
		if (rDao == null) {
			rDao = new Repositorio();
		}
		return rDao;
	}
	
	public void addLebre(Lebre e) {
		lebres.add(e);
		System.out.println("Lebre: " + e.getNome() + " incluida");
		//System.out.println(lebres.size());
	}

	public void listarOrdemChegada() {
		System.out.println("------------- Ordem de Chegada -------------------------");
		for (Lebre lebre : lebres) {
			System.out.println("Lebre: " + lebre.getNome() 
			+ " - Distancia: " + lebre.getDistancia());
		}
		System.out.println("--------------------------------------------------------");
	}
}
