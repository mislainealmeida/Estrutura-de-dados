package lista.labs;

public class Ex02Teste {

	public static void main(String[] args) {
    Ex02Aviao ex02 = new Ex02Aviao(40);
		
		ex02.inserir(10, 10);
		ex02.inserir(14, 20);
		ex02.inserir(20, 30);
		ex02.inserir(23, 22);
		ex02.inserir(22, 4);
		ex02.inserir(17, 7);
		
		ex02.excluir(0);
		ex02.excluir(1);
		ex02.excluir(2);
		ex02.excluir(3);
		ex02.excluir(4);
		ex02.excluir(5);

	}

}
