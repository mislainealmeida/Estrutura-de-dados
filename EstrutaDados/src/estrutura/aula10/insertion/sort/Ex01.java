package estrutura.aula10.insertion.sort;

public class Ex01 {
	private int vetor[]= {25,57,43,37,12,92,33};
	
	public void insertion() {
		int iteracao,j , aux;
		// a iteracao vai selecionar o aux e tenho que puxar todos os elementos que sao maiores que ele
		for (iteracao = 1; iteracao <vetor.length; iteracao ++) {
			aux = vetor[iteracao];
			
			for (j= iteracao -1; (j>=0) && vetor[j]> aux; j--) {
				vetor[j+1]= vetor[j];// trocando todos que sao maiores que eu
				
			}
			vetor[j+1]=aux;
			System.out.print("----------Iteração " + iteracao + ": ");
			mostrarVetor();
		}
		
		
	}
	
	public void mostrarVetor(){
		for(int i=0; i< vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
		System.out.println(" ");
	}

}
