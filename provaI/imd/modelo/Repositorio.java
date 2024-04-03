package imd.modelo;

import java.util.ArrayList;

public class Repositorio {
	private Carro c;
	private Moto m;
	private ArrayList<Veiculo> veiculos;
	
	public Repositorio() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
		System.out.printf("Veiculo %s adicionado com sucesso!\n", v.getMarca());
	}
	
	public void listarTodosVeiculos() {
		if (veiculos.isEmpty()) {
	        System.out.println("A lista de veiculos esta vazia.");
	    } else {
	        System.out.println("Lista de Veiculos:\n");
	        int contaV = 0;
	        for (Veiculo v : veiculos) {
	            System.out.println("Veiculo: "+ v +"    Marca: "+ v.getMarca()+"     Placa: "+ v.getPlaca());
	        }
	    }
	}
	
	public void listarVeiculosAlugados() {
		System.out.println("=========Alugados=========");
		for(Veiculo v: veiculos) {
			if(v.isAlugado) {
				System.out.printf("Veiculo: %s Placa: %s Motor: %.2f \n", v.getMarca(), v.getPlaca(),v.getMotor());
				v.calcularAluguel();
			}
		}
		System.out.println("\n=========Fim=========\n");
	}
	
	public void listarVeiculosDisponiveis() {
		double maior = Double.MIN_VALUE;
		Veiculo vReserva = new Veiculo();
		System.out.println("=========Disponiveis=========");
		for(Veiculo v: veiculos) {
			if(!v.isAlugado) {
				System.out.printf("Veiculo: %s Placa: %s Motor: %.2f Valor do Aluguel: %.2f\n", v.getMarca(), v.getPlaca(),v.getMotor(), v.getValorDoAluguel());
				if(v.getValorDoAluguel() > maior) {
					maior = v.getValorDoAluguel();
					vReserva.setPlaca(v.getPlaca());
				}
			}
		}
		System.out.println("Veiculo com maior valor de aluguel: " + vReserva.getPlaca());
		System.out.println("\n=========Fim=========");
	}
	
	
}
