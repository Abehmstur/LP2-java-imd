package pratica170424AbstracticImplements.br.ufrn.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pratica170424AbstracticImplements.br.ufrn.dao.Repositorio;
import pratica170424AbstracticImplements.br.ufrn.modelo.Homem;
import pratica170424AbstracticImplements.br.ufrn.modelo.Mulher;

public class ProgramaSaude {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	    Date dt;
	    
		Homem h = new Homem();
		h.setNome("Ze Lezim");
		dt = formato.parse("20-01-1945");
		h.setDataNascimento(dt);
		h.setPeso(74.8);
		h.setAltura(1.75);
		
		Mulher m = new Mulher();
		m.setNome("Frida Kahlo");
		dt = formato.parse("06-07-1907");
		m.setDataNascimento(dt);
		m.setPeso(50.2);
		m.setAltura(1.69);
		
		Repositorio r = new Repositorio();
		r.addPessoa(m);
		r.addPessoa(h);
		r.listarPessoas();;
	}

}
