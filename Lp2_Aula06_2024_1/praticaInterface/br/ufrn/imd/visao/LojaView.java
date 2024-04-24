package br.ufrn.imd.visao;

import br.ufrn.imd.dao.RespositorioDAO;
import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;

public class LojaView {

	public static void main(String[] args) {

		//caros
		Carro c1 = new Carro();
		c1.setMotor(3.0);
		c1.setQuilometragemMensal(5000);
		
		Carro c2 = new Carro();
		c2.setMotor(0.8);
		c2.setQuilometragemMensal(10000);
		
		Moto m1 = new Moto();
		m1.setCilindrada(125);
		m1.setQuilometragemMensal(3000);
		
		Moto m2 = new Moto();
		m2.setCilindrada(700);
		m2.setQuilometragemMensal(8000);
		
		Taxi t1 = new Taxi();
		t1.setQuilometragemMensal(7000);
		
		Taxi t2 = new Taxi();
		t2.setQuilometragemMensal(15000);
		
		RespositorioDAO r = new RespositorioDAO();
		
		r.addVeiculo(c1);
		r.addVeiculo(c2);
		r.addVeiculo(m1);
		r.addVeiculo(m2);
		r.addVeiculo(t1);
		r.addVeiculo(t2);
		
		r.exibirCarbonFoots();
		
	}

}
