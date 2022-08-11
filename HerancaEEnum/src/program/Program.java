package program;

import java.util.Locale;
import java.util.Scanner;

import entitites.Cliente;
import entitites.Conta;
import entitites.ContaCorrente;
import entitites.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Cliente cliente = new Cliente();
		Conta contaConcorrente = new ContaCorrente();
		Conta conta = new Conta();	
		Conta cp = new ContaPoupanca();
		
		conta.Depositar(100);
		contaConcorrente.Depositar(200);
		
		conta.Sacar(50);
		contaConcorrente.Sacar(50);
		
		System.out.println("saldo conta: " + conta.getSaldo());
		System.out.println("saldo conta corrente: " + contaConcorrente.getSaldo());
	
		System.out.print("Entre com o nome do titular: ");
		cliente.setNome(sc.nextLine());
		
		sc.nextLine();
		System.out.print("Entre com o CPF do titular: ");
		cliente.setCpf(sc.nextLine());		
		contaConcorrente.setTitular(cliente);
				
		System.out.print("Entre com o numero da agencia: ");
		contaConcorrente.setAgencia(sc.nextInt());
		
		System.out.print("Entre com o numero da conta: ");
		contaConcorrente.setNumeroConta(sc.nextInt());
		
		System.out.print("Digite o valor para deposito: ");
		contaConcorrente.Depositar(sc.nextDouble());

		System.out.println("Conta criada!");
		
		System.out.println(contaConcorrente);
		
		System.out.print("\nEntre com o valor do saque: ");
		contaConcorrente.Sacar(sc.nextDouble());
		
		System.out.println("Saldo atualizado: ");
		System.out.println(contaConcorrente);
		
		sc.close();
	}

}
