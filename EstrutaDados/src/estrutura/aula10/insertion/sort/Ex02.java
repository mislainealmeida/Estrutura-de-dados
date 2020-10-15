package estrutura.aula10.insertion.sort;

public class Ex02 {
	
	private int vetor[]= {3,1,2,5,6,4};
	
	public void insertion() {
		int aux;
		int i, j, posi;
		// comparamos os dois primeiros elementos, se o segundo for menor invertemos as posições.
		/*if(vetor[0]> vetor[1]) {
			aux= vetor[0];
			vetor[0]= vetor[1];
			vetor[1]= aux;
		}*/
		
		
		for (i=1; i< vetor.length; i++) {
			aux= vetor[i];
			// chamamos o método buscaLinear e passamos por parametro o elemento a ser inserido e o tamanho do subconjunto de elementos do vetor
			//A variavel posi recebera a posicao adequada para se inserir o elemento no subconjunto. 
			posi =  buscaLinear(aux, i-1);
			// o caminho for ira deslocar todos os elementos a partir da posicao encontrada, uma casa a direita. 
			for(j=i; j>posi; j--) {
				vetor[j]= vetor [j-1];
				// insere o elemento na posicao encontrada. Ordenado em relaçao ao subconjunto
				
				
			}
			vetor[posi]= aux;
			System.out.print("----------Iteração " + i + ": ");
			mostrarVetor();
			
		}
		
		
	}
	
	
	public int buscaLinear(int num, int tam) {// tam é o tamanho do vetor, num é a chave de pesquisa. 
		int i=0;
		
		while ((i<=tam) && (num> vetor[i])) {
			i++;
			
		}return i;
	}
	public void mostrarVetor(){
		for(int i=0; i< vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println(" ");
	}

}
