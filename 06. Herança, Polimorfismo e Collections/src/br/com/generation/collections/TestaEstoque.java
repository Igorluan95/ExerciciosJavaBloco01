package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

/* 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades: Armazenar dados da List, 
Remover dados da list, Atualizar dados da list, Apresentar todos os dados da list. * */

public class TestaEstoque {

	public static void main(final String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			try (Scanner sc = new Scanner(System.in)) {
				ArrayList<ProdutoNoEstoque> estoque = new ArrayList<>();

				int opcao = 0;

				System.out.println();
				System.out.println("                     LOJA SOUZA                    ");

				do {

					System.out.println("\n  ___________________________________________________");
					System.out.println("  |                                                 |");
					System.out.println("  |      1 - Apresentar os produtos em estoque      |");
					System.out.println("  |      2 - Adicionar um novo produto              |");
					System.out.println("  |      3 - Atualizar um produto por posi��o       |");
					System.out.println("  |      4 - Remover um produto por posi��o         |");
					System.out.println("  |      0 - Sair do Sistema                        |");
					System.out.println("  |_________________________________________________|");
					System.out.println("  |                                                 |");
					System.out.println("  |       [Digite um n�mero das op��es acima]       |");
					System.out.println("  |_________________________________________________|\n");

					opcao = sc.nextInt();

					System.out.println();
					switch (opcao) {

					case 1:

						System.out.println("LISTA DE PRODUTOS EM ESTOQUE: \n");
						for (int i = 0; i < estoque.size(); i++) {
							System.out.printf("Posi��o %d - %s\n", i, estoque.get(i));
						}
						if (estoque.size() < 1) {
							System.out.println("Nenhum produto em estoque.");

						}
						opcao = 0;
						break;

					case 2:
						System.out.print("INFORME QUANTOS PRODUTOS DESEJA INSERIR: ");

						int qtd = input.nextInt();
						input.nextLine();

						for (int i = 0; i < qtd; i++) {

							System.out.print("\nInsira o nome do " + (i + 1) + "� produto: ");
							final String nome = input.nextLine();
							System.out.print("Insira a quantidade que ser� adicionada ao estoque: ");
							int quantidade = sc.nextInt();
							estoque.add(new ProdutoNoEstoque(nome, quantidade));

						}
						opcao = 0;
						break;

					case 3:

						if (estoque.size() < 1) {
							System.out.println("Nenhum produto em estoque.");
						}

						else {
							System.out.println("LISTA DE PRODUTOS EM ESTOQUE: \n");
							for (int i = 0; i < estoque.size(); i++) {
								System.out.printf("Posi��o %d - %s\n", i, estoque.get(i));
							}

							System.out.printf("\nINFORME O N�MERO DA POSI��O DO PRODUTO QUE SER� ATUALIZADO:\n");
							int i = input.nextInt();

							try {
								System.out.print("\nInsira o nome do produto: ");
								final String nome = input.next();
								System.out.print("Insira a quantidade em estoque: ");
								int quantidade = sc.nextInt();

								estoque.set(i, new ProdutoNoEstoque(nome, quantidade));

							} catch (IndexOutOfBoundsException e) {

								System.out.printf("\nErro: posi��o inv�lida (%s).", e.getMessage());
							}

						}
						opcao = 0;
						break;

					case 4:
						if (estoque.size() < 1) {
							System.out.println("Nenhum produto em estoque.");
						}

						else {
							System.out.println("LISTA DE PRODUTOS EM ESTOQUE: \n");
							for (int i = 0; i < estoque.size(); i++) {
								System.out.printf("Posi��o %d - %s\n", i, estoque.get(i));
							}

							System.out.printf("\nINFORME O N�MERO DA POSI��O DO PRODUTO QUE SER� EXCLU�DO:\n");
							int i = input.nextInt();

							try {
								estoque.remove(i);
							} catch (IndexOutOfBoundsException e) {

								System.out.printf("\nErro: posi��o inv�lida (%s).", e.getMessage());
							}

						}

						opcao = 0;
						break;

					case 0:
						System.out.println("              SISTEMA ENCERRADO ");
						System.exit(0);
					default:
						System.out.print(" Essa n�o � uma opcao V�lida ");
						break;
					}

				} while (true);
			}
		}

	}

}



	/*Exemplo de Sa�da no Console:
	  
	 
                     LOJA SOUZA                    

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

1

LISTA DE PRODUTOS CADASTRADOS: 

Nenhum produto em estoque.

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

2

INFORME QUANTOS PRODUTOS DESEJA INSERIR: 1

Insira o nome do 1� produto: P�o
Insira a quantidade que ser� adicionada ao estoque: 5

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

3

LISTA DE PRODUTOS CADASTRADOS: 

Posi��o 0 - Produto: P�o | Quantidade: 5

INFORME O N�MERO DA POSI��O DO PRODUTO QUE SER� ATUALIZADO:
0

Insira o nome do produto: Biscoito
Insira a quantidade em estoque: 5

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

1

LISTA DE PRODUTOS CADASTRADOS: 

Posi��o 0 - Produto: Biscoito | Quantidade: 5

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

4

LISTA DE PRODUTOS CADASTRADOS: 

Posi��o 0 - Produto: Biscoito | Quantidade: 5

INFORME O N�MERO DA POSI��O DO PRODUTO QUE SER� EXCLU�DO:
0

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

1

LISTA DE PRODUTOS CADASTRADOS: 

Nenhum produto em estoque.

  ___________________________________________________
  |                                                 |
  |      1 - Apresentar os produtos em estoque      |
  |      2 - Adicionar um novo produto              |
  |      3 - Atualizar um produto por posi��o       |
  |      4 - Remover um produto por posi��o         |
  |      0 - Sair do Sistema                        |
  |_________________________________________________|
  |                                                 |
  |       [Digite um n�mero das op��es acima]       |
  |_________________________________________________|

0

              SISTEMA ENCERRADO 
*/
