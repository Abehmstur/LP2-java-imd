package praticaTryCacth.excecoes;

public class AcimaVelocidadeException extends Exception {
	
	public AcimaVelocidadeException(String msg) {
		super(msg);
	}
	
	public AcimaVelocidadeException(String msg, Throwable causa) {
		super(msg, causa);
	}
	
	public AcimaVelocidadeException(Throwable causa) {
		super(causa);
	}
}
