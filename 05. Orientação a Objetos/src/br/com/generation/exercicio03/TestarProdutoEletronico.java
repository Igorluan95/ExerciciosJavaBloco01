package br.com.generation.exercicio03;
import java.text.DecimalFormat;
import java.util.Scanner;

/*(Exercicio de Orienta��o a Objetos)
 * 
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/


public class TestarProdutoEletronico {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.00");
		ProdutoEletronico p1 = new ProdutoEletronico();
		Scanner input = new Scanner(System.in);

		System.out.println("#### Iniciando inser��o de dados e consulta de pre�o a vista ####\n");

		System.out.println("Insira o nome do produto: ");
		p1.setNome(input.nextLine());

		System.out.println("Insira a marca do produto: ");
		p1.setMarca(input.nextLine());

		System.out.println("Insira o ano de fabrica��o do produto: ");
		p1.setAno(input.nextInt());

		System.out.println("Insira o pre�o do produto: ");
		p1.setPreco(input.nextDouble());

		while ((p1.getPreco()) <= 0) {
			System.out.println("(O pre�o precisa ser maior que zero).");
			System.out.println("Insira o pre�o do produto: ");
			p1.setPreco(input.nextDouble());
		}

		System.out.println("Digite 1 para compra em dinheiro ou outro n�mero para conta com cart�o: ");
		p1.setPagamento(input.nextInt());

		if (p1.getPagamento() == 1) {
			p1.pagarComDinheiro(p1.getPreco());
	   }

		p1.processar();

		System.out.println("Produto: " + p1.getNome());
		System.out.println("Marca: " + p1.getMarca());
		System.out.println("Ano de fabrica��o: " + p1.getAno());
		System.out.println("Pre�o: R$ " + df.format(p1.getPreco()));

		if ((p1.getPagamento() == 1)) {
			System.out.println("Paga pagamento em dinheiro o pre�o abaixa para R$ " + df.format(p1.getPrecoPagar()));
		}

		else {
			System.out.println("Sem desconto para pagamento em cart�o.");
		}

		p1.concluir();

		input.close();
	}
}
/*
 * 
 * Exemplo de uma Sa�da do Console ap�s executar o c�digo:
 * 
	#### Iniciando inser��o de dados e consulta de pre�o a vista ####
	
	Insira o nome do produto: 
	Galaxy S20
	Insira a marca do produto: 
	Samsung
	Insira o ano de fabrica��o do produto: 
	2020
	Insira o pre�o do produto: 
	4277
	Digite 1 para compra em dinheiro ou outro n�mero para conta com cart�o: 
	1
	
	Dados processados...
	
	Produto: Galaxy S20
	Marca: Samsung
	Ano de fabrica��o: 2020
	Pre�o: R$ 4.277,00
	Paga pagamento em dinheiro o pre�o abaixa para R$ 3.849,30
	
	Consulta conclu�da!

 * 
 * 
 */
