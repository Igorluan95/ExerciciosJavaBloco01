package br.com.generation.exercicio06;

import java.util.Scanner;

/*(Exercicio de Orienta��o a Objetos)
 * 
6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class TestarConta {


	public static void main(String[] args) {
	Conta c1 = new Conta();
	Scanner input = new Scanner(System.in);
	
	/* 	 * 
	 * Contas cadastradas: [Utilizar para teste]
	 * 
	 * (conta = 1234, agencia = 1234, senha = 1234 )
	 * (conta = 4321, agencia = 4321, senha = 4321 )
	 * (conta = 1233, agencia = 1233, senha = 1233 )
	 * 
	 */
	

	System.out.println("#### Acessar conta banc�ria ####\n");
	
	c1.dados();
	
	System.out.print("Conta: ");
	c1.setConta(input.nextInt());
	
	System.out.print("Ag�ncia: ");
	c1.setAgencia(input.nextInt());
	
	System.out.print("Senha: ");
	c1.setSenha(input.nextInt());
	
	c1.entrar();
	
	input.close();
		
	}

}

/* 
	    Contas cadastradas: [Utilizar para teste]
	 
	    (conta = 1234, agencia = 1234, senha = 1234 )
	    (conta = 4321, agencia = 4321, senha = 4321 )
	    (conta = 1233, agencia = 1233, senha = 1233 )
	   
	 
 ----------------------------------------------------------------------
 
 
  Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 
		  
		#### Acessar conta banc�ria ####
		
		Insira os dados para acessar a conta existente:
		
		Conta: 1235
		Ag�ncia: 2563
		Senha: 2156
		
		Dados inv�lidos ou conta inexistente, tente novamente.
		
		
-------------------------------------------------------------------------
		
		
		#### Acessar conta banc�ria ####

		Insira os dados para acessar a conta existente:
		
		Conta: 1234
		Ag�ncia: 1234
		Senha: 1234
		
		Acesso permitido!
		
		Bem vindo, Igor
		Saldo em conta: R$ 495.000,00
 
 */




