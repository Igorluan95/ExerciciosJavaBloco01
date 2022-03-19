package br.com.generation.pofimorfismoanimais;

/* (Exercicio de Polimorfismo)
 * 
	 *01)  Implemente um programa que crie os 3 tipos de animais definidos
		e invoque 2 m�todos: um que emite o som e um que mostre o movimento de cada animal, de forma polim�rfica, isto �,
		independente do tipo de animal.
	 
			Cachorro: Emite som e corre
			Cavalo: Emite som e corre
			Pregui�a: Emite som e sobe em �rvore*/

public class TestarAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("\n#### Exemplos de animais que emitem som e se movimentam de maneiras distintas: ####\n");
		
		cachorro.som();
		cachorro.movimento();
		System.out.println();
		cavalo.som();
		cavalo.movimento();
		System.out.println();
		preguica.som();
		preguica.movimento();
		
		
		/*
		Os 3 objetos (cachorro, cavalo e preguica) s�o do tipo Animal,
		isso pode ser confirmado atrav�s do uso do instanceo que retorna true para os 3 objetos
		
		System.out.println(cachorro instanceof Animal);
		System.out.println(cavalo instanceof Animal);
		System.out.println(preguica instanceof Animal);*/
		
				
	}
}


/*
 *#### Exemplos de animais que emitem som e se movimentam de maneiras distintas: ####

Som do cachorro: au au au...
Cachorro correndo...

Som do cavalo: rinh�ee rinh�e...
Cavalo correndo...

Som da pregui�a: uoxx uoxxe...
Pregui�a subindo na �rvore...
 
 */