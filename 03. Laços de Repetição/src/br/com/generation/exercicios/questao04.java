package br.com.generation.exercicios;

import java.util.Scanner;


/*  4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos
  de uma regi�o. Para tanto, a cada uma das pessoas 
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
pessoas, calcule e mostre: (WHILE)
	� o n�mero de pessoas calmas
	� o n�mero de mulheres nervosas
	� o n�mero de homens agressivos
	� o n�mero de outros calmos
	� o n�mero de pessoas nervosas com mais de 40 anos
	� o n�mero de pessoas calmas com menos de 18 anos
	*/

public class questao04 {

	public static void main(String[] args) {

		int idade=0, sexo, psi, qtdDados = 0, i = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, pessoasNervosas40 = 0, pessoasCalmas18 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("#### CARACTER�STICAS PSICOL�GICAS DA EMPRESA ####");
		System.out.println(
				"\n(Para serem contabilizados, os dados devem ser preenchidos com n�meros inteiros e devem respeitar as op��es.)\n");

		System.out.print("Insira a quantidade de pessoas que ter�o dados coletados (Valor m�ximo 150): ");
		qtdDados = sc.nextInt();
		if (qtdDados > 150) {
			qtdDados = 150;
			System.out.println("A quantidade m�xima foi excedida, o sistema aceitar� 150 dados.");
		}

		while (i < qtdDados && idade >=0 && idade <=130) {
			System.out.println("\nDados da " + (i + 1) + "� pessoa:");
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Sexo (1-feminino, 2-masculino, 3-outros): ");
			sexo = sc.nextInt();
			System.out.print("Caracter�stica psicol�gica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): ");
			psi = sc.nextInt();

			if (psi == 1) {
				pessoasCalmas++;
			}
			if (sexo == 1 && psi == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && psi == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && psi == 1) {
				outrosCalmos++;
			}
			if (idade > 40 && psi == 2) {
				pessoasNervosas40++;
			}
			if (idade < 18 && psi == 1) {
				pessoasCalmas18++;
			}
			i++;
		}

		if (qtdDados <= 0) {
			System.out.println("\nSistema encerrado, a quantidade m�nima para coleta de dados � 1.");
		}
		if (idade <0 || idade >130) {
			System.out.println("\nSistema encerrado, a idade � inv�lida e imposs�vel continuar. A idade precisa ser entre entre 0 e 130.");
		}

		else {
			System.out.println();
			System.out.println("Resultados:");
			System.out.println("N�mero de pessoas calmas: " + pessoasCalmas);
			System.out.println("N�mero de mulheres nervosas: " + mulheresNervosas);
			System.out.println("N�mero de homens agressivos: " + homensAgressivos);
			System.out.println("N�mero de outros calmos: " + outrosCalmos);
			System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + pessoasNervosas40);
			System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + pessoasCalmas18);
		}

		sc.close();
	}
}


/*
Exemplo de sa�da do Console ap�s executar o c�digo:

#### CARACTER�STICAS PSICOL�GICAS DA EMPRESA ####

		(Para serem contabilizados, os dados devem ser preenchidos com n�meros inteiros e devem respeitar as op��es.)
		
		Insira a quantidade de pessoas que ter�o dados coletados (Valor m�ximo 150): 4
		
		Dados da 1� pessoa:
		Idade: 15
		Sexo (1-feminino, 2-masculino, 3-outros): 1
		Caracter�stica psicol�gica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 1
		
		Dados da 2� pessoa:
		Idade: 55
		Sexo (1-feminino, 2-masculino, 3-outros): 3
		Caracter�stica psicol�gica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 2
		
		Dados da 3� pessoa:
		Idade: 50
		Sexo (1-feminino, 2-masculino, 3-outros): 3
		Caracter�stica psicol�gica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 1
		
		Dados da 4� pessoa:
		Idade: 20
		Sexo (1-feminino, 2-masculino, 3-outros): 2
		Caracter�stica psicol�gica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 3
		
		Resultados:
		N�mero de pessoas calmas: 2
		N�mero de mulheres nervosas: 0
		N�mero de homens agressivos: 1
		N�mero de outros calmos: 1
		N�mero de pessoas nervosas com mais de 40 anos: 1
		N�mero de pessoas calmas com menos de 18 anos: 1

*/