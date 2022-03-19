package br.com.generation.exercicios;

import java.util.Scanner;


/*(Exercicio de La�o de Decis�o)
 * 
 * 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual 
categoria ela se encontra:
� 10-14 infantil
� 15-17 juvenil
� 18-25 adulto*/

public class questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int idade;

		System.out.println(
				"#### Programa para saber se a pessoa se encontra na categoria infatil, juvenil ou adulto.#### \n");
		System.out.print("Insira a idade da pessoa: ");
		idade = sc.nextInt();
		System.out.println();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Pessoa na categoria infantil.");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Pessoa na categoria juvenil.");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Pessoa na categoria adulto.");
		} else if (idade < 0 || idade > 130) {
			System.out.println("Idade inv�lida.");
		} else {
			System.out.println("Idade n�o encontrada nas categorias estabelecidas.");
		}
		sc.close();
	}
	
}

/*  	 Exemplo de uma Sa�da do Console ap�s executar o c�digo:
		 
		#### Programa para saber se a pessoa se encontra na categoria infatil, juvenil ou adulto.#### 
		
		Insira a idade da pessoa: 14
		
		Pessoa na categoria infantil.
		
		
		#### Programa para saber se a pessoa se encontra na categoria infatil, juvenil ou adulto.#### 

		Insira a idade da pessoa: -5
		
		Idade inv�lida.



	*/
