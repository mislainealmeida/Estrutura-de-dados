package estrutura.aula02.lista.circular;

public class MyApp {

	public static void main(String[] args) {
		ListaDuplaCircular lista= new ListaDuplaCircular();
		
		lista.inserir(87);
		lista.inserir(23);
		lista.inserir(71);
		lista.inserir(38);
		lista.inserir(976);
		
		lista.exibirOrdem();
		
		System.out.println("------------------");
		lista.exibirInverso();

	}

}
