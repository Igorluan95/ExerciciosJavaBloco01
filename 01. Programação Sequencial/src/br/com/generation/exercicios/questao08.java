package br.com.generation.exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


/*(Exercicio de Programa��o Sequencial)

8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao 
consumidor*/

public class questao08 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);

		// vari�veis
		double custoFabrica, dist = 0.28, imp = 0.45, custoConsumidor;

		System.out.println(
				"#### Custo de fabrica��o de um carro e quanto o consumidor paga por causa do acr�scimo do distribuidor e impostos sobre o carro: ####\n");

		// valor de entrada
		System.out.print("Entre com o custo de f�brica do carro: ");
		custoFabrica = sc.nextInt();

		if (custoFabrica > 0) {
			// c�lculo
			custoConsumidor = ((custoFabrica * dist) + (custoFabrica * imp) + custoFabrica);
			System.out.println("\nO custo de f�brica do carro � " + moeda.format(custoFabrica)
					+ ". O pre�o que chega para o consumidor � " + moeda.format(custoConsumidor) + ".");
		} else {
			System.out.println("\nPre�o inv�lido, digite um valor maior que zero.");
		}

		sc.close();
	}

}

/*
	Exemplo de uma Sa�da do Console ap�s executar o c�digo:
	
	#### Custo de fabrica��o de um carro e quanto o consumidor paga por causa do acr�scimo do distribuidor e impostos sobre o carro: ####
	
	Entre com o custo de f�brica do carro: 32150
	
	O custo de f�brica do carro � R$�32.150,00. O pre�o que chega para o consumidor � R$�55.619,50.
	*/
