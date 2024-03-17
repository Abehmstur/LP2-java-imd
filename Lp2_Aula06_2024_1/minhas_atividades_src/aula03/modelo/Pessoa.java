package aula03.modelo;

public class Pessoa{
	private double peso;
	private double altura;
	
	public Pessoa(){
		peso = 0.0;
		altura = 0.0;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		double alt = this.altura;
		
		if(this.altura >=100) {
			alt = alt/100;
		}
		
		return (this.peso/(alt*alt));
	}
	
	public void informarIMC(double imc) {
		double alt = this.altura;
		
		if(this.altura >=100) {
			alt = alt/100;
		}
		
		System.out.println("Voce informou o peso: " + this.peso);
		System.out.println("Voce informou a altura: "+ alt);
		System.out.println("Seu IMC eh: calculando...");
		System.out.println("Seu IMC eh: " + imc);
		
		System.out.println("Você esta: ");
		if(imc < 18.5) {
			System.out.println("Abaixo do Peso");
		} else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Pre-obesidade");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		} else {
			System.out.println("Obesidade Grau III");
		};
	}
}