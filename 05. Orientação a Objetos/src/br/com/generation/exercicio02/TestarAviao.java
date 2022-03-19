package br.com.generation.exercicio02;

import java.util.Scanner;

/*(Exercicio de Orienta��o a Objetos)
 * 
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta
classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e
apresente as informa��es deste objeto no console.*/

public class TestarAviao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Aviao a1 = new Aviao();
		
		System.out.println("#### Inserindo dados de um Avi�o ####\n");
		
		System.out.println("Fabricante: ");
		a1.setFabricante(input.nextLine());
		System.out.println("Modelo: ");
		a1.setModelo(input.nextLine());
		System.out.println("Tipo de uso: ");
		a1.setUso(input.nextLine());
		System.out.println("Quantidade m�xima de passageiros: ");
		a1.setQtdPassageiros(input.nextInt());
		System.out.println("Insira a velocidade m�nima para levantar voo (km/h): ");
		a1.setVelocidadeVoo(input.nextInt());
		System.out.println("Insira a velocidade m�xima que pode ser atingida durante o voo (km/h): ");
		a1.setVelocidadeMax(input.nextInt());

		System.out.println("\nDados do avi�o:\n");
		
		System.out.println("Fabricante: "+ a1.getFabricante());
		System.out.println("Fabricante: "+ a1.getModelo());
		System.out.println("Fabricante: "+ a1.getUso());
		System.out.println("Fabricante: "+ a1.getQtdPassageiros());
		
		a1.dadosVelocidade();

		a1.levantarVoo(a1.getVelocidadeVoo());
		System.out.println("\nEsse tipo de avi�o decola com a velocidade m�nima de " + a1.getVelocidadeVoo() + "Km/h.");

		a1.acelerarMax(a1.getVelocidadeMax());
		System.out.println("\nA velocidade m�xima atingida pode chegar at� " + a1.getVelocidadeMax() + "Km/h.");

		input.close();

	}

}

/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		  
		#### Iniciando vooInserindo dados de um Avi�o ####
		
		Fabricante: 
		Embraer
		Modelo: 
		E-195
		Tipo de uso: 
		Comercial
		Quantidade m�xima de passageiros: 
		124
		Insira a velocidade m�nima para levantar voo (km/h): 
		280
		Insira a velocidade m�xima que pode ser atingida durante o voo (km/h): 
		890
		
		Dados do avi�o:
		
		Fabricante: Embraer
		Fabricante: E-195
		Fabricante: Comercial
		Fabricante: 124
		
		Dados da velocidade:
				
		Esse tipo de avi�o decola com a velocidade m�nima de 280Km/h.
		
		A velocidade m�xima atingida pode chegar at� 890Km/h.
			 
 
 */
