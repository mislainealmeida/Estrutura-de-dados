package estrutura.aula09.selection.sort;

public class GeradorValores {

	static int vetor[];

	public static boolean pertence( int valor, int tam) {
		for(int i=0; i< tam; i++) {
			if(vetor[i]== valor) {
				
			return true;
		}
	}return false;

}

	public static void main (String[] args) {
		vetor = new int[500];
		int valor, pos;
		//gerei valores aleatórios
		pos=0;
		for(pos=0; pos<vetor.length; pos++) {
			do {
				valor= ((int) (Math.random() *10000)) % 10000;	
			}while (pertence (valor, pos));
			
			vetor[pos]= valor;
		}
		//imprimir valores
		for (pos=0; pos<vetor.length; pos++) {
			System.out.println(vetor[pos]);
		}
	}

}
