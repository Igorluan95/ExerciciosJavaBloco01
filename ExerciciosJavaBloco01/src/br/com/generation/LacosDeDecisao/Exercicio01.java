package br.com.generation.LacosDeDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("Entre com o 1� n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Entre com o 3� n�mero: ");
		num3 = entrada.nextInt();
		                            // 10, 2, 5
		if (num1 > num2){        
			if(num1<num3){       
				maior=num3;}     			                      
			else {                  
				maior=num1;}	 			
		}
		
		else {
			if (num2 < num3) {
				maior = num3;}
			else
				{maior=num2;}
						
		}
					
			
			
		System.out.println("\nO maior n�mero inserido � o " + maior + ".");
		
		
		}
		
		
		
		
		

	}


