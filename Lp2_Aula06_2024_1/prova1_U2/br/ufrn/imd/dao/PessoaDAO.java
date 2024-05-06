package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.ITributavel;
import br.ufrn.imd.modelo.Pessoa;

public class PessoaDAO {
	private ArrayList<Pessoa> pessoa;
	
	public PessoaDAO() {
		pessoa = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa p) {
		pessoa.add(p);
		System.out.println("\nPessoa cadastrada!");
	}
	
	public void removerPessoa(Pessoa p) {
		pessoa.remove(p);
		System.out.println("\nPessoa removida!");
	}
	
	public void listaPessoas() {
		System.out.println("****************************");
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
			System.out.println("***************************");
		}
	}
	
	public void calcularTributosPessoas() {
		System.out.println("************************");
		for (Pessoa p : pessoa) {
			System.out.println("Nome: " + p.getNome() + "IRPF...: " + p.calcularTributos());
			System.out.println("***********************************");
			;
		}
	}
	
	public void imprimeImpostoTotal() {
		System.out.println("********************************");
		double t_total = 0;
		double maior = 0;
		double maior1 = 0;
		Pessoa pesMaior = new Pessoa();
		Pessoa pesMaiorBen = new Pessoa();
		for (Pessoa p : pessoa) {
			t_total += p.calcularTributos();
			if(maior < p.calcularTributos()) {
				maior = p.calcularTributos();
				pesMaior = p;
			}
			if(maior1 < p.getSeguro().getValor()) {
				maior1 = p.getSeguro().getValor();
				pesMaiorBen = p;
			}
			
		}
		System.out.println("\nTotal de Impostos recolhidos: " + t_total);
		
		
		System.out.println("\nPessoa com maior imposto: " + pesMaior.getNome());
		
		
		System.out.println("\nMaior Beneficiado(a): " + pesMaiorBen.getNome() + "\nValor Beneficio: " + maior1);

	}
}
