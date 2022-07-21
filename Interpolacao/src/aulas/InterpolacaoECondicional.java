package aulas;

import java.util.Locale;
import java.util.Scanner;

public class InterpolacaoECondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * String nome = "Luan Muruk"; int idade = 32; double salario = 2300.00; char
		 * sexo = 'M';
		 * 
		 * System.out.printf("%s tem %d anos e ganha %.2f, sexo: %c", nome, idade,
		 * salario, sexo);
		 */

		int a = 11;
		int b = 20;
		int c = 10;
		double d = 10.0;

		/*
		 * boolean v = true; boolean f = false;
		 * 
		 * if (a == c || b == a) { System.out.println("Sim"); } else {
		 * System.out.println("não!"); }
		 */

		// System.out.println(a += b);
		// System.out.println(a += b);

		/*
		 * int ano = 2022;
		 * 
		 * if (ano %4 == 0) { System.out.println("O ano é bisexto!"); }else {
		 * System.out.println("O ano não é bisexto!"); }
		 */

		System.out.print("Entre com a nota: ");
		d = sc.nextDouble();

		if (d > 0.0 && d <= 10) {
			System.out.println("Ok nota valida!");
		} else {
			System.out.println("Entre com um valor entre 0 e 10");
			System.out.print("Entre com a nota: ");
			d = sc.nextDouble();	
		}
		sc.close();
	}

}
