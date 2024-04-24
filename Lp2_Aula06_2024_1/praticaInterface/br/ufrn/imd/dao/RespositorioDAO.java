package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Taxi;
import br.ufrn.imd.modelo.Veiculo;

public class RespositorioDAO {
	private ArrayList<Veiculo> veiculos;
	
	public RespositorioDAO(){
		veiculos = new ArrayList<Veiculo>();
	}
	
	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
		System.out.println("\nVeiculo adicionado!\n");
	}
	
	public void exibirCarbonFoots() {
		System.out.println("------ Veiculos: \n");
		for (Veiculo veiculo : veiculos) {
			if(veiculo instanceof Carro) {
				System.out.println("CARROS: ");
				System.out.printf("Pegadas de Carbono: %.2f\n", 
			+ ((Carro) veiculo).getCarbonFootprint());
			} else if (veiculo instanceof Moto) {
				System.out.println("MOTOS: ");
				System.out.printf("Pegadas de Carbono: %.2f\n", 
				((Moto) veiculo).getCarbonFootprint());
			} else if(veiculo instanceof Taxi) {
				System.out.println("TAXIs: ");
				System.out.printf("Pegadas de Carbono: %.2f\n", ((Taxi) veiculo).getCarbonFootprint());
			}
		}
	}
}
