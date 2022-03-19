package br.com.generation.exercicios;

import java.util.Scanner;

/*(Exercicio de Programa��o Sequencial e La�o de Decis�o)
 * 
 * 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
 * expressa em anos, meses e dias.
 */

public class questao02daintroducao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int diasTotais, anos, meses, dias;

		System.out.println("##### Idade de uma pessoa expressa em anos, meses e dias. #####\n");

		System.out.print("Insira a idade da pessoa em dias: ");
		diasTotais = sc.nextInt();

		anos = diasTotais / 365;
		meses = (diasTotais % 365) / 30;
		dias = (diasTotais % 365) % 30;

		if (diasTotais < 0 || diasTotais > 47190) {
			System.out.print("\nIdade inv�lida. Insira um valor entre 0 e 47190.");
		} else {
			System.out.print("\nAnos de idade: " + anos + " \nMeses de idade: " + meses + " \nDias de idade: " + dias);
		}
		sc.close();
	}

}
	
/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		 ##### Idade de uma pessoa expressa em anos, meses e dias. #####
		
		Insira a idade da pessoa em dias: 365
		
		Anos de idade: 1 
		Meses de idade: 0 
		Dias de idade: 0
 * 
 */