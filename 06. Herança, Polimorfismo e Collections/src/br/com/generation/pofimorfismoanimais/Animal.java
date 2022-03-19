package br.com.generation.pofimorfismoanimais;


/* (Exercicio de Polimorfismo)
 * 
	 *01)  Implemente um programa que crie os 3 tipos de animais definidos
		e invoque 2 m�todos: um que emite o som e um que mostre o movimento de cada animal, de forma polim�rfica, isto �,
		independente do tipo de animal.
	 
			Cachorro: Emite som e corre
			Cavalo: Emite som e corre
			Pregui�a: Emite som e sobe em �rvore*/


public abstract class Animal {
	
	public abstract void som();
	
	public abstract void movimento();

}
	
	

