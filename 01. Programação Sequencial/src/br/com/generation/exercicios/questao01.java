package br.com.generation.exercicios;

import java.util.Scanner;

/*# (Exercicio de Programa��o Sequencial)
 * 
	 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/

public class questao01 {

	public static void main(String[] args) {

		int TotalDiasNoAno = 365;
		int TotalDiasNoMes = 30;
		int dias, meses, anos;
		Scanner sc = new Scanner(System.in);

		System.out.println("##### Idade de uma pessoa expressa em dias ##### \n");

		System.out.print("Insira quantos anos completos a pessoa tem: ");
		anos = sc.nextShort();

		System.out.print("Insira quantos meses completos se passaram ap�s o anivers�rio da pessoa: ");
		meses = sc.nextShort();

		System.out.print("Insira quantos dias se passaram ap�s o �ltimo m�s completo citado anteriormente: ");
		dias = sc.nextShort();

		dias += (TotalDiasNoAno * anos) + (TotalDiasNoMes * meses);

		System.out.println("\nA pessoa tem " + dias + " dias de idade!");

		sc.close();
	}

}

/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		  
		  ##### Idade de uma pessoa expressa em dias #####
		  
		  Insira quantos anos completos a pessoa tem: 1 Insira quantos meses completos
		  se passaram ap�s o anivers�rio da pessoa: 0 Insira quantos dias se passaram
		  ap�s o �ltimo m�s completo citado anteriormente: 1
		  
		 A pessoa tem 366 dias de idade!
 
 
 */

