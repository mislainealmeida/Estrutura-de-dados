package estrutura.aula14.arvores.binaria.remocao;

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

	// remocao do nó da arvore
	public Arvore remover(Elemento elemento) {
		// 1 caso - achei o elemento
		if (this.elemento.getValor() == elemento.getValor()) {
              // o elemenoto esta em um nó folha
			if (this.direita== null && this.esquerda == null) {
				return null;
			}else {
				// caso 2- tenho filhos a esquerda mas nao tenho a direita
				
				if(this.direita == null && this.esquerda!= null) {
					return this.esquerda;
				}
				// caso 3- tenho filhos a direita mas nao tenho a esquerda
				else if (this.direita!= null && this.esquerda == null) {
					return this.direita;
				}
				// caso 4- tenho filho dos dois lados
				else {
					Arvore aux = this.esquerda;
					while (aux.direita != null) {// enquanto ouver filhos a direita
						aux= aux.direita;
					}
					// troco os elementos da arvore
					this.elemento= aux.getElemento(); // o nó atual recebe o elemento do aux. O maior dentre os menores
					aux.setElemento(elemento); // insiro no nó folha o elemento a ser eliminado
					this.esquerda = esquerda.remover(elemento);
				}
			}
			
		} 
		else if (elemento.getValor() < this.elemento.getValor()) {
			
			// delegar a responsabilidade à sub arvore da esquerda
			this.esquerda = this.esquerda.remover(elemento);
			
			
		} else if (elemento.getValor() > this.elemento.getValor()) {
			
				this.direita = this.direita.remover(elemento);
			
		}
		return this;
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
