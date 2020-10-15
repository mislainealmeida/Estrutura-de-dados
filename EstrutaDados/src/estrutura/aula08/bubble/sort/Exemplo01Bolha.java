package estrutura.aula08.bubble.sort;

public class Exemplo01Bolha {

	private int valores[] = { 3, 1, 2, 5, 6, 4 };

	public void Bolha() {
		int pos, aux, iteracao;
		int tamanho = valores.length;

			for (iteracao = 0; iteracao < tamanho -1; iteracao++) {
				for (pos = 0; pos < tamanho - iteracao -1; pos++) {
					if (valores[pos] > valores[pos + 1]) {
						aux = valores[pos];
						valores[pos] = valores[pos + 1];
						valores[pos + 1] = aux;
					}

					
				}
				mostrarValores();
			}

			

	}

	public void mostrarValores() {
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println(" ");
	}

}
