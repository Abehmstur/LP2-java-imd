package praticaTryCacth.visao;

import praticaTryCacth.excecoes.PistaException;
import praticaTryCacth.modelo.Pista;

public class Aplicacao {
	
	public static void main(String[] args) throws PistaException {
		Pista p = new Pista();
		
		try {
			p.iniciar();
//			throw new PistaException("Novo erro: HOJE EH DOMINGO.");
		} catch (PistaException pe) {
			// TODO: handle exception
			System.out.println("Pista BLOQUEADA");
			System.out.println("Mensagem: " + pe.getMessage() + " Causa: " + pe.getCause());
		}
	}
}
