package imd.controle;

import imd.modelo.Repositorio;

public class CorridaLebres {

	private static Repositorio rDao;

	public static void main(String[] args) throws InterruptedException {

		rDao = Repositorio.getInstance();

		LebreThread lt1 = new LebreThread("Rapinha");
		LebreThread lt2 = new LebreThread("Corredora");
		LebreThread lt3 = new LebreThread("Ligeirinha");
		LebreThread lt4 = new LebreThread("Pernalonga");
		LebreThread lt5 = new LebreThread("Elsa");

		lt1.start();
		lt2.start();
		lt3.start();
		lt4.start();
		lt5.start();

		int i = 0;
		while (lt1.isAlive() == true || lt2.isAlive() == true || lt3.isAlive() == true || lt4.isAlive() == true
				|| lt5.isAlive() == true) {
			i++;
		}
		rDao.listarOrdemChegada();
	}
}
