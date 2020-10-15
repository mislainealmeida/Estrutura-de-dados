package estrutura.aula03.pilha;

public class Pilha {
	private int valores[];
	private int topo;
	
	
	public Pilha() {
		valores= new int[10];
		topo= -1;
		
	}
	

	public void push(int elemento) {   //empilhar
		topo= topo + 1;
		valores[topo]= elemento;
	}

	public boolean isEmpty() {
	   return (topo== -1);	
	}
	
	public boolean isFull() {
		return (topo==9);
	}
	
	public int pop() {
		int elemento= valores[topo];
		topo --;
		return elemento;
	}
}