package lista.labs;

public class Ex01Teste {

	public static void main(String[] args) {
		Ex01Lista ex01 = new Ex01Lista(5);
		
		ex01.inserir(10, 0);
		ex01.inserir(11, 1);
		ex01.inserir(12, 2);
		ex01.inserir(13, 3);
		ex01.inserir(14, 4);
		ex01.inserir(15, 5);
		
		ex01.excluir(0);
		ex01.excluir(1);
		ex01.excluir(2);
		ex01.excluir(3);
		ex01.excluir(4);
		ex01.excluir(5);
		
		
		

	}

}
