package br.com.generation.LacosDeDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int num;
		double raiz, potencia; 
		
		System.out.println("Digite um n�meiro inteiro: ");
		num = entrada.nextInt();
		
		if(num % 2 ==0) {
			
			if(num>=0) {
				System.out.println("N�mero par.");
				raiz = Math.sqrt(num);
				System.out.println("Raiz quadrada: " + raiz);
			}
			else {
				System.out.println("N�mero par negativo sem raiz definida pois n�o existem dois n�meros reais onde o produto seja um n�mero negativo.");
			}
										
		}
		else {
			System.out.println("�mpar");
			potencia = Math.pow(num,2);
			System.out.println("Pot�ncia: " + potencia);
		}
		
		
		
		
		
		
		

	}

}
