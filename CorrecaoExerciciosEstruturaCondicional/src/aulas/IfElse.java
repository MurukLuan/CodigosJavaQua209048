package aulas;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		// exercicio 1 senha e usuario
		/*
		 * String senhaSalva = "123Luan"; String usuarioSalvo = "Luan";
		 * 
		 * String senha; String usuario;
		 * 
		 * System.out.print("Entre com o nome do usuario: "); usuario = sc.nextLine();
		 * 
		 * System.out.print("Entre com a senha: "); senha = sc.nextLine();
		 * 
		 * if(senhaSalva.equals(senha)) { System.out.println("Senha correta!"); }else {
		 * System.out.println("Senha incorreta!"); }
		 * 
		 * if(usuarioSalvo.equals(usuario)) { System.out.println("Usuario correto!");
		 * }else { System.out.println("Usuario incorreto!"); }
		 */

		// exercicio2 salario bruto e liquido

		/*double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		//double inss = 0.11;
		//double irpf = 0.05;

		System.out.print("Entre com o salario Bruto: ");
		salarioBruto = sc.nextDouble();

		/*
		 * salarioLiquido = salarioBruto - ((salarioBruto * inss) + (salarioBruto *
		 * irpf));
		 * 
		 * if(salarioLiquido < 1200.00) { salarioLiquido += salarioLiquido * 0.05; }else
		 * if(salarioLiquido > 3500.00) { salarioLiquido += salarioLiquido * 0.02; }
		 

		salarioLiquido = salarioBruto - ((salarioBruto * 0.11) + (salarioBruto * 0.05));

		if (salarioLiquido < 1200.00) {
			salarioLiquido += salarioLiquido * 0.05;
		} else if (salarioLiquido > 3500.00) {
			salarioLiquido += salarioLiquido * 0.02;
		}

		System.out.print("Salario atualizado: " + salarioLiquido);
		*/
		
		/*
		int selecionado = 0;
		int quantidade = 0;
		
		
		System.out.println("Escolha um item do cardapio:");
		System.out.print("1 - sanduiche natureba");
		System.out.print("2 - Sanduba bomba");
		System.out.print("3 - coxinha de jaca");
		System.out.print("4 - Feijoada vegetariana \n");
		
		System.out.print("Entre com o numero da opção: ");
		selecionado = sc.nextInt();
		
		System.out.print("Entre com a quantidade: ");
		quantidade = sc.nextInt();
		
		switch (selecionado) {
		case 1:
			System.out.println("Opção escolhida: sanduiche natureba");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 2:
			System.out.println("Opção escolhida: sanduba Bomba");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 3:
			System.out.println("Opção escolhida: coxinha de jaca");
			System.out.println("Quantidade: " + quantidade);
			break;
			
		case 4:
			System.out.println("Opção escolhida: Feijoada Vegetariana");
			System.out.println("Quantidade: " + quantidade);
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		}
		*/
		
		/*int diaSemana = 0;
		
		System.out.println("Entre com o numero para saber o dia da semana: ");
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo!");
			break;
			
		case 2:
			System.out.println("Segunda!");
			break;
		case 3:
			System.out.println("Terça!");
			break;

		default:
			System.out.println("opção invalida!");
			break;
		}	*/
		
		char x = 'm';
		
		sc.next().charAt(0);
		
		if (x == 'm') {
			System.out.println("Aceitou");
		}
		
		sc.close();

	}

}
