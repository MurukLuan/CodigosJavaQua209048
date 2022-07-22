package aulas;

import java.util.Locale;
import java.util.Scanner;


public class EstruturaSelecao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		/*	
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			System.out.printf("Numero %d é o maior", n1);
		}
		else {
			System.out.printf("Numero %d é o maior", n2);
		}
		
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		System.out.print("Entre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior numero é: " + n1);
		}
		
		else if(n2 > n3) {
			System.out.println("O maior numero é: " + n2);
		}
		
		else {
			System.out.println("O maior numero é: " + n3);
		}
		Nycollas Passos Martins saiu as 15:25
		*/
		
		System.out.println("Entre com um numero: ");
		int numero = leia.nextInt();
		
		switch (numero) {
		case 1:			
			System.out.println("Voce digitou o numero 1");
			break;
			
		case 2:
			System.out.println("Voce digitou o numero 2");
			break;

		default:
			System.out.println("Voce digitou um numero maior "
					+ "que 2 ou vc digitou uma letra!");
			break;
		}
		
		System.out.println("Saiu do Switch case!");
		
		leia.close();
	}

}
