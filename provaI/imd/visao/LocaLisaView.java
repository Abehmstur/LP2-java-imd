package imd.visao;

import imd.modelo.Carro;
import imd.modelo.Moto;
import imd.modelo.Repositorio;

public class LocaLisaView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		c1.setAlugado(true);
		c1.setMarca("Ford");
		c1.setPlaca("AAA-8888");
		c1.setQtdPortas(4);
		c1.setMotor(1600);
		c1.setValorDoAluguel(5 * 115.5);
		c1.setQuilometragem(21000);
		
		Carro c2 = new Carro();
		c2.setAlugado(true);
		c2.setMarca("Fiat");
		c2.setPlaca("ABB-1000");
		c2.setQtdPortas(4);
		c2.setMotor(1000);
		c2.setValorDoAluguel(3 * 75.0);
		c2.setQuilometragem(15000);
		
		Carro c3 = new Carro();
		c3.setAlugado(false);
		c3.setMarca("Fiat");
		c3.setPlaca("ABC-5501");
		c3.setQtdPortas(2);
		c3.setMotor(1200);
		c3.setValorDoAluguel(1 * 75.0);
		c3.setQuilometragem(14000);
		
		Moto m1 = new Moto();
		m1.setAlugado(false);
		m1.setMarca("Honda");
		m1.setPlaca("BBB-2019");
		m1.setMotor(850);
		m1.setPartida("Elétrica");
		m1.setValorDoAluguel(1 * 55.25);
		m1.setQuilometragem(3500);
		
		Moto m2 = new Moto();
		m2.setAlugado(true);
		m2.setMarca("Yamaha");
		m2.setPlaca("XYZ-2019");
		m2.setMotor(250);
		m2.setPartida("Elétrica");
		m2.setValorDoAluguel(2 * 55.25);
		m2.setQuilometragem(4500);
		
		Repositorio r = new Repositorio();
		r.addVeiculo(c1);
		r.addVeiculo(c2);
		r.addVeiculo(c3);
		r.addVeiculo(m1);
		r.addVeiculo(m2);

	}

}
