package br.com.generation.OrientacaoAObjetos;

public class Questao01Cliente {
	
	//Atributos ou Caracteristicas de Clientes
	
	String nome;
	String endereco;
	String celular;
	String email;
	String dataNasc;
	double totalCompra;
	
	
	
	
	//M�todos ou A��es de Clientes
	
	public void valorNovoProduto(double valorAdicionado) {
        totalCompra = totalCompra + valorAdicionado;
    }
    

    public void descontar(double desconto) {
       totalCompra = totalCompra - desconto;
    }
    


    
   
    
	
	
	

}
