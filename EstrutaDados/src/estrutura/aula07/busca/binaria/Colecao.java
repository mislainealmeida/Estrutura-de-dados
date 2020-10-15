package estrutura.aula07.busca.binaria;

public class Colecao {
	private int valores[] = { 11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };

	public int buscaBinaria(int val) {
		int inicio = 0;
		int meio;
		int fim = valores.length-1;// posicao
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (val == valores[meio]) {
				return meio;
			} else {
				if (val > valores[meio]) {
					inicio = meio + 1;
				} else {
					fim = meio - 1;
				}
			}
		}return -1;
	}
}
