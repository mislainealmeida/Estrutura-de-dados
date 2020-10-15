package lista.labs;

public class Ex04Teste {

	public static void main(String[] args) {
		Ex04ListaEncadeada lista = new Ex04ListaEncadeada();
		
		lista.inserirFrente("Helena");
		lista.inserirFrente("Alice");
		lista.inserirFundo("Joaquim");
		
		System.out.println(lista.EscreverLista());
		lista.RemoveFrente();
		System.out.println(lista.EscreverLista());
		lista.RemoveFrente();
		System.out.println(lista.EscreverLista());	
		lista.RemoveFundo();
		System.out.println(lista.EscreverLista());
		
		

	}

}
