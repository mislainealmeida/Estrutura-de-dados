package estrutura.aula01.lista;

public class Lista {
	private Caixinha inicio;
	// criando lista vazia
	
	
	public Lista() {
		this.inicio= null;
	}
	public void inserir (int elemento) {
		// tenho que criar uma nova caixinha
		Caixinha nova= new Caixinha();
		nova.setElemento(elemento);           // insere o elemento na Caixinha
		nova.setProximo(null);               //depois dela n�o vem ningu�m
        if(inicio== null) {                  // vai ser a primeira caixinha?
        	inicio= nova;
        }else {                              // ja tem gente na lista
        	Caixinha aux; 
        	aux= inicio; 
        	while(aux.getProximo()!= null) {
        		aux= aux.getProximo();
        	}
        	aux.setProximo(nova);
        }
		
    }
	public int retirar() {
		//este metodo consideraque a lista sempre tem elementos, alguem na aplicacao precisa antes de remover, testar se a lista nao esta vazia
		Caixinha aux= inicio;
		int elemento= aux.getElemento();
		inicio= aux.getProximo();
		return elemento; 
	}
	public void listar() {
		if(inicio== null) {
			System.out.println("Nada a exibir, a lista esta vazia");
		}else {
			Caixinha aux= inicio;
			while(aux!= null){
				System.out.println("Elemento visto "+aux.getElemento());
				aux=aux.getProximo();
			}
		}
		
	}
	public boolean isEmpty() {
		return this.inicio== null;
	}
}