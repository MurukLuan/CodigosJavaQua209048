package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double altura = 0.0;
		int idade = 0;
		double peso = 0.0;
		char sexo;
		
		System.out.print("Entre com a altura: ");
		altura = sc.nextDouble();
		System.out.print("Entre com a idade: ");
		idade = sc.nextInt();
		System.out.print("Entre com o peso: ");
		peso = sc.nextDouble();
		System.out.println("Entre com o sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.printf("Luan tem %d e esta com o peso: %.2f", idade, peso);
		
		System.out.println(CalcularIMC(altura, peso));
		
		sc.close();
	}
	
	public static String CalcularIMC(double a, double p) {
		double imc = (p /(a * a));
		
		return "a pessoa esta com o peso: " + imc;
	}

}
