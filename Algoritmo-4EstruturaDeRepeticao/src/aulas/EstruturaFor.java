package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		//usamos quando ja sabemos a quantidade de vezes que queremos
		//executar determinada condição
		for(int i = 0; i <= 10; i++) {
			System.out.println("O contador esta valendo: " + i);
		}
		
		int i = 0;
		//usamos quando não sabemos a quantidade de vezes que precisamos 
		//executar determinado bloco de codigo
		while(i <= 10) {
			System.out.println("o Contador do While esta valendo: " + i);
			i++;
		}
		
		//usamos quando queremos que o bloco de codigo seja executado 
		//ao menos uma vez;
		do {
			System.out.println("O contador do do while está valendo: " + i);
			++i;
		}while(i < 10);
		*/
		
		int condicao = 0;
		int somar = 0;
		
		//System.out.println("Entre com o numero 1 para s e 2 para não");
		//condicao = sc.nextInt();
		
		/*while(condicao == 1) {
			System.out.println("Apertou 1");
			System.out.println("Entre com o numero 1 para s e 2 para não");
			condicao = sc.nextInt();
			somar++;
		}*/
		
		/*do {
			System.out.println("Entre com o numero 1 para s e 2 para não");
			condicao = sc.nextInt();
			
		}while(condicao == 1);
		
		System.out.println("Saiu do bloco de repeticao! repetiu: ");*/
		
		String nome = "Luan";
		
		String aux;
		
		System.out.println("digite um nome: ");
		aux = sc.nextLine();
		
		if(nome.equals(aux)) {
			System.out.println("imprimiu");
		}
		
		sc.close();
	}

}
