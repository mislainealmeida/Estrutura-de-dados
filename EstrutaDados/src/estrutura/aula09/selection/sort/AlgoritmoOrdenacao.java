package estrutura.aula09.selection.sort;

public class AlgoritmoOrdenacao {
	private int vetor[]= {25,57,43,37,12,92,33};
	
	public void SelectionSort(){
		int iteracao; 
		int aux;
		int posMenor; 
		int posMenorInicial; 
		int i;
		
		for(iteracao=0; iteracao < vetor.length-1; iteracao++) {
			posMenorInicial = iteracao; 
			posMenor = iteracao +1;
			for(i= posMenorInicial + 1; i< vetor.length; i++) {
				if(vetor[i]< vetor[posMenor]) {
					posMenor= i;	
				}
				
			}
			    
				if(vetor[posMenor]< vetor[posMenorInicial]) {
					aux=vetor[posMenorInicial];
					vetor[posMenorInicial]= vetor[posMenor];
					vetor[posMenor]= aux; 
				}
		
				System.out.println("Iteração "+iteracao);
				mostrarVetor();
				System.out.println("Menor Elemento Encontrado na iteração esta na posição "+ posMenor);
				
				
		}	
			
		}
		  
	public void mostrarVetor(){
		for(int i=0; i< vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println(" ");
	}

}
