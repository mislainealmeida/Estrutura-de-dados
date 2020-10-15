package lista.labs;

public class Ex04Dinamica {
	
	private String dado;
	private Ex04Dinamica prox;
	
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}
	public Ex04Dinamica getProx() {
		return prox;
	}
	public void setProx(Ex04Dinamica prox) {
		this.prox = prox;
	}
	
	
	public Ex04Dinamica(String dadoNovo) {//lista vazia
		dado= dadoNovo;
		prox= null;
	}
	
	public Ex04Dinamica(String dadoNovo, Ex04Dinamica ligacao) {// dado recebe as informações e prox cria a ref para o proximo objeto (faz a ligacao)
		this.dado = dadoNovo;
		this.prox = ligacao;
	} 
	
	

}
