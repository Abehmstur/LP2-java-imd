package aulaPratica09.visao;

import java.util.Date;

import aulaPratica09.modelo.Deposito;
import aulaPratica09.modelo.ProdutoDuravel;
import aulaPratica09.modelo.ProdutoNaoDuravel;

public class LojaView {

	public static void main(String[] args) {
		
		//Produtos Duvareis
		ProdutoDuravel geladeira = new ProdutoDuravel();
		ProdutoDuravel livro = new ProdutoDuravel();
		ProdutoDuravel celular = new ProdutoDuravel();
		
		geladeira.setNome("Geladeira Consul 386L Inox bla bla bla");
		geladeira.setPreco(2948.50);//preco que comprei semana passada
		geladeira.setDurabilidade(10);
		geladeira.setMarca("Consul");
		geladeira.setDescricao("Geladeira Consul bla bla bla");
		
		livro.setNome("Livro A");
		livro.setDurabilidade(10);
		livro.setPreco(100);
		livro.setMarca("Principia");
		livro.setDescricao("Fala sobre a letra A");
		
		celular.setNome("Iphone 400");
		celular.setDurabilidade(1);
		celular.setMarca("Apple");
		celular.setPreco(14999.95);
		celular.setDescricao("Produto sem carregador");
		
		//Produtos Nao Duraveis
		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();
		ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();
		ProdutoNaoDuravel detergente = new ProdutoNaoDuravel();
		Date data = null;

		chocolate.setNome("Chocol");
		chocolate.setDescricao("AAAA");
		chocolate.setGenero("Doces");
		chocolate.setDataValidade(data);
		chocolate.setPreco(4.99);
		
		sabonete.setNome("Sabonete A");
		sabonete.setDescricao("BBB");
		sabonete.setGenero("Sabao");
		sabonete.setDataValidade(data);
		sabonete.setPreco(5.99);
		
		detergente.setNome("Detergente A");
		detergente.setDescricao("CCC");
		detergente.setGenero("Sabao");
		detergente.setDataValidade(data);
		detergente.setPreco(8.99);
		
		Deposito depositoA = new Deposito();
		
		depositoA.adicionarProduto(geladeira);
		depositoA.adicionarProduto(livro);
		depositoA.adicionarProduto(celular);
		depositoA.adicionarProduto(sabonete);
		depositoA.adicionarProduto(chocolate);
		depositoA.adicionarProduto(detergente);
		
		depositoA.produtoComMaiorPreco();
		
		System.out.println("Depois da REMOCAO");
		depositoA.listarProdutos();
		
		depositoA.qtdProdutosDeposito();
		
		depositoA.removerProduto(chocolate);
		
		System.out.println("Depois da REMOCAO");
		depositoA.listarProdutos();

		depositoA.qtdProdutosDeposito();
		
		depositoA.isVazio();

	}

}
