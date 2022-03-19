package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/* (Exercicio de Array)
 * 4 Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�   */

public class questao04daintroducao {
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		DecimalFormat arredondar = new DecimalFormat("######.##");
		int[] numero = new int [3];
		double D, R, S;
		String[] letra = {"A","B","C"};
				
		System.out.println("Sistema para calcular a express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�.\n(Esse sistema s� aceita n�meros inteiros e positivos.)\n");
		for (int i = 0; i<3; i++) {
			System.out.print("Digite o valor de "+ letra[i]+": ");
			numero[i] = sc.nextInt();
				if(numero[i]<=0) {
					System.out.println("O n�mero inserido � invalido, o n�mero precisa ser maior que zero. Sistema encerrado.");
					break;
					}				
		}
		
		if (numero[0]>0 && numero[1]>0 && numero[2]>0) {
		R = (int) Math.pow((numero[0]+numero[1]),2);
		S = (int) Math.pow((numero[1]+numero[2]),2);
		D = (R+S)/2;
		System.out.println("\nD = " +arredondar.format(D));
		}
		sc.close();
		

	}

}

/* Exemplo de resultado mostrado no console:

Sistema para calcular a express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�.
(Esse sistema s� aceita n�meros inteiros e positivos.)

Digite o valor de A: 6
Digite o valor de B: 5
Digite o valor de C: -5
O n�mero inserido � invalido, o n�mero precisa ser maior que zero. Sistema encerrado.

Exemplo de resultado mostrado no console:

Sistema para calcular a express�o: D=[(R+S)/2], onde R=(A+B)� e S=(B+C)�.
(Esse sistema s� aceita n�meros inteiros e positivos.)

Digite o valor de A: 5
Digite o valor de B: 6
Digite o valor de C: 90

D = 4668,5

*/

