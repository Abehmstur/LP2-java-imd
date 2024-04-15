package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;

public class Repository {
	private ArrayList<Animal> animais;
	
	
	public Repository() {
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal a) {
		animais.add(a);
		System.out.printf("Animal "+ a.getNome() +" adicionado com sucesso!\n");
	}
	
	public void listarAnimais() {
		System.out.println("\n**ANIMAIS ZOO**");
		System.out.println("******************************************************");
		for (Animal animal : animais) {
			System.out.printf("Nome: %s   Alimentacao: %s \nPeso: %d   Idade: %d   Alimentado: %s \n",animal.getNome(), animal.getAlimentacao(), animal.getPeso(), animal.calcularIdade(animal), animal.isAlimentado());
			System.out.println("\n******************************************************");
		}
	}
	
	//incompleta acabei de ver que era qtd_total; PENDENTE C ; D and E
	public void listarAlimentacao() {
		System.out.println("\n**ALIMENTACAO**");
		System.out.println("******************************************************");
		for (Animal animal : animais) {
			if(animal instanceof Girafa && animal.isAlimentado()) {
				animal.comer();
			}
			
			if(animal instanceof Elefante && animal.isAlimentado()) {
				animal.comer();
			}
			
			if(animal instanceof Tigre && animal.isAlimentado()) {
				animal.comer();
			}
		}
	}
}
