package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/* (Exercicio de La�o de Decis�o)
  
	 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.
	 
 */

public class questao04 {

	public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat("######.##");
		Scanner sc = new Scanner(System.in);
		int num;
		double raiz, potencia;

		System.out.print("#### Digita um n�mero que o sistema retornar� se ele � �mpar ou par.\nSe for �mpar tamb�m ser� apresentado o valor do n�mero ao quadrado\ne se for par ser� apresentado o valor da ra�z quadrada dele. ####");
		
		System.out.print("\n\nDigite um n�meiro inteiro: ");
		num = sc.nextInt();

		if (num % 2 == 0) {

			if (num >= 0) {
				raiz = Math.sqrt(num);
				System.out.println("\nO n�mero "+num+" � par e sua raiz quadrada � "+dec.format(raiz)+".");
				
			} else {
				System.out.println(
						"\nO n�mero "+num+" n�o tem raiz definida, n�o existem dois n�meros reais onde o produto seja um n�mero negativo.");
			}

		} else {
			potencia = Math.pow(num, 2);
			System.out.println(
					"\nO n�mero "+num+" � impar e quando elevado ao quadrado resulta em "+potencia+".");
		}
		sc.close();
	}

}


/* Exemplo de uma Sa�da do Console ap�s executar o c�digo:

#### Digita um n�mero que o sistema retornar� se ele � �mpar ou par.
Se for �mpar tamb�m ser� apresentado o valor do n�mero ao quadrado
e se for par ser� apresentado o valor da ra�z quadrada dele. ####

Digite um n�meiro inteiro: -2

O n�mero -2 n�o tem raiz definida, n�o existem dois n�meros reais onde o produto seja um n�mero negativo.


#### Digita um n�mero que o sistema retornar� se ele � �mpar ou par.
Se for �mpar tamb�m ser� apresentado o valor do n�mero ao quadrado
e se for par ser� apresentado o valor da ra�z quadrada dele. ####

Digite um n�meiro inteiro: 3

O n�mero 3 � impar e quando elevado ao quadrado resulta em 9.0.


* */