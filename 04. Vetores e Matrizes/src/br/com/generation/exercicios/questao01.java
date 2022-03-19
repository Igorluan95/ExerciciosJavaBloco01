package br.com.generation.exercicios;

import java.util.Scanner;

/*(Exercicio de Array)
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

public class questao01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] nota = new double[5];
		double maior = 0;

		System.out.println(
				"#### Leitura de 5 valores de notas e apresenta��o da maior nota.#### \n     (Insira valores dentro do intervalo de 0 a 10)\n");

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o valor da " + (i + 1) + "� nota: ");
			nota[i] = sc.nextDouble();

			if (nota[i] < 0 || nota[i] > 10) {
				System.out.println("\nNota inv�lida. Insira uma nota dentro do intervalo de 0 a 10.\n");
				i--;
			} else if (nota[i] > maior) {
				maior = nota[i];
			}

		}
		System.out.printf("\nA maior nota inserida foi a nota " + maior);

		sc.close();
	}

}

/*
 * /* Exemplo de sa�da do Console ap�s executar o c�digo: 
 * 
#### Leitura de 5 valores de notas e apresenta��o da maior nota.#### 
     (Insira valores dentro do intervalo de 0 a 10)

Insira o valor da 1� nota: 5
Insira o valor da 2� nota: 7
Insira o valor da 3� nota: -5

Nota inv�lida. Insira uma nota dentro do intervalo de 0 a 10.

Insira o valor da 3� nota: 10
Insira o valor da 4� nota: 7
Insira o valor da 5� nota: 7

A maior nota inserida foi a nota 10.0
 * 
 * 
 * 
 */
