package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Produto produto = new Produto();
		
		System.out.print("Entre com o nome do produto: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Entre com a quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print("Entre com o nome do produto: ");
		produto.valor = sc.nextDouble();
		
		System.out.println(produto);

	}

}
