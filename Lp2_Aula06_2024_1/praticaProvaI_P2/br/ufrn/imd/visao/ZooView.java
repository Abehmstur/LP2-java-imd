package br.ufrn.imd.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.ufrn.imd.dao.Repository;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;

public class ZooView {

	public static void main(String[] args) throws ParseException{
//		Animal a = new Animal();
//		a.setPeso(100);
//		a.comer();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataNascimento = sdf.parse("15/11/1979");
	    Date dataNascimento2 = sdf.parse("11/02/1961");
	    Date dataNascimento3 = sdf.parse("27/04/1999");

		Tigre t = new Tigre();
		t.setNome("Tigrino");
		t.setDataNascimento(dataNascimento);
		t.setPeso(10);
		t.comer();
		
		Girafa g = new Girafa();
		g.setNome("Girafino");
		g.setDataNascimento(dataNascimento2);
		g.setPeso(100);
		g.comer();
		
		Elefante e = new Elefante();
		e.setNome("Elefantino");
		e.setDataNascimento(dataNascimento3);
		e.setPeso(1000);
		e.comer();
		e.setAlimentacao("Ovo");
		
		//System.out.println(e.isAlimentado());
		
		//Chamando dao
		Repository r = new Repository();
		r.adicionarAnimal(e);
		r.adicionarAnimal(g);
		//r.listarAnimais();
		r.listarAlimentacao();

	}

}
