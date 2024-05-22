package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Fornecedor;


public class FornecedorDao {
	
	private ArrayList<Fornecedor> fornecedores;
	private static FornecedorDao fDao;
	
	public FornecedorDao() {
		fornecedores = new ArrayList<Fornecedor>();
	}
	
	public static FornecedorDao getInstance() {
		if (fDao == null) {
			fDao = new FornecedorDao();
		}
		return fDao;
	}
	
	public void inserirFornecedor(Fornecedor f)  {
		fornecedores.add(f);
		System.out.println("Fornecedor Inserido com sucesso!!");
	}
	
	public void listarFornecedores() {
		System.out.println("------------------------------------------------");
		String output = "";
		for (Fornecedor f : fornecedores) {
			output += "Código: " + f.getCodigoFornecedor() + "\tNome: " + 
					f.getNomeFornecedor() + "\nCNPJ...: " + f.getCnpjFornecedor() 
					+ "\n";
			output += "----------------------------------------------------------\n";
		}
		System.out.println(output);
	}
	
	public int buscaCodigoFornecedor() {
		int tamanho = fornecedores.size();
		return tamanho;
	}
}
