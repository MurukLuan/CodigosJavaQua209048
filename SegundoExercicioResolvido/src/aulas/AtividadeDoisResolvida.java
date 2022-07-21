package aulas;

import java.util.Scanner;

public class AtividadeDoisResolvida {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		char sexo;
		double saldoConta = 0.0;		
		
		System.out.print("Entre com a idade: ");
		idade = leia.nextInt();
		
		leia.nextLine();
		System.out.print("Entre com o nome da pessoa: ");
		nome = leia.nextLine();
				
		System.out.print("Entre com o sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.print("Entre com o saldo: ");
		saldoConta = leia.nextDouble();
		
		System.out.println(nome + " tem " + idade + 
				" anos e seu sexo é " +
						sexo + ", e possui no banco R$" 
						+ saldoConta + " reais.");
		
		leia.close();

	}

}
