package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		//alterado aqui
		Carro carro;
		Moto moto = new Moto();
		
		//alterado aqui tambem
		ArrayList<Veiculo> carros = new ArrayList<>();
		ArrayList<Veiculo> motos = new ArrayList<>();
		
		char opcao;
		
		System.out.println("Voce deseja cadastrar um veiculo? (s/n)");
		opcao = sc.next().charAt(0);
		
		while(Character.toLowerCase(opcao) == 's') {
			
			System.out.println("Qual o tipo de veiculo que cadastrar (c/m)");
			opcao = sc.next().charAt(0);
			
			switch (Character.toLowerCase(opcao)) {
			case 'c':
				
				carro = new Carro();
				
				sc.nextLine();
				System.out.print("Entre com o tipo do veiculo: ");
				carro.setTipo(sc.nextLine());
				
				System.out.println("Entre com o tipo do combustivel: ");
				carro.setTipoCombustivel(sc.nextLine());
				
				System.out.println("Entre com a potencia do motor");
				carro.setMotor(sc.nextLine());
				
				System.out.println("Entre com o modelo: ");
				carro.setModelo(sc.nextLine());
				
				System.out.println("Entre com a quantidade de passageiros: ");
				carro.setQtdPassageiros(sc.nextInt());
				
				System.out.println("Entre com a quantidade de pneus: ");
				carro.setQtdPneus(sc.nextInt());
				
				//alterado a partir daqui
				sc.nextLine();
				System.out.println("Entre com o modelo do ar condicionado (manual/digital):");
				carro.setArCondicionado(sc.nextLine());
				
				System.out.println("Entre com o modelo do som (básico/multimidia):");
				carro.setSonorizacao(sc.nextLine());
				
				//finaliza aqui
				
				carros.add(carro);
				
				break;

			default:
				System.out.println("Tipo incompativel!");
				break;
			}		
			//a lista estava aqui
		}
		
		//agora foi colocada aqui		
		for(Veiculo listaCarros : carros) {
			System.out.println(listaCarros);
		}
		
		sc.close();
	}

}
