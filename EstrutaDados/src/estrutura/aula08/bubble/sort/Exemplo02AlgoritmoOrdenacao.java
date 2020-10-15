package estrutura.aula08.bubble.sort;

public class Exemplo02AlgoritmoOrdenacao {
	private int vetor[]= {25,57,43,37,12,92,33};
	
	
	public void bubbleSort(){
		
		int iteracao; 
		int pos; //sempre uso a posi��o atual
		int aux; // vari�vel para a troca
		for(iteracao=0; iteracao< vetor.length-1; iteracao++) {
			 for(pos=0; pos< vetor.length - iteracao - 1; pos ++) {
				   // comparo o elemento da posicao com seu proximo
				 if(vetor[pos]> vetor [pos +1]) {// o elemento atual � maior que o seu proximo? ent�o troca. 
					 aux = vetor [pos];
					 vetor[pos]= vetor[pos+1];
					 vetor[pos +1]= aux; 					 
				 }
			   }
			 System.out.println("Final da itera��o "+ iteracao);
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
