package estrutura.aula11.quick.sort;

public class Ex01 {
	private int vetor[] = { 25, 57, 48, 37, 12, 92, 33 };
	

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public int partition(int inicio, int fim) {
		int ref, up, down, aux;

		ref = vetor[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			// encontrando um numero maior que o pivo (ref).
			while (vetor[down] <= ref && down < fim) {
				down++; // avanço pra encontrar um falor maior.
			}
			// encontrar a partir do fim um valor menor que o meu ref
			while (vetor[up] > ref) {
				up--;
			}
			if (down < up) {// eles nao se cruzaram
				// troca
				aux = vetor[down];
				vetor[down] = vetor[up];
				vetor[up] = aux;
			}

		}
		vetor[inicio]= vetor[up];
		vetor[up]= ref;
			
		return up;   // no final é a posição de up que denota onde esta o pivo. 
		}

	public void quick(int inicio, int fim) {
		int pivo; 
		if (inicio> fim) {
			return;
		}
		
		pivo= partition(inicio, fim);
		quick(inicio, pivo-1);
		quick(pivo +1, fim);	
		
		mostrarVetor();

	}
	public void mostrarVetor(){
		for(int i=0; i< vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println(" ");
	}


}
