package aulas;

import java.text.ParseException;

public class ResolucaoDesafio {
	
	public static void main(String[] args) {
		final double Pii = 3.1415;
		
		
		int[][] num = new int[3][3];
		
		int contador = 10;
		
		for(int i = 0; i< num.length; i++) {
			
			for(int j = 0; j < num.length; j ++) {
				num[i][j] = contador;
				System.out.print( num[i][j] +"\t ");
				contador ++;
			}
			System.out.println();
		}
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = 0; j <num.length; j++) {
				if(num[i] == num [j]) {
					System.out.print(num[i][j] + "\t");
				}
			}
		}	
	}	
}
