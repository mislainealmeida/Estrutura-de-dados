package estrutura.aula13.arvores.binaria;

public class Arvore {

	private Elemento elemento;
	private Arvore direita;
	private Arvore esquerda;

	public Arvore() {
	}

	public Arvore(Elemento elemento) {

		this.elemento = elemento;
		this.direita = null;
		this.esquerda = null;
		System.out.println("Criei a árvore com o elemento " + elemento.getValor());
	}

	// metodos de controle.
// neste caso consideramos a arvore vazia.
	public boolean isEmpty() {
		return (this.elemento == null);
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

	public void imprimirInOrdem() {
		if (!isEmpty()) {

			if (this.esquerda != null) {
				this.esquerda.imprimirInOrdem();
			}
			System.out.print(this.elemento.getValor() + " ");
			if (this.direita != null) {
				this.direita.imprimirInOrdem();
			}
		}
	}

	public void imprimirPosOrdem() {
		if (!isEmpty()) {

			if (this.direita != null) {
				this.direita.imprimirPosOrdem();
			}

			if (this.esquerda != null) {
				this.esquerda.imprimirPosOrdem();
			}
			System.out.print(this.elemento.getValor() + " ");
		}
	}

	

	public void inserir(Elemento novo) {
		if (isEmpty()) {
			this.elemento = novo;
		} else {
			Arvore novaArvore = new Arvore(novo);
			if (novo.getValor() < this.elemento.getValor()) {// inserir na esquerda.
				if (this.esquerda == null) {// sou um nó folha?
					this.esquerda = novaArvore;
					System.out.println(
							"Inserir o elemento " + novo.getValor() + " a esquerda de " + this.elemento.getValor());
				} else {
					this.esquerda.inserir(novo);// repassei a responsabilidade para a subárvore esquerda.
				}
			} else if (novo.getValor() > this.elemento.getValor()) {// vou inserir na direita
				if (this.direita == null) {
					this.direita = novaArvore;
					System.out.println(
							"Inserir o elemento " + novo.getValor() + " a direita de " + this.elemento.getValor());
				} else {
					this.direita.inserir(novo);
				}
			}
		}
	}

	public boolean busca(int valor) {
		if (isEmpty()) {
			return false;
		}
		if (this.elemento.getValor() == valor) {
			return true;
		} else {
			if (valor < this.elemento.getValor()) {
				if (this.esquerda == null) {
					return false;
				} else {
					return this.esquerda.busca(valor);// repassei a responsabilidade para a subarvore esquerda.
				}
			} else if (valor > this.elemento.getValor()) {
				if (this.direita == null) {
					return false;
				} else {
					return this.direita.busca(valor);
				}
			}
		}
		return false;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Arvore getDireita() {
		return direita;
	}

	public void setDireita(Arvore direita) {
		this.direita = direita;
	}

	public Arvore getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Arvore esquerda) {
		this.esquerda = esquerda;
	}

}
