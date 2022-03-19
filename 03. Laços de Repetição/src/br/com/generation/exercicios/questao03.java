package br.com.generation.exercicios;

import java.util.Scanner;

/*(Exercicio de Repeti��o)
	 * 3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 
	anos. Total de pessoas com mais de 50 anos. O programa termina quando idade 
	for =-99. */

public class questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = 0, menos21 = 0, mais50 = 0;

		System.out.println("#### Entre com a idade de v�rias pessoas e o programa retorna quantas pessoas tem menos"
				+ " de 21 anos \ne quantas pessoas tem mais de 50 anos. (Para encerrar o programa insira a idade -99) \n");

		while (idade != -99) {
			System.out.print("Insira uma idade v�lida: ");
			idade = sc.nextInt();
			if (idade < 0 && idade != -99) {
				System.out.println("Idade inv�lida, essa idade n�o entrar� para a contagem das idades.");
			}

			else if (idade >= 0 && idade < 21) {
				menos21 += 1;
			} else if (idade > 50) {
				mais50 += 1;
			} else if (idade == -99) {
				System.out.println("\n(-99 n�o entrar� para a contagem das idades, programa finalizado.)\n ");
			}

		}
		System.out.println("N�mero de pessoas com menos de 21 anos: " + menos21
				+ "\nN�mero de pessoas com mais de 50 anos: " + mais50);
		sc.close();
	}

}

/*
Exemplo de sa�da do Console ap�s executar o c�digo:

#### Entre com a idade de v�rias pessoas e o programa retorna quantas pessoas tem menos de 21 anos 
e quantas pessoas tem mais de 50 anos. (Para encerrar o programa insira a idade -99) 

Insira uma idade v�lida: -5
Idade inv�lida, essa idade n�o entrar� para a contagem das idades.
Insira uma idade: 15
Insira uma idade: 55
Insira uma idade: -99

(-99 n�o entrar� para a contagem das idades, programa finalizado.)
 
N�mero de pessoas com menos de 21 anos: 1
N�mero de pessoas com mais de 50 anos: 1

*/
