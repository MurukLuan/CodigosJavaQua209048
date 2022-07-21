package aulas;

public class Operadores {

	public static void main(String[] args) {
		
		
		double a = 10.0;
		double b = 5.0;
		double c = 2.0;
		
		/*System.out.println("A soma de a e b é: " + (a + b));
		System.out.println("A subtração de a - b e: " + (a - b));
		System.out.println("A multiplicação de a * c é: " + (a * c));
		System.out.println("A divisão de a / b é: " + (a / b));
		System.out.println("O resto da divisão entre a % c é: " + (a % c));
		*/
		
		double resultado = a * b + c; 
		System.out.println(resultado);
		
		resultado = a * (b + c);
		System.out.println(resultado);
		
		resultado = a * c / b + a;
		System.out.println(resultado);
		
		System.out.println(resultado + a);
		
		//System.out.println(resultado2 / resultado3);*/
	}

}
