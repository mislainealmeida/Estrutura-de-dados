package estrutura.aula07.busca.binaria;

public class Teste {

	public static void main(String[] args) {
		Colecao colecao= new Colecao();
		System.out.println("Posição do elemento 23: "+ colecao.buscaBinaria(23));
		System.out.println("Posição do elemento 12: "+ colecao.buscaBinaria(12));
		System.out.println("Posição do elemento 76: "+ colecao.buscaBinaria(76));
		System.out.println("Posição do elemento 99: "+ colecao.buscaBinaria(99));
		


	}

}
