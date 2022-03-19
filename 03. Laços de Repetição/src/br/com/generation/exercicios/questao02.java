package br.com.generation.exercicios;

import java.util.Scanner;


/*/* # (Exercicio de Repeti��o)
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

public class questao02 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, qtdPar = 0, qtdImpar = 0;

		System.out.println("#### Insira 10 n�meros para programa retornar quantos s�o pares e quantos s�o �mpares. ####\n");

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i + 1) + "� n�mero: ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				qtdPar += 1;
			} else {
				qtdImpar += 1;
			}
		}
		System.out.println("\nDos n�meros inseridos " + qtdPar + " s�o pares e " + qtdImpar + " s�o �mpares.");
		sc.close();
	}

}

/*
Exemplo de sa�da do Console ap�s executar o c�digo:

#### Insira 10 n�meros para programa retornar quantos s�o pares e quantos s�o �mpares. ####
		
		Insira o 1� n�mero: 1
		Insira o 2� n�mero: 2
		Insira o 3� n�mero: 3
		Insira o 4� n�mero: 4
		Insira o 5� n�mero: 5
		Insira o 6� n�mero: 6
		Insira o 7� n�mero: 7
		Insira o 8� n�mero: 8
		Insira o 9� n�mero: 9
		Insira o 10� n�mero: 10
		
		Dos n�meros inseridos 5 s�o pares e 5 s�o �mpares.

*/
