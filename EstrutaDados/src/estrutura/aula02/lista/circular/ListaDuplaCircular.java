package estrutura.aula02.lista.circular;

public class ListaDuplaCircular {
	private CaixinhaDupla inicio;

	public ListaDuplaCircular() {
		this.inicio = null;
	}

	public boolean isEmpty() {
		return (this.inicio == null);
	}

	public void inserir(int elemento) {
		CaixinhaDupla novo = new CaixinhaDupla();
		novo.setElemento(elemento);
		if (isEmpty()) {
			novo.setAnterior(novo);
			novo.setProximo(novo);
			inicio = novo;
		} else {
			CaixinhaDupla tmp = inicio; // tmp= temporario
			while (tmp.getProximo() != inicio) {// proximo do temporario nao pode ser o inicio, assumindo o proximo elemento
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}

	public void exibirOrdem() {
		CaixinhaDupla tmp;
		tmp = inicio;
		do {
			System.out.println("Elemento da lista = " + tmp.getElemento());
			tmp = tmp.getProximo();
		} while (tmp != inicio);
	}

	public void exibirInverso() {
		CaixinhaDupla tmp;
		tmp = inicio;
		do {
			System.out.println("Elemento da lista = " + tmp.getElemento());
			tmp = tmp.getAnterior();
		} while (tmp != inicio);
	}
}
