package pratica170424AbstracticImplements.br.ufrn.modelo;

public class Mulher extends Pessoa{

	@Override
	public String calcularIMC() {
//		IMC < 19 : Abaixo do peso ideal
//		19 < IMC < 25.8: Peso ideal
//		IMC > 25.8 : Acima do peso ideal
		
		String saida;
		double val = (this.peso)/(this.altura*this.altura);
		
		if(val < 19) {
			saida = "Abaixo do peso ideal.";
		} else if(val > 19 && val < 25.8 ) {
			saida = "Peso Ideal.";
		} else {
			saida = "Acima do peso ideal.";
		}
//		System.out.println("m");
		
		return saida;
	}

}
