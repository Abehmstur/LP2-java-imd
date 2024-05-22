package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Produto;

public class ProdutoDao {
	
	private ArrayList<Produto> produtos;
	private static ProdutoDao pDao;
	
	public ProdutoDao() {
		produtos = new ArrayList<Produto>();
	}
	
	public static ProdutoDao getInstance() {
		if (pDao == null) {
			pDao = new ProdutoDao();
		}
		return pDao;
	}
	
	public void inserirProduto(Produto p)  {
		produtos.add(p);
		System.out.println("Produto Inserido com sucesso!!");
	}
	
	public int buscaCodigoProduto() {
		int tamanho = produtos.size();
		return tamanho;
	}
	
	public void listarProdutos() {
		double vlrMedio = 0;
		System.out.println("------------------------------------------------");
		String output = "";
		for (Produto p : produtos) {
			vlrMedio += p.getValorProduto();
			output += "Código: " + p.getCodigoProduto()  + "\tDescrição Produto: " + p.getDescricaoProduto() +
					"\nUN....: " + p.getUnidadeProduto() + "\tValor: " + p.getValorProduto() + "\n";
			output += "----------------------------------------------------------\n";
		}
		System.out.println(output);
		System.out.println("Valor Médio: " + (vlrMedio/produtos.size()));
		
	}
}
