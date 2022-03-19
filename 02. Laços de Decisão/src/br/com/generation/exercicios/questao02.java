package br.com.generation.exercicios;

import java.util.Scanner;


/*(Exercicio de La�o de Decis�o)
 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente
 */

public class questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;

		System.out.println("#### Insira 3 n�meros para serem exibidos em ordem crescente. ####\n");

		System.out.print("Insira o 1� n�mero: ");
		num1 = sc.nextDouble();
		System.out.print("Insira o 2� n�mero: ");
		num2 = sc.nextDouble();
		System.out.print("Insira o 3� n�mero: ");
		num3 = sc.nextDouble();

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num1 + ", " + num2 + " e " + num3);
			} else if (num1 < num3) {
				System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num1 + ", " + num3 + " e " + num2);
			} else {
				System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num3 + ", " + num1 + " e " + num2);
			}
		}

		else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num2 + ", " + num1 + " e " + num3);
			} else {
				System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num2 + ", " + num3 + " e " + num1);
			}
		}

		else {
			System.out.println("\nA ordem crescente dos n�meros inseridos �: " + num3 + ", " + num2 + " e " + num1);
		}
		sc.close();
	}

}

			/*   Exemplo de uma Sa�da do Console ap�s executar o c�digo:
			 * 
			 * #### Insira 3 n�meros para serem exibidos em ordem crescente. ####
			
			Insira o 1� n�mero: -500
			Insira o 2� n�mero: 0
			Insira o 3� n�mero: 127
			
			A ordem crescente dos n�meros inseridos �: -500.0, 0.0 e 127.0
			*/
