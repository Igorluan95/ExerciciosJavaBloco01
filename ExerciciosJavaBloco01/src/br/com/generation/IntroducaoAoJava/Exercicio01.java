package br.com.generation.IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);
		
		int diasAno=365, diasMes=30, idadeAnos, mes, dia, idadeDias=0;
		
		
		System.out.println("Insira quantos anos completos a pessoa tem (Entrar com n�mero a partir de 0):");
		idadeAnos = entrada.nextInt();
		
	
		
		System.out.println("\nInsira em qual m�s estamos (Entrar com n�mero de 1 at� 12):");		
		mes = entrada.nextInt();
		
				
		System.out.println("\nInsira o dia do m�s atual (de 1 at� 30):");		
		dia = entrada.nextInt();		
		
		
		
		idadeDias = (idadeAnos*diasAno) + ((mes-1)*diasMes) + dia ;
		
		
		if ((idadeAnos<0 || idadeAnos>140) || (mes<1 || mes>12) || (dia<1 || dia >30) ) {
			System.out.println("\nO usu�rio entrou com dados inv�lidos, insira os dados corretamente respeitando os intervalos estabelecidos.");
		}
		
		else {
		System.out.println("\nEssa pessoa tem "+ idadeDias + " dias de idade. ");}
		
		
		
		
		

	}

}
