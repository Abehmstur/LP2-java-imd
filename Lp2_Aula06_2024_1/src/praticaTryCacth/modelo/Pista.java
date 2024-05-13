package praticaTryCacth.modelo;

import praticaTryCacth.excecoes.AcimaVelocidadeException;
import praticaTryCacth.excecoes.PistaException;

public class Pista {
	
	
	public void iniciar() throws PistaException{
		Automovel a = new Automovel();
		
		try {
			a.acelerar(35);
			System.out.println("Aceleracao carro * a * : " + a.getVelocidadeAtual());
			a.acelerar(35);
			System.out.println("Aceleracao carro * a * : " + a.getVelocidadeAtual());
			a.acelerar(100);
			System.out.println("Aceleracao carro * a * : " + a.getVelocidadeAtual());
		} catch (AcimaVelocidadeException ave) {
			throw new PistaException("Problema na pista", ave);
		}
	}
}
