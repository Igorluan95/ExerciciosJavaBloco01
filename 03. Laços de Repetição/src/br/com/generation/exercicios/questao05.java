package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio de Repeti��o)
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

public class questao05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, soma = 0, i = 0;

		System.out.println(
				"#### Insira n�meros inteiros, ap�s o n�mero 0 ser digitado o programa apresenta a soma dos n�meros inseridos. #### \n");

		do {
			System.out.print("Insira o " + (i + 1) + "� n�mero: ");
			num = sc.nextInt();
			soma += num;
			i++;
		} while (num != 0);

		System.out.println("\nO n�mero 0 encerrou o programa. A soma dos n�meros digitados � " + soma + ".");

		sc.close();
	}

}

/* Exemplo de sa�da do Console ap�s executar o c�digo:
#### Insira n�meros inteiros, ap�s o n�mero 0 ser digitado o programa apresenta a soma dos n�meros inseridos. #### 

	Insira o 1� n�mero: 1
	Insira o 2� n�mero: 2
	Insira o 3� n�mero: 3
	Insira o 4� n�mero: 0
	
	O n�mero 0 encerrou o programa. A soma dos n�meros digitados � 6.


*/
