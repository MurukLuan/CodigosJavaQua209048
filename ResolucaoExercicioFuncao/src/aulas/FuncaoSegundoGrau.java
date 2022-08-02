package aulas;

import java.util.Locale;
import java.util.Scanner;

public class FuncaoSegundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		System.out.print("Entre com o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = sc.nextDouble();

		FsegundoGrau(a, b, c);

		sc.close();

	}

	public static void FsegundoGrau(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) - (4 * (a * c));
		double x1 = 0.0;
		double x2 = 0.0;
		if(delta < 0) {
			System.out.println("Delta não tem raiz");
		}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		}
		System.out.printf("Delta está valendo: %.2f", delta);
		System.out.printf("\nx1 está valendo: %.2f", x1);
		System.out.printf("\nx2está valendo: %.2f", x2);
	}
}
