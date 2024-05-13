package praticaTryCacth.modelo;

import praticaTryCacth.excecoes.AcimaVelocidadeException;

public class Automovel {
	private static final int VELOCIDADE_MAXIMA = 120;
	private int velocidadeAtual;
	
	public Automovel() {
		velocidadeAtual = 0;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public static int getVelocidadeMaxima() {
		return VELOCIDADE_MAXIMA;
	}


	public void acelerar(int v) throws AcimaVelocidadeException{
		if(v + this.velocidadeAtual > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeException("Voce ultrapassou a velocidade maxima");
		}
		this.velocidadeAtual += v;
	};
}
