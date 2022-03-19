package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio com La�o de Decis�o, la�o de Repeti��o e Vetor.)

 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */

public class questao01ldoacodedecisao {

	public static void main(String[] args) {

		int[] vetor = new int[3];
		int maior = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"#### Insira 3 n�meros e o programa retornar� com uma mensagem dizendo qual deles � o maior. ####\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("Insira o " + (i + 1) + "� n�mero: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] >= maior) {
				maior = vetor[i];

			}
		}

		System.out.println("\nO maior n�mero inserido foi " + maior+".");

		sc.close();

	}

}

/*
Exemplo de sa�da do Console ap�s executar o c�digo:

#### Insira 3 n�meros e o programa retornar� com uma mensagem dizendo qual deles � o maior. ####

Insira o 1� n�mero: -50
Insira o 2� n�mero: 0
Insira o 3� n�mero: 127

O maior n�mero inserido foi 127.

*/
