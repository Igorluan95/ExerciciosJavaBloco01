package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;


/* (Exercicio de Programa��o Sequencial)
	 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
	 calcule a seguinte express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�
	 */

public class questao04 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("######.##");

		double D, R, S;
		int A, B, C;
		System.out.println(
				"#### Sistema para calcular a express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�. #### \n(Esse sistema s� aceita n�meros inteiros e positivos.)\n");

		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();

		if (A < 0 || B < 0 || C < 0) {
			System.out.println("\nSistema encerrado, esse sistema s� aceita n�meros inteiros e positivos.");
		}
		if (A > 0 && B > 0 && C > 0) {
			R = (int) Math.pow((A + B), 2);
			S = (int) Math.pow((B + C), 2);
			D = (R + S) / 2;
			System.out.println("\nD = " + dec.format(D));

			sc.close();
		}

	}

}

/*
Exemplo de uma Sa�da do Console ap�s executar o c�digo:
		  
#### Sistema para calcular a express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�. #### 
(Esse sistema s� aceita n�meros inteiros e positivos.)

Digite o valor de A: 5
Digite o valor de B: 15
Digite o valor de C: 30

D = 1212,5
 */
