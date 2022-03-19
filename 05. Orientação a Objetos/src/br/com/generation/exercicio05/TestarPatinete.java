package br.com.generation.exercicio05;

import java.util.Scanner;


/*(Exercicio de Orienta��o a Objetos)
 * 
5) Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class TestarPatinete {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Patinete p1 = new Patinete();

		
		System.out.println("#### Inserindo dados do Patinete ####\n");
		
		System.out.println("Fabricante: ");
		p1.setFabricante(input.nextLine());
		
		System.out.println("Modelo: ");
		p1.setModelo(input.nextLine());
		
		System.out.println("Insira a velocidade m�xima que pode ser atingida (Km/h): ");
		p1.setVelocidadeMax(input.nextInt());
		
		p1.dadosDoPatinete();
		
		System.out.println("\nFabricante: " + p1.getFabricante());			
		System.out.println("Modelo: "+ p1.getModelo());			
		System.out.println("Velocidade m�xima: "+ p1.getVelocidadeMax() + " Km/h.");
				
		p1.fim();
		
		input.close();
		
	}
	
	
}

/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		  
		#### Inserindo dados do Patinete ####

	Fabricante: 
	Atrio
	Modelo: 
	FUN X - Patinete el�trico
	Insira a velocidade m�xima que pode ser atingida (Km/h): 
	23
	
	Dados do Patinete:
	
	Fabricante: Atrio
	Modelo: FUN X - Patinete el�trico
	Velocidade m�xima: 23 Km/h.
	
	Programa Finalizado!
			 
 
 */
