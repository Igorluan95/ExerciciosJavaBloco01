package br.com.generation.LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int numero, contador, totalPares=1, totalImpares=1;
		
		System.out.println("Insira 10 n�meros inteiros.\n");
		
		for (contador=1; contador <11; contador++) {
			
			System.out.println("Insira o "+ contador + "� n�mero:" );
			numero = entrada.nextInt();
			
			if (numero % 2 ==0) {
				totalPares++;				
			}
			else
				totalImpares++;
		}
		
		System.out.println("\nDos valores inseridos "+ (totalPares-1) + " n�meros s�o pares e " + (totalImpares-1) +" n�meros s�o �mpares.");
		
		
		

	}

}
