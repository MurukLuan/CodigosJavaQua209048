package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		
		//ctr+shift+o importa automaticamente
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;

		System.out.println("Entre com um numero inteiro: ");
		numero = leia.nextInt();
		
		leia.nextLine();
		System.out.println("Entre com um nome: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("O numero digitado foi: " + numero);
		System.out.println("O sexo digitado foi: " + sexo);
		
		System.out.println("x está valendo: " + x);
		
		System.out.print("Insira um valor para a variavel x: ");
		x = leia.nextDouble();
		
		System.out.println("O valor de x agora está valendo: " + x);
		
		leia.close();
	}

}
