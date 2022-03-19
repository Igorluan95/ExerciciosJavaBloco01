package br.com.generation.exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * (Exercicio de Array) 2. Um dado � lan�ado 10 vezes e o valor correspondente �
 * anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse
 * vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior
 * pontua��o.
 */

public class questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);

		System.out.println(
				"#### Lan�amento autom�tico de um dado, m�dia dos valores que aparecem, qual maior valor apareceu e quantas vezes ele apareceu. ####\n");

		int[] num = new int[10];
		double soma = 0, media = 0;
		int qtd = 0, maior = 0;

		for (int i = 0; i < 10; i++) {
			num[i] = rd.nextInt(1, 7);

			soma += num[i];
			media = (soma) / (i + 1);

			if (num[i] > maior) {
				maior = num[i];
				qtd = 1;
			} else if (num[i] == maior) {
				qtd++;
			}

			System.out.println("Valor no " + (i + 1) + "� lan�amento: " + num[i]);

		}
		if (qtd == 1) {
			System.out.println("\nA m�dia dos valores dos lan�amentos foi " + numberFormat.format(media)
					+ ".\nO maior n�mero que apareceu foi o " + maior + " e ele apareceu " + qtd + " vez.");
		} else {
			System.out.println("\nA m�dia dos valores dos lan�amentos foi " + numberFormat.format(media)
					+ ".\nO maior n�mero que apareceu foi o " + maior + " e ele apareceu " + qtd + " vezes.");

		}
		sc.close();
	}

}

/*
 * /* #### Lan�amento autom�tico de um dado, m�dia dos valores que aparecem,
 * qual maior valor apareceu e quantas vezes ele apareceu. ####
 * 
 * Valor no 1� lan�amento: 6 Valor no 2� lan�amento: 6 Valor no 3� lan�amento: 5
 * Valor no 4� lan�amento: 4 Valor no 5� lan�amento: 6 Valor no 6� lan�amento: 1
 * Valor no 7� lan�amento: 3 Valor no 8� lan�amento: 6 Valor no 9� lan�amento: 3
 * Valor no 10� lan�amento: 3
 * 
 * A m�dia dos valores dos lan�amentos foi 4,3. O maior n�mero que apareceu foi
 * o 6 e ele apareceu 4 vezes.
 * 
 * 
 * 
 * 
 */
