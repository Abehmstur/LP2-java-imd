package pratica170424AbstracticImplements.br.ufrn.modelo;

public class Homem extends Pessoa{

	@Override
	public String calcularIMC() {
//		IMC < 20.7 : Abaixo do peso ideal
//		20.7 < IMC < 26.4: Peso ideal
//		IMC > 26.4 : Acima do peso ideal
		
		String saida;
		double val = (this.peso)/(this.altura*this.altura);
		
		if(val < 20.7) {
			saida = "Abaixo do peso ideal.";
		} else if(val > 20.7 && val < 26.4 ) {
			saida = "Peso Ideal.";
		} else {
			saida = "Acima do peso ideal.";
		}
//		System.out.println("h");
		return saida;
	}
	
}
