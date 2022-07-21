package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		//ler 2 numeros e imprimir a soma
		/*
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;		
		
		System.out.print("Entre com o numero para a soma: ");
		numero1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero para a soma: ");
		numero2 = leia.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println(soma);
		//primeiro exercicio
		*/
		
		/*
		//segundo exercicio
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Entre com a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media do aluno é: " + media);
		*/
		/*
		//exercicio 3
		
		double valorHora = 0;
		int quantidadeHoras = 0;
		double salario = 0;
		
		System.out.print("Entre com o valor da hora trabalhada: ");
		valorHora = leia.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas: ");
		quantidadeHoras = leia.nextInt();
		
		salario = valorHora * quantidadeHoras;
		
		System.out.println("O valor do salario é: " + salario);
		*/
		
		//exercicio4
		double fahrenheit = 0;
		double celsius = 0;
		
		
		System.out.print("Entre com a temperatura em fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		celsius = 5 * ((fahrenheit - 32) / 9);
		
		System.out.println("O valor convertido para celsiu fica: " + celsius);
		
		leia.close();
	}

}
