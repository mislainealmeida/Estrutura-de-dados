package estrutura.aula13.arvores.binaria;

public class Ex01Arvore {

	private Ex01Elemento elemento;
	private Ex01Arvore direita;
	private Ex01Arvore esquerda;
	
	public Ex01Arvore() {}

	
	public Ex01Arvore(Ex01Elemento elemento, Ex01Arvore direita, Ex01Arvore esquerda) {
		super();
		this.elemento = elemento;
		this.direita = null;
		this.esquerda = null;
	}


	public Ex01Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Ex01Elemento elemento) {
		this.elemento = elemento;
	}

	public Ex01Arvore getDireita() {
		return direita;
	}

	public void setDireita(Ex01Arvore direita) {
		this.direita = direita;
	}

	public Ex01Arvore getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Ex01Arvore esquerda) {
		this.esquerda = esquerda;
	} 
	
	public boolean isEmpty() {
		return (this.elemento == null);
	}

	public void inserir(Ex01Elemento novo) {
		if (isEmpty()) {
			this.elemento = novo;
		} else {
			Ex01Arvore novaArvore = new Ex01Arvore();
			if (novo.getValor() < this.elemento.getValor()) {// inserir na esquerda.
				if (this.esquerda == null) {// sou um nó folha?
					this.esquerda = novaArvore;
					System.out.println("Inserir o elemento " + novo.getValor() + " a esquerda de " + this.elemento.getValor());
				} else {
					this.esquerda.inserir(novo);// repassei a responsabilidade para a subárvore esquerda.
				}
			} else if (novo.getValor() > this.elemento.getValor()) {// vou inserir na direita
				if (this.direita == null) {
					this.direita = novaArvore;
					System.out.println("Inserir o elemento " + novo.getValor() + " a direita de " + this.elemento.getValor());
				} else {
					this.direita.inserir(novo);
				}
			}
		}
	}
	public void imprimirPreOrdem() {
		if (!isEmpty()) {
			System.out.print(this.elemento.getValor() + " ");
			if (this.esquerda != null) {
				this.esquerda.imprimirPreOrdem();
			}
			if (this.direita != null) {
				this.direita.imprimirPreOrdem();

			}
			
		}
	}

	
}
