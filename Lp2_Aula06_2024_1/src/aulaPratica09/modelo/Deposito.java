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
	
	public void removerProduto(Produto p) {
		for(Produto prod: produtos) {
			if(prod.getNome().equals(p.getNome())){
				produtos.remove(prod);
				System.out.printf("Produto %s removido(a) com sucesso!\n", p.getNome());
			}else {
				System.out.println("Produto nao encontrado!\n");
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
