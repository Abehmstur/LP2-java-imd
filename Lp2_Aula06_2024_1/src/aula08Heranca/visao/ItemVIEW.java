package aula08Heranca.visao;

import aula08Heranca.modelo.CD;
import aula08Heranca.modelo.DVD;

public class ItemVIEW {

	public static void main(String[] args) {
		CD cd1 = new CD("Titulo", 10, 0, null);
		DVD dvd1 = new DVD(null, 0);
		cd1.setGotIt(true);
		cd1.print();
		dvd1.setGotIt(true);
		dvd1.print();
		
	}

}
