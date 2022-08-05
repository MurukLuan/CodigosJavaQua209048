package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Herois;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> superPoderes = new ArrayList<>();
		Herois heroi = new Herois();
		
		char option;
		
		System.out.println("Entre com o nome do heroi: ");
		heroi.setNomeDeHeroi(sc.nextLine());
		
		System.out.println("Qual universo pertence (marvel, dc..): ");
		heroi.setUniversoPertence(sc.nextLine());
		
		System.out.println("Entre com a identidade secreta: ");
		heroi.setIdentidadeSecreta(sc.nextLine());
		
		System.out.println("Entre com o planeta natal: ");
		heroi.setPlanetaNatal(sc.nextLine());
		
		System.out.println("Pertence a um grupo ou liga, qual: ");
		heroi.setPertenceAoGrupoLiga(sc.nextLine());
		
		System.out.println("Cidade natal: ");
		heroi.setCidadeNatal(sc.nextLine());
		
		System.out.println("Base secreta: ");
		heroi.setBaseSecreta(sc.nextLine());		
		
		do{
			
			System.out.println("Poderes: ");
			superPoderes.add(sc.nextLine());
			
			System.out.println("cadastrar mais um poder? s/n");
			option = sc.next().charAt(0);
			sc.nextLine();
		}while(Character.toUpperCase(option) == 'S');
		
		heroi.setSuperPoderes(superPoderes);
		
		System.out.println("Idade: ");
		heroi.setIdade(sc.nextInt());
		
		System.out.println("Está na ativa: s/n");
		option = sc.next().charAt(0);
		
		while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
			System.out.println("Está na ativa: s/n");
			option = sc.next().charAt(0);
		}
		
		switch (Character.toUpperCase(option)) {
		case 'S':
			heroi.setEstaNaAtiva(true);
			break;
			
		case 'N':
			heroi.setEstaNaAtiva(false);
			break;

		default:
			System.out.println("comando incorreto!");
			break;
		}
		
		System.out.println(heroi);

		sc.close();

	}

}
