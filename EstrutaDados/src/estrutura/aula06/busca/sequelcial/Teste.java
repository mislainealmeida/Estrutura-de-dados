package estrutura.aula06.busca.sequelcial;

public class Teste {

	public static void main(String[] args) {
		Colecao colecao= new Colecao();
		System.out.println("Posição do elemento 23: "+ colecao.buscaSequencial(23));
		System.out.println("Posição do elemento 12: "+ colecao.buscaSequencial(12));
		System.out.println("Posição do elemento 76: "+ colecao.buscaSequencial(76));
		System.out.println("Posição do elemento 99: "+ colecao.buscaSequencial(99));
		

	}

}
