package br.com.generation.exercicio07;

import java.util.Scanner;

/*(Exercicio de Orienta��o a Objetos)
 * 
6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class TestarPaciente {

	public static void main(String[] args) {

		Paciente p1 = new Paciente();
		Scanner input = new Scanner(System.in);

		p1.cadastrar();

		System.out.print("Insira o nome: ");
		p1.setNome(input.nextLine());

		System.out.print("Insira o CPF: ");
		p1.setCpf(input.next());

		System.out.print("Insira a Idade: ");
		p1.setIdade(input.nextInt());

		p1.dados();

		System.out.println("Paciente: " + p1.getNome());
		System.out.println("CPF: " + p1.getCpf());
		System.out.println("Idade: " + p1.getIdade());

		p1.fim();
		
		input.close();

	}
}

/*
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
				
		#### Cadastrar novo paciente: ####
		
		Insira o nome: Igor Luan Souza Silva
		Insira o CPF: 123.345.654-65
		Insira a Idade: 26
		
		Dados inseridos:
		
		Paciente: Igor Luan Souza Silva
		CPF: 123.345.654-65
		Idade: 26
		
		Sistema encerrado!
			 
 
 */
