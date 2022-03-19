package br.com.generation.herancaanimais;

import java.util.Scanner;

/* (Exercicio de Heran�a)
 * 
	 *01) Crie uma hierarquia de classes os atributos e comportamentos descritos, utilize os seus conhecimentos e distribua as
	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal: 
	
	Cachorro: Possui nome, possui idade, deve emitir som e deve correr
	Cavalo: Possui nome, possui idade, deve emitir som e deve correr
	Pregui�a: Possui nome, possui idade, deve emitir som e deve subir em �rvore*/

public class TestarAnimais {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("#### Exemplo de Heran�a com animais ####\n");
		
		System.out.println("Insira os dados do Cachorro, Cavalo e Bicho Pregui�a:");
		
		System.out.print("\nNome do cachorro: ");
		cachorro.setNome(input.next());
		System.out.print("Idade: ");
		cachorro.setIdade(input.nextInt());
		
			
		System.out.print("\nNome do bicho pregui�a: ");
		preguica.setNome(input.next());
		System.out.print("Idade: ");
		preguica.setIdade(input.nextInt());
		
		System.out.print("\nNome do cavalo: ");
		cavalo.setNome(input.next());
		System.out.print("Idade: ");		
		cavalo.setIdade(input.nextInt());
		
		
		System.out.println("\nInforma��es sobre os animais:");

		
		System.out.println("\n"+cachorro.getNome()+" � um cachorro de " + cachorro.getIdade() + " anos que " + cachorro.getAcao() + " e seu som caracteristico � " + cachorro.getSom()+".");
					
		System.out.println(preguica.getNome()+" � um bicho pregui�a de " + preguica.getIdade() + " anos que " + preguica.getAcao() + " e seu som caracteristico � " + preguica.getSom()+".");
			
		System.out.println(cavalo.getNome()+" � um cavalo de " + cavalo.getIdade() + " anos que " + cavalo.getAcao() + " e seu som caracteristico � " + cavalo.getSom()+".");
		
		
		input.close();
		
	}
}


/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
		  
			#### Exemplo de Heran�a com animais ####
			
			Insira os dados do Cachorro, Cavalo e Bicho Pregui�a:
			
			Nome do cachorro: Amigo
			Idade: 5
			
			Nome do bicho Pregui�a: pregui�a
			Idade: 6
			
			Nome do cavalo: Pocot�
			Idade: 3
			
			Informa��es sobre os animais:
			
			Amigo � um cachorro de 5 anos que corre e seu som caracteristico � "au au au au".
			Pregui�a � um bicho pregui�a de 6 anos que sobe em �rvore e seu som caracteristico � "uoxx uoxx".
			Pocot� � um cavalo de 3 anos que corre e seu som caracteristico � "rinh�ee rinh�e".
			 
 
 */