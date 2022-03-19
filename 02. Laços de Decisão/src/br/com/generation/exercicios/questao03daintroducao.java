package br.com.generation.exercicios;

import java.util.Scanner;

/*
* /*# (Exercicio de Programa��o Sequencial)
* 
* * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
* expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

public class questao03daintroducao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempo, h, m, s;

		System.out.println("#### Tempo de dura��o de um evento expresso em horas, minutos e segundos. ####\n");

		System.out.print("Insira o tempo da dura��o do evento expresso em segundos(N�mero inteiro): ");
		tempo = sc.nextInt();

		h = tempo / 3600;
		m = (tempo % 3600) / 60;
		s = (tempo % 3600) % 60;

		if (tempo >= 0) {
			System.out.println("\nTempo de dura��o:\n" + h + "h " + m + "m " + s + "s");
		} else
			System.out.println("\nO valor inserido � inv�lido.");
		sc.close();

	}

}

/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		#### Tempo de dura��o de um evento expresso em horas, minutos e segundos. ####

		Insira o tempo da dura��o do evento expresso em segundos(N�mero inteiro): 3660
		
		Tempo de dura��o:
		1h 1m 0s

 * 
 */

