package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Candidatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int molusco = 0;
		int nelson = 0;
		int gomes = 0;
		int bolim = 0;
		int num = 0;
		char opcao;

		System.out.println("Numeros dos candidatos:");
		System.out.println("Molusco : 31");
		System.out.println("Nelson: 10");
		System.out.println("Gomes: 51");
		System.out.println("Bolim: 20");

		/*
		do {			
			System.out.print("Qual candidato tem sua intenção de voto? entre com o numero: ");
			num = sc.nextInt();

			switch (num) {
			case 31:
				System.out.println("Sua intenção de voto foi registrada!");
				molusco++;
				break;

			case 10:
				System.out.println("Sua intenção de voto foi registrada!");
				nelson++;
				break;

			case 51:
				System.out.println("Sua intenção de voto foi registrada!");
				gomes++;
				break;

			case 20:
				System.out.println("Sua intenção de voto foi registrada!");
				bolim++;
				break;
				
			default:
				System.out.println("Numero invalido, ou candidato não disponivel!");

				break;
			}
			
			System.out.println("Deseja cadastrar outro voto?");
			opcao = sc.next().charAt(0);

		} while (Character.toLowerCase(opcao) == 's');
		
		System.out.println("O candidato molusco tem " + molusco + " votos");
		System.out.println("O candidato nelson tem " + nelson + " votos");
		System.out.println("O candidato gomes tem " + gomes + " votos");
		System.out.println("O candidato bolim tem " + bolim + " votos");
		*/
		
		System.out.print("Quantos votos deseja registrar: ");
		int qtdVoto = sc.nextInt();

		for(int i = 0; i < qtdVoto; i++){			
			System.out.print("Qual candidato tem sua intenção de voto? entre com o numero: ");
			num = sc.nextInt();

			switch (num) {
			case 31:
				System.out.println("Sua intenção de voto foi registrada!");
				molusco++;
				break;

			case 10:
				System.out.println("Sua intenção de voto foi registrada!");
				nelson++;
				break;

			case 51:
				System.out.println("Sua intenção de voto foi registrada!");
				gomes++;
				break;

			case 20:
				System.out.println("Sua intenção de voto foi registrada!");
				bolim++;
				break;
				
			default:
				System.out.println("Numero invalido, ou candidato não disponivel!");

				break;
			}
			
		} 
		
		System.out.println("O candidato molusco tem " + molusco + " votos");
		System.out.println("O candidato nelson tem " + nelson + " votos");
		System.out.println("O candidato gomes tem " + gomes + " votos");
		System.out.println("O candidato bolim tem " + bolim + " votos");

		sc.close();

	}

}
