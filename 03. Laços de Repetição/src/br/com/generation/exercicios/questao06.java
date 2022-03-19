package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * (Exercicio de Repeti��o)
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
 * 0(zero).(
 */

public class questao06 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		int num, i = 0;
		double media, soma=0, qtd=0;

		System.out.println("#### M�dia dos n�meros inteiros m�ltiplos de 3 que foram inseridos.####\n  (Para encerrar o programa e obter o resultado insire o n�mero 0.) \n");

		do {
			System.out.print("Insira o " + (i+1) + "� n�mero: ");
			num = sc.nextInt();

			if (num % 3 == 0) {
				soma += num;
				qtd++;
				i++;
			}
			else {
				i++;
			}
						
		} while (num != 0); 
		
		media=(soma/(qtd-1)); 
		
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 inseridos � " + df.format(media) +".") ;

		sc.close();

	}

}

/*
 * 
/* Exemplo de sa�da do Console ap�s executar o c�digo:
#### M�dia dos n�meros inteiros m�ltiplos de 3 que foram inseridos.####
  (Para encerrar o programa e obter o resultado insire o n�mero 0.) 

	Insira o 1� n�mero: 2
	Insira o 2� n�mero: 4
	Insira o 3� n�mero: 3
	Insira o 4� n�mero: 3
	Insira o 5� n�mero: 0

A m�dia dos n�meros m�ltiplos de 3 inseridos � 3.



*/
