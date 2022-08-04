package program;

import java.util.Scanner;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Entre com o nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.print("Entre com a idade: ");
		pessoa.idade = sc.nextInt();
		
		System.out.print("Entre com o sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		System.out.println(pessoa.nome + " " + pessoa.idade + " " + pessoa.sexo);
		
		sc.close();

	}

}
