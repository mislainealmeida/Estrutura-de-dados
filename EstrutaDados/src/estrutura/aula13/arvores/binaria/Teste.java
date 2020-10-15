package estrutura.aula13.arvores.binaria;


public class Teste {

	public static void main(String[] args) {
		Elemento elemento= new Elemento(0);
		Arvore arvore = new Arvore(new Elemento(8));
		arvore.inserir(new Elemento (5));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(7));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		
		System.out.println("Pré- ordem: ");
		arvore.imprimirPreOrdem();
		System.out.println();
		
		System.out.println("In-ordem: ");
		arvore.imprimirInOrdem();
		System.out.println();
		
		System.out.println("Pós-ordem: ");
		arvore.imprimirPosOrdem();
		System.out.println();
		
		
		
		
		
		
	}
}
