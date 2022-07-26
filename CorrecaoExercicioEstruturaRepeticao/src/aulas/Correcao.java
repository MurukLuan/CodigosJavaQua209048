package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Correcao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		//exercicio 1
		/*
		double nota = 0.0;

		do 
		{
			System.out.print("Entre com uma nota entre 0 e 10: ");
			nota = sc.nextDouble();

			if (nota > 10 || nota < 0) {
				System.out.println("Nota invalida!");
			}

		} while (nota < 0 || nota > 10.0);
			*/
		
		//exercicio 2
		/*
		String usuario;
		String senha;
		
		System.out.print("Entre com o nome do usuario: ");
		usuario = sc.nextLine();
		
		System.out.print("Entre com a senha: ");
		senha = sc.nextLine();
		
		while(usuario.equals(senha)) {
			System.out.println("Usuario invalido! ");
			
			System.out.print("Entre com o nome do usuario: ");
			usuario = sc.nextLine();
			
			System.out.print("Entre com a senha: ");
			senha = sc.nextLine();
		}		
		
		System.out.println("Cadastro realizado com sucesso");
		*/
		
		String nome;
		int idade = 0;
		double salario = 0.0;
		char sexo;
		char estadoCivil;
		
		System.out.print("Entre com o nome: ");
		nome = sc.nextLine();
		
		while(nome.length() < 3) {
			System.out.println("Nome não pode conter menos que 3 caracteres!");
			
			System.out.print("Entre com o nome: ");
			nome = sc.nextLine();
		}
		
		System.out.print("Entre com a idade: ");
		idade = sc.nextInt();
		
		while(idade < 0 || idade > 150) {
			System.out.println("Idade invalida entre com a idade novamente!");
			
			System.out.print("Entre com a idade: ");
			idade = sc.nextInt();
		}
		
		System.out.print("Entre com o salario: ");
		salario = sc.nextDouble();
		
		while(salario <= 0) {
			System.out.println("Salario invalido, não pode ser menor que 0.");
			
			System.out.print("Entre com o salario: ");
			salario = sc.nextDouble();
			
		}
		
		System.out.print("Entre com o sexo: ");
		sexo = sc.next().charAt(0);
		
		while(Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {
			System.out.println("Entre com o sexo valido!");
			
			System.out.print("Entre com o sexo: ");
			sexo = sc.next().charAt(0);
		}
		
		System.out.print("Entre com o estado civil: ");
		estadoCivil = sc.next().charAt(0);
		
		while(Character.toUpperCase(estadoCivil) != 'S'
				&& Character.toUpperCase(estadoCivil) != 'C'
				&& Character.toUpperCase(estadoCivil) != 'V'
				&& Character.toUpperCase(estadoCivil) != 'D') {
			
			System.out.println("Estado civil invalido!");
			
			System.out.print("Entre com o estado civil: ");
			estadoCivil = sc.next().charAt(0);
		}
		
	}

}
