package imd.controle;

import imd.modelo.Lebre;
import imd.modelo.Repositorio;

public class LebreThread extends Thread {
	private Lebre lebre;
	private static Repositorio rDao;

	public LebreThread(String nome) {
		lebre = new Lebre();
		lebre.setNome(nome);
		rDao = Repositorio.getInstance();
	}

	public void run() {
		try {
			while (lebre.getDistancia() <= 20) {
				lebre.pular();
				sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Deu erro!!!!");
		}
		rDao.addLebre(lebre);
	}
}
