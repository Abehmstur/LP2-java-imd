package br.ufrn.imd.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.ufrn.imd.modelo.Cliente;

public class ClienteDao {
	
	private ArrayList<Cliente> clientes;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	private static ClienteDao cDao;
	
	public ClienteDao() {
		clientes = new ArrayList<Cliente>();
	}
	
	// Singleton
	public static ClienteDao getInstance() {
		if (cDao == null) {
			cDao = new ClienteDao();
		}
		return cDao;
	}
	
	public void inserirCliente(Cliente c)  {
		clientes.add(c);
		System.out.println("Cliente Inserido com sucesso!!");
	}
	
	public void listarClientes() {
		System.out.println("------------------------------------------------");
		String output = "";
		for (Cliente c : clientes) {
			output += "Código: " + c.getIdCliente() + "\tNome: " + c.getNomeCliente() +
					"\nCPF...: " + c.getCpf() + "\tData Nascimento: " + formato.format(c.getDataNascimento()) +
					"\n";
			output += "----------------------------------------------------------\n";
		}
		System.out.println(output);
	}
	
	public int buscaCodigoCliente() {
		int tamanho = clientes.size();
		return tamanho;
	}
}
