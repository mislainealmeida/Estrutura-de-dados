package estrutura.aula15.arvores.avl;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Arvore arvore= new Arvore (new Elemento (teclado.nextInt()));
		arvore.calcularBalanceamento();
		arvore= arvore.verificaBalanceamento();
		System.out.println(arvore.printArvore(0));
		
		while(true) {
			arvore= arvore.inserir(new Elemento (teclado.nextInt()));
			arvore.calcularBalanceamento();
			arvore.verificaBalanceamento();
			System.out.println(arvore.printArvore(0));
		}
	}

}
