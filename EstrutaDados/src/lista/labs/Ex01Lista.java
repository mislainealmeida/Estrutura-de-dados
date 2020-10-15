package lista.labs;

public class Ex01Lista {
	private int[] valores;
	private int tamanhoLista; 
	
	// metodo para inicializar e definir o tamanho.
	
	public Ex01Lista(int tamanhoLista) {
		if (tamanhoLista > 0) {
		
			valores = new int[tamanhoLista];
		}
		
		
	}
	// metodo para inserir na lista
	public int inserir(int valor, int pos) {
		if (pos>=0 && pos< valores.length) {
			valores[pos]= valor; 
			System.out.println("Foi adicionado o valor "+ valor +" na posição "+ pos);
			return valor;
		} else {
			return -1;
		}
		
	}
	// metodos para excluir na lista
	int valor; 
	public int excluir(int pos) {
		if( pos >= 0 && pos < valores.length) {
			valor = valores[pos];
			valores[pos]=0;
				System.out.println("Foi excluído o valor "+ valor +" na posição "+ pos);
			return valor; 
		}else { 
			return -1;
		}
		
		
	}
	

}
