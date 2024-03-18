package aula07DesignDeClasses.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula07DesignDeClasses.modelo.Escola;
import aula07DesignDeClasses.modelo.Evento;

public class EscolaVIEW {

	public static void main(String[] args) throws ParseException {
		Escola escola = new Escola();
		Evento evento = new Evento();
		
		Scanner scan = new Scanner(System.in);
		
		String data = "00-00-0000";
		String nome = "";
		
		System.out.println("Informe a descricao do evento:\n");
		nome = scan.next();
		
		System.out.println("Informe a data do evento:\n");
		data = scan.next();
		
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(data);
		
		evento.setNome(nome);
		evento.setData(dt);
		
		escola.setEvento(evento);
		mostrarEvento(escola);
		
//		escola.cadastrarEvento();
//		escola.mostrarEvento();
	}
	
	public static void mostrarEvento(Escola escola) {
		System.out.println("\n");
		System.out.println("Evento: " + escola.getEvento().getNome());
		System.out.println("Data: " + escola.getEvento().getData());
	}
	

}
