package praticaTryCacth.excecoes;

public class PistaException extends Exception {
	public PistaException(String msg) {
		super(msg);
	}
	
	public PistaException(String msg, Throwable causa) {
		super(msg, causa);
	}
	
	public PistaException(Throwable causa) {
		super(causa);
	}
}
