package estrutura.aula15.arvores.avl;

public class Arvore {

	private Elemento elemento;
	private Arvore direita;
	private Arvore esquerda;
	private int balanceamento;

	public Arvore() {
	}

	public Arvore(Elemento elemento) {

		this.elemento = elemento;
		this.direita = null;
		this.esquerda = null;
		this.balanceamento = 0;

	}

	public int calcularAltura() {
		if (this.esquerda == null && this.direita == null) {
			return 1;
		} else if (this.esquerda != null && this.direita == null) {
			return 1 + this.esquerda.calcularAltura();

		} else if (this.esquerda == null && this.direita != null) {
			return 1 + this.direita.calcularAltura();
		} else {
			return 1 + Math.max(this.esquerda.calcularAltura(), this.direita.calcularAltura());
		}
	}

	public void calcularBalanceamento() {
		if (this.esquerda == null && this.direita == null) {
			this.balanceamento = 0;
		} else if (this.esquerda == null && this.direita != null) {
			this.balanceamento = this.direita.calcularAltura() - 0;
		} else if (this.esquerda != null && this.direita == null) {
			this.balanceamento = 0 - this.esquerda.calcularAltura();
		} else {
			this.balanceamento = this.direita.calcularAltura() - this.esquerda.calcularAltura();
		}
		if (this.direita != null)
			this.direita.calcularBalanceamento();
		if (this.esquerda != null)
			this.esquerda.calcularBalanceamento();

	}

	// metodos de verificacao e rotacao
	public Arvore verificaBalanceamento() {
		if (this.balanceamento >= 2 || this.balanceamento <= -2) {
			if (this.balanceamento >= 2) {
				if (this.balanceamento * this.direita.getBalanceamento() > 0) {
					System.out.println("Rotação simples a direita");
					return rotacaoSimplesDireita();
				} else {
					System.out.println("Rotação dupla a direita");
					return rotacaoDuplaDireita();
				}
			} else if (this.balanceamento >= -2) {
				if (this.balanceamento * this.esquerda.getBalanceamento() > 0) {
					System.out.println("Rotação simples a direita");
					return rotacaoSimplesEsquerda();
				} else {
					System.out.println("Rotação dupla a direita");
					return rotacaoDuplaEsquerda();
				}
			}
		}
		this.calcularBalanceamento();
		if (this.esquerda != null)
			this.esquerda = this.esquerda.verificaBalanceamento();
		if (this.direita != null)
			this.direita = this.direita.verificaBalanceamento();
		return this;

	}

	public Arvore rotacaoSimplesDireita() {
		Arvore filhoDireita;
		Arvore filhoFilho = null;

		filhoDireita = this.getDireita();
		if (direita != null) {
			if (this.direita.getEsquerda() != null) {// se meu filho a direita te filhos a esquerda
				filhoFilho = filhoDireita.getEsquerda();
			}
		}
		filhoDireita.setEsquerda(this);
		this.setDireita(filhoFilho);
		return filhoDireita;
	}

	public Arvore rotacaoSimplesEsquerda() {
		Arvore filhoEsquerda;
		Arvore filhoFilho = null;

		filhoEsquerda = this.getEsquerda();
		if (esquerda != null) {
			if (this.esquerda.getDireita() != null) {
				filhoFilho = filhoEsquerda.getDireita();
			}
		}
		filhoEsquerda.setDireita(this);
		this.setEsquerda(filhoFilho);
		return filhoEsquerda;
	}

	public Arvore rotacaoDuplaDireita() {
		Arvore arvore = this;
		Arvore filhoDireita = this.getDireita();
		Arvore filhoFilho = filhoDireita.getEsquerda();
		Arvore noInserido = filhoFilho.getDireita();
		// parte 1- alinhar os caras
		filhoDireita.setEsquerda(noInserido);
		filhoFilho.setDireita(filhoDireita);
		this.setDireita(filhoFilho);

		// parte 2- tornar o filho a direita a nova raiz.
		Arvore novoFilhoDireita = this.getDireita();
		arvore.setDireita(null);
		novoFilhoDireita.setEsquerda(arvore);
		return novoFilhoDireita;

	}

	public Arvore rotacaoDuplaEsquerda() {
		Arvore arvore = this;
		Arvore filhoEsquerda = this.getEsquerda();
		Arvore filhoFilho = filhoEsquerda.getDireita();
		Arvore noInserido = filhoFilho.getEsquerda();
		// parte 1- alinhar os caras
		filhoEsquerda.setDireita(noInserido);
		filhoFilho.setEsquerda(filhoEsquerda);
		this.setEsquerda(filhoFilho);

		// parte 2- tornar o filho a direita a nova raiz.
		Arvore novoFilhoEsquerda = this.getEsquerda();
		arvore.setEsquerda(null);
		novoFilhoEsquerda.setDireita(arvore);
		return novoFilhoEsquerda;

	}

	public boolean isEmpty() {
		return (this.elemento == null);
	}

	public Arvore inserir(Elemento novo) {
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
		return this;
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

	public int getBalanceamento() {
		return balanceamento;
	}

	public void setBalanceamento(int balanceamento) {
		this.balanceamento = balanceamento;
	}

	public String printArvore(int level) {
		String str = this.toString() + "\n";
		for (int i = 0; i < level; i++) {
			str += "\t";
		}
		if (this.esquerda != null) {
			str += "+-ESQ: " + this.esquerda.printArvore(level + 1);
		} else {
			str += "+-ESQ: NULL";
		}
		str += "\n";
		for (int i = 0; i < level; i++) {
			str += "\t";
		}
		if (this.direita != null) {

			str += "+-DIR: " + this.direita.printArvore(level + 1);
		} else {
			str += "+-DIR: NULL";
		}
		str += "\n";
		return str;
	}

	@Override
	public String toString() {
		return "Arvore [elemento=" + this.elemento.getValor() + ", balanceamento= " + this.balanceamento + "]";
	}

}
