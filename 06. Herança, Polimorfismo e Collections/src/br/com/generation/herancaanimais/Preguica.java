package br.com.generation.herancaanimais;

/* (Exercicio de Heran�a)
 * 
	 *01) Crie uma hierarquia de classes os atributos e comportamentos descritos, utilize os seus conhecimentos e distribua as
	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe Animal: 
	
	Cachorro: Possui nome, possui idade, deve emitir som e deve correr
	Cavalo: Possui nome, possui idade, deve emitir som e deve correr
	Pregui�a: Possui nome, possui idade, deve emitir som e deve subir em �rvore*/

public class Preguica extends Animal {

	private String acao = "sobe em �rvore";
	private String som = "\"uoxx uoxx\"";
	
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	
}
