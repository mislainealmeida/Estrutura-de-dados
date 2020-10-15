package estrutura.aula09.selection.sort;

public class Ex01Selecao {

	private int vetores[]= {25,57,43,37,12,92,33};
	
	public void Selecao() {
		int i, j, posMenor, posMenorInicial, aux; 
		
		for(i=0; i<vetores.length -1; i++) { // iteração é sempre tamanho -1
			posMenorInicial = i;//0
			posMenor= vetores[i]; // recebe o vetor na primeira posição
			for (j=i+1; j<vetores.length; j++) {
				if(vetores[j] < posMenor){
					posMenor= vetores[j];
					posMenor=j;//?
				}
				vetores[posMenorInicial]=vetores[i];
				vetores[i]= posMenor;
				System.out.println(vetores[i]);
			}
			
		}
		
	}
}
