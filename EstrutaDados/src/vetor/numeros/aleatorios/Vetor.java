package vetor.numeros.aleatorios;

public class Vetor {
	private int valores[]= new int[10];

	public void gerarAleatorio() {
		for( int i=0; i<valores.length; i++) {
			int num= (int)(Math.random()*10);
			valores[i]= num; 
			System.out.print(num);			
		}
	}
	

}
