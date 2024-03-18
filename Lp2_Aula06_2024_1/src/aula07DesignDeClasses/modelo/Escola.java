package aula07DesignDeClasses.modelo;

import java.util.Scanner;

public class Escola {
	Evento e = new Evento();
	
	public void cadastrarEvento() {
		Scanner scan = new Scanner(System.in);
		String nome = "";
		int dia, mes, ano;
		
		System.out.println("Informe a descricao do evento:\n");
		nome = scan.next();
		
		System.out.println("Informe o dia do evento:\n");
		dia = scan.nextInt();
		
		System.out.println("Informe o mes do evento:\n");
		mes = scan.nextInt();
		
		System.out.println("Informe o ano do evento:\n");
		ano = scan.nextInt();
		
		e.agendar(nome, dia, mes, ano);
	}	
	
	public void mostrarEvento() {
		System.out.println("\n");
		System.out.println("Evento: " + e.getNome());
		System.out.println("Data: " + e.getDia() + "/" + e.getMes() + "/" + e.getAno());
	}
}
