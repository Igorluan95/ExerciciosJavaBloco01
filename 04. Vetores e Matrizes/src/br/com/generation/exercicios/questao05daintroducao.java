package br.com.generation.exercicios;

import java.util.Scanner;

public class questao05daintroducao {
	
	/*
	(Exercicio de Array)
	 5. Fa�a um sistema que leia as 3 notas
	 de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia �
	 ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	 */


	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		double[] nota = new double[3];
		double media;
		double a = 2, b = 3, c = 5;

		System.out.println("#### Calculo da m�dia ponderada. Insira notas no intervalo de 0 at� 10 ####\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("Insira a " + (i + 1) + "� nota: ");
			nota[i] = entrada.nextDouble();

			if (nota[i] < 0 || nota[i] > 10) {
				System.out.println("\nNota inv�lida, sistema encerrado.");
				break;
			}
		}

		media = ((nota[0] * a) + (nota[1] * b) + (nota[2] * c)) / (a + b + c);
		System.out.println("\nA m�dia ponderada das notas inseridas � " + media);
		entrada.close();

	}

}

/*
Exemplo de uma Sa�da do Console ap�s executar o c�digo:

#### Calculo da m�dia ponderada. Insira notas no intervalo de 0 at� 10 ####

Insira a 1� nota: 7
Insira a 2� nota: 8
Insira a 3� nota: 10

A m�dia ponderada das notas inseridas � 8.8

*/
