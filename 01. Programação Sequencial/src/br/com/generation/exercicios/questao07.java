package br.com.generation.exercicios;

import java.util.Scanner;

public class questao07 {
	/*
	 (Exercicio de Programa��o Sequencial)
	 
	 7. Um sistema de equa��es lineares do tipo ax + by = c e dx +ey = f pode ser resolvido segundo mostrado abaixo: 
	 x=[(ce-bf)/(ae-bd)] e y = [(af-cd)/(ae/bd)]. Escreva um sistema que l� os coeficientes a,b,c,d,e e f 
	 e calcula e mostra os  valores de x e y*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// vari�veis

		double a, b, c, d, e, f, x, y;

		// valores de entrada das vari�veis

		System.out.println("#### Sistema de equa��es linerares: ####\n");
		System.out.print("Entre com o valor do coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente c: ");
		c = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente d: ");
		d = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente e: ");
		e = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente f: ");
		f = sc.nextDouble();

		///// c�lculo e impress�o dos valores de x e y

		if ((a * e) - (b * d) == 0) {
			System.out.println("X e Y possuem valores indefinidos pois o denominador da equa��o � zero.");
		}

		else {
			x = ((c * e) - (b * f)) / ((a * e) - (b * d));
			y = ((a * f) - (c * d)) / ((a * e) - (b * d));
			System.out.println("\nPortanto, x = " + x + " e y = " + y);
		}

		System.out.println();

		sc.close();
	}

}

/*
Exemplo de uma Sa�da do Console ap�s executar o c�digo:

	#### Calculo da m�dia ponderada. Insira notas no intervalo de 0 at� 10 ####
	
	Insira a 1� nota: 7
	Insira a 2� nota: 8
	Insira a 3� nota: 9
	
	A m�dia ponderada das notas inseridas � 8,3
	*/
