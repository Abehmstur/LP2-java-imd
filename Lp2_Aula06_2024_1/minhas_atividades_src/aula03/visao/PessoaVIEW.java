package aula03.visao;
import aula03.modelo.Pessoa;
import java.util.Scanner;

public class PessoaVIEW {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Informe o peso: ");
		double p, a, imc = 0.0;
		p = scan1.nextDouble();
		
		System.out.println("Informe a altura: ");
		a = scan1.nextDouble();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setAltura(a);
		pessoa.setPeso(p);
		
		imc = pessoa.calcularIMC();
		
		pessoa.informarIMC(imc);
		
	}

}
