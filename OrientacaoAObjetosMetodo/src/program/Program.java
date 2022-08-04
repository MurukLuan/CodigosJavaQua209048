package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double x = FormulaHeron.CalcularAreaTriangulo(10, 10, 10);
		Math.sqrt(8);
		System.out.println("A area do triangulo: " + x);
		
		/*FormulaHeron fh = new FormulaHeron();
		 
		
		System.out.print("Entre com os 3 lados do triangulo: ");
		fh.lado1 = sc.nextDouble();
		fh.lado2 = sc.nextDouble();
		fh.lado3 = sc.nextDouble();
		
		System.out.println("O valor da area do triangulo é: " 
		+ fh.CalcularAreaTriangulo());
		*/
		sc.close();
	}

}
