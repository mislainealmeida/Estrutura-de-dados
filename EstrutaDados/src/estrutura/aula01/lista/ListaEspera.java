package estrutura.aula01.lista;

public class ListaEspera {

	public static void main(String[] args) {
		Lista lista= new Lista();
		lista.inserir(827);
		lista.inserir(123);
		lista.inserir(1597);
		lista.inserir(2);
		System.out.println();

		lista.listar();
		
		while(!lista.isEmpty()) {
			int e =lista.retirar();
			System.out.println("Retirei o elemento");
		}
	}

}
