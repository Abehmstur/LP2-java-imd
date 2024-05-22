package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Lebre extends Thread{
	private int colocacao;
	private int salto;
	private int metro;

	public Lebre(String nome) {
		super(nome);
		this.colocacao = 0;
		this.salto = 0;
		this.metro = 0;
	}
	
	public void run(ArrayList<Lebre> lebres) throws InterruptedException {
		int chegou = 0;
		int n = 0;
		System.out.println("*********** corrida: RUN FOREST RUN ***********");

			for (Lebre lebre : lebres) {
				
				while(chegou < 4 ) {
					try {
						System.out.println("Lebre: " + lebre.getName() + "  Salto:  " + lebre.getSalto());
						n = (int) (Math.random() * 1000);
						if(n > 0 && n <= 3) {
							lebre.setMetro(lebre.getMetro() + n);
							lebre.setSalto(lebre.getSalto() + n);
						}
						
						lebre.sleep(n);
						
					} catch (Exception e) {
						System.out.println("DEu erro");
					}
					
					
				}
			}
	}
	
	public int getColocacao() {
		return colocacao;
	}

	public void setColocacao(int colocacao) {
		this.colocacao = colocacao;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}

	public int getMetro() {
		return metro;
	}

	public void setMetro(int metro) {
		this.metro = metro;
	}
	
}
