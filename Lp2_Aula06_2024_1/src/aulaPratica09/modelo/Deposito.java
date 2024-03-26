package aulaPratica09.modelo;

import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> produtos;
	
	public Deposito() {
		produtos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto(Produto p) {
		produtos.add(p);
		System.out.printf("Produto %s adicionado com sucesso!\n", p.getNome());
	}
	
//	public void removerProduto(Produto p) {
//		int indice = 0;
//		for(Produto prod: produtos) {
//			if(prod.getNome().equals(p.getNome())){
//				indice = prod.;
//				System.out.println("Hash: " + indice);
//			}else {
//				System.out.println("Produto nao encontrado!\n");
//			}
//		}
//		produtos.remove(indice);
//		System.out.printf("Produto %s removido(a) com sucesso!\n", p.getNome());
//	}
	
//	public void removerProduto(Produto p) {
//	    boolean encontrado = false;
//	    for (Produto prod : produtos) {
//	        if (prod.getNome().equals(p.getNome())) {
//	            produtos.remove(prod);
//	            encontrado = true;
//	            break;
//	        }
//	    }
//	    
//	    if (encontrado) {
//	        System.out.printf("Produto %s removido com sucesso!\n", p.getNome());
//	    } else {
//	        System.out.println("Produto não encontrado na lista.");
//	    }
//	}
	
	public void removerProduto(Produto p) {
	    boolean removido = produtos.remove(p); // Tenta remover o produto da lista
	    
	    if (removido) {
	        System.out.printf("Produto %s removido com sucesso!\n", p.getNome());
	    } else {
	        System.out.println("Produto não encontrado na lista.");
	    }
	}
	
	public void listarProdutos() {
	    if (produtos.isEmpty()) {
	        System.out.println("A lista de produtos está vazia.");
	    } else {
	        System.out.println("Lista de Produtos:\n");
	        for (Produto prod : produtos) {
	            System.out.println(prod.getNome()+"\n");
	        }
	    }
	}

	
	public int qtdProdutosDeposito() {
		System.out.printf("Existem %d produtos no deposito!\n", produtos.size());
		return produtos.size();
	}
	
	public boolean isVazio() {
		
		if(produtos.isEmpty()) {
			System.out.println("O deposito esta vazio\n");
		}else {
			System.out.println("O deposito NAO esta vazio\n");
		}
		
		return produtos.isEmpty();
	}
	
	public void produtoComMaiorPreco() {
		double maior = Double.MIN_VALUE;
		Produto prodReserva = new Produto();
		for(Produto p: produtos) {
			if(p.getPreco() > maior) {
				maior = p.getPreco();
				prodReserva.setNome(p.getNome());
				prodReserva.setPreco(maior);
			}
		}
		System.out.printf("O produto de maior preco eh %s e seu preco eh %.2f\n", prodReserva.getNome(), prodReserva.getPreco());
	}
	
}
