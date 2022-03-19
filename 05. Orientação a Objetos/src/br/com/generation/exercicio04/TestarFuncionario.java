package br.com.generation.exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

/*(Exercicio de Orienta��o a Objetos)
 * 
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class TestarFuncionario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		Funcionario f1 = new Funcionario();
		

		System.out.println("#### Consulta de funcion�rios ####\n");

		System.out.println("Insira o nome: ");
		f1.setNome(input.nextLine());

		System.out.println("Insira o CPF: ");
		f1.setCpf(input.nextLine());

		System.out.println("Insira o cargo: ");
		f1.setCargo(input.nextLine());

		System.out.println("Insira o sal�rio: ");
		f1.setSalario(input.nextDouble());

		f1.processar();

		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Sal�rio: R$ " + df.format(f1.getSalario()));
		
		f1.concluir();

		input.close();
	}
	
	
}

/*
 * 
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
	#### Consulta de funcion�rios ####
	
				Insira o nome: 
				Amanda Ara�jo
				Insira o CPF: 
				123.456.789-43
				Insira o cargo: 
				Desenvolvedora Jr.
				Insira o sal�rio: 
				3500
				
				Dados processados...
				
				Nome: Amanda Ara�jo
				CPF: 123.456.789-43
				Cargo: Desenvolvedora Jr.
				Sal�rio: R$3.500,00
				
				Consulta conclu�da!

 * 
 * 
 */
