package lista.labs;

public class Ex04ListaEncadeada {
	private Ex04Dinamica primeiro;
	private Ex04Dinamica ultimo;
	private String nome;

	

	public Ex04ListaEncadeada(String nome) {
		this.nome = nome;
		this.primeiro = ultimo = null;
	}

	public Ex04ListaEncadeada() {
		this.primeiro = ultimo= null;
		this.nome = "Lista Teste";
	}
	public void inserirFrente(String item) {
		if(vazia()) {
			primeiro = ultimo = new Ex04Dinamica(item); 
			
		}else {
			primeiro = new Ex04Dinamica (item, primeiro);
		}
	}
	public void inserirFundo(String item) {
		if(vazia()) {
			primeiro= ultimo= new Ex04Dinamica(item);
		}else {
			ultimo.setProx(new Ex04Dinamica(item));
			ultimo=ultimo.getProx();
		}
	}

	public String RemoveFrente() {
		if (vazia()) {
			return null;
		}
		String item = primeiro.getDado();
		if (primeiro == ultimo) {
			primeiro = ultimo = null;
		} else {
			primeiro = primeiro.getProx();
			
		}return item;
	}

	public String RemoveFundo() {
		String item = ultimo.getDado();
		if (vazia()) {
			return null;

		}
		if (primeiro == ultimo) {
			primeiro = ultimo = null;
		} else {
			Ex04Dinamica atual = primeiro;
			while (atual.getProx() != ultimo) {
				atual = atual.getProx();
				ultimo = atual;
				atual.setProx(null);
			}
		}
		return item;

	}

	public boolean vazia() {
		if (primeiro == null) {
			return true;

		}else {
			return false; 
		}
		
	}
	
	public String exibirPrimeiro() {
		if(primeiro==null) {
			return "Primeiro null"; 
		}
		else {
			return "Primeiro: "+primeiro.getDado();
			}
		
		}
	public String exibirUltimo() {
		if(ultimo== null) {
			return "Último = null"; 
		}else {
			return "Último: "+ ultimo.getDado();
			}
	}
	public String EscreverLista() {
		String temp = " ";
		if (vazia()) {
			temp += nome + " Vazia ";
			return temp;
		}else {
			temp+= " A "+ nome+ " contem \n\n";
			Ex04Dinamica atual=primeiro;
			while(atual != null) {
				temp += atual.getDado() + ", ";
				atual = atual.getProx();
			}
			temp+="\n";
			return temp;
			
		}
	}
}
