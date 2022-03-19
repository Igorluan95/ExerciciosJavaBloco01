package br.com.generation.exercicios;

import java.util.Scanner;

/*
(Exercicio de Programa��o Sequencial)

	5. Fa�a um sistema que leia as 3 notas
	de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia �
	ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	*/


public class questao05 {


	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);

		double A, B, C, media;
		double a = 2, b = 3, c = 5;

		System.out.println("#### Calculo da m�dia ponderada. Insira notas no intervalo de 0 at� 10 ####\n ");

		System.out.print("Insira a  1� nota: ");
		A = sc.nextDouble();
		System.out.print("Insira a  2� nota: ");
		B = sc.nextDouble();
		System.out.print("Insira a  3� nota: ");
		C = sc.nextDouble();

		media = ((A * a) + (B * b) + (C * c)) / (a + b + c);

		if (A < 0 || A > 10 || B < 0 || B > 10 || C < 0 || C > 10) {
			System.out.println("\nSistema encerrado, insira notas de 0 at� 10 e tente novamente.");

		}

		else

			System.out.printf("\nA m�dia ponderada das notas inseridas � %.1f ", media);

		sc.close();

	}

}

/*
 Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 
#### Calculo da m�dia ponderada. Insira notas no intervalo de 0 at� 10 ####
 
 Insira a 1� nota: 7
 Insira a 2� nota: 8
 Insira a 3� nota: 9
 
 A m�dia ponderada das notas inseridas � 8,3
 */
