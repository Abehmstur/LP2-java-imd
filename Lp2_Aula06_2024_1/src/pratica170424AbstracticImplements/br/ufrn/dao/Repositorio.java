package pratica170424AbstracticImplements.br.ufrn.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import pratica170424AbstracticImplements.br.ufrn.modelo.Pessoa;

public class Repositorio {
	private ArrayList<Pessoa> pessoas;
	
	public Repositorio(){
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	public void listarPessoas() {        
		for (Pessoa pessoa : pessoas) {
			System.out.println("----------------------------------------------------");
			System.out.println(pessoa.toString());
			System.out.println(pessoa.calcularIMC());
		}
	}
}
