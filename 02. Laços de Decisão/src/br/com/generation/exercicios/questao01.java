package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio de La�o de Decis�o)

 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */

public class questao01 {

	public static void main(String[] args) {

		int num1, num2, num3, maior = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"#### Insira 3 n�meros e o programa retornar� com uma mensagem dizendo qual deles � o maior ####\n");

		System.out.print("Insira o 1� n�mero: ");
		num1 = sc.nextInt();

		System.out.print("Insira o 2� n�mero: ");
		num2 = sc.nextInt();

		System.out.print("Insira o 3� n�mero: ");
		num3 = sc.nextInt();

		if (num1 >= maior) {

			maior = num1;
		}

		if (num2 >= maior) {

			maior = num2;
		}

		if (num3 >= maior) {

			maior = num3;
		}

		System.out.println("\nO maior n�mero inserido foi o " + maior + ".");

		sc.close();

	}

}

/*
   Exemplo de uma Sa�da do Console ap�s executar o c�digo:
  
		#### Insira 3 n�meros e o programa retornar� com uma mensagem dizendo qual deles � o maior ####
		
		Insira o 1� n�mero: -10
		Insira o 2� n�mero: 0
		Insira o 3� n�mero: 12
		
		O maior n�mero inserido foi o 12.
 
 
 */

