package com.gabriel.aprendizado.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
	private No<T> inicio;
	private No<T> fim;
	private int tamanho;

	public void adicionarNoInicio(T elemento) {
		if (this.tamanho == 0) {
			No<T> novo = new No<T>(elemento);
			this.inicio = novo;
			this.fim = novo;
		} else {
			No<T> novo = new No<T>(elemento, this.inicio);
			this.inicio.setAnterior(novo);
			this.inicio = novo;
		}
		this.tamanho++;
	}

	public void adicionarNoFinal(T elemento) {
		if (this.tamanho == 0) {
			this.adicionarNoInicio(elemento);
		} else {
			No<T> novo = new No<T>(elemento);
			this.fim.setProximo(novo);
			novo.setAnterior(this.fim);
			this.fim = novo;
			this.tamanho++;
		}
	}

	public void adicionarQualquerPos(int pos, T elemento) {
		if (!this.posicaoValida(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		if (this.tamanho == 0) {
			this.adicionarNoInicio(elemento);
		} else if (pos == tamanho) {
			this.adicionarNoFinal(elemento);
		} else {
			No<T> anterior = this.pegarNo(pos - 1);
			No<T> proximo = anterior.getProximo();
			No<T> novo = new No<T>(elemento, proximo);
			anterior.setProximo(novo);
			proximo.setAnterior(novo);
			novo.setAnterior(anterior);
			this.tamanho++;
		}
	}

	public void removerInicio() {
		if (this.tamanho == 1) {
			this.inicio = null;
			this.fim = null;
			this.tamanho = 0;
		}
		No<T> proximo = this.inicio.getProximo();
		proximo.setAnterior(null);
		this.inicio = proximo;
		this.tamanho--;
	}

	public void removerFinal() {
		if (this.tamanho == 1) {
			this.inicio = null;
			this.fim = null;
			this.tamanho = 0;
		}
		No<T> anterior = this.fim.getAnterior();
		anterior.setProximo(null);
		this.fim = anterior;
		this.tamanho--;
	}

	public void removerQualquerPos(int pos) {
		if (!this.posicaoValida(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		} else if (pos == 0) {
			this.removerInicio();
		} else if (pos == this.tamanho - 1) {
			this.removerFinal();
		} else {
			No<T> removido = this.pegarNo(pos);
			No<T> anterior = removido.getAnterior();
			No<T> proximo = removido.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.tamanho--;
		}

	}

	public T pegarElemento(int pos) {
		if (!this.posicaoValida(pos)) {
			throw new IllegalArgumentException("Pósição inválida");
		}
		return (T) this.pegarNo(pos).getElemento();
	}

	private No<T> pegarNo(int pos) {
		if (!this.posicaoValida(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		No<T> atual = this.inicio;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public boolean posicaoValida(int pos) {
		return pos >= 0 && pos <= this.tamanho ? true : false;
	}

	public int somarImpares(ListaDuplamenteEncadeada<T> lista) {
		if (lista.tamanho == 0) {
			return -1;
		}
		No<T> atual = lista.getInicio();
		int soma = 0;
		for (int i = 0; i < lista.tamanho - 1; i++) {
			if ((int) atual.getElemento() % 2 == 1) {
				soma += (int) atual.getElemento();
			}
			atual = atual.getProximo();
		}
		return soma;
	}

	public void removerEntre(int a, int b, ListaDuplamenteEncadeada<T> lista) {
		if (a > b) {
			int aux = b;
			b = a;
			a = aux;
		}
		No<T> atual = lista.getInicio();
		for (int i = 0; i < lista.tamanho - 1;) {
			if ((int) atual.getElemento() >= a && (int) atual.getElemento() <= b) {
				lista.removerQualquerPos(i);
				atual = atual.getProximo();
			} else {
				atual = atual.getProximo();
				i++;
			}
		}
	}

	public boolean vetorIgual(int[] vetor) {
		No<T> atual = this.inicio;
		for (int i = 0; i < this.tamanho - 1; i++) {
			if (vetor[i] != (int) atual.getElemento()) {
				return false;
			}
			atual = atual.getProximo();
		}
		return true;
	}

	public void percorrerOrdemInversao(ListaDuplamenteEncadeada<T> listaDupla) {
		No<T> atual = listaDupla.getFim();
		ListaDuplamenteEncadeada<T> lista = new ListaDuplamenteEncadeada<>();
		System.out.println("Percorrendo a lista em ordem inversa!");
		for (int i = 0; i < listaDupla.tamanho; i++) {
			lista.adicionarNoFinal(atual.getElemento());
			atual = atual.getAnterior();
		}
		System.out.println(lista);
	}

	public ListaDuplamenteEncadeada<T> mesclarListas(ListaDuplamenteEncadeada<T> lista1,
			ListaDuplamenteEncadeada<T> lista2) {
		No<T> atual = lista1.getInicio();
		No<T> atual2 = lista2.getInicio();
		ListaDuplamenteEncadeada<T> listaDupla = new ListaDuplamenteEncadeada<>();
		for (int i = 0; i < lista1.tamanho; i++) {
			listaDupla.adicionarNoFinal(atual.getElemento());
			atual = atual.getProximo();
		}
		for (int i = 0; i < lista2.tamanho; i++) {
			listaDupla.adicionarNoFinal(atual2.getElemento());
			atual2 = atual2.getProximo();
		}
		return listaDupla;
	}

	@Override
	public String toString() {
		if (this.tamanho == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No<T> atual = this.inicio;
		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento()).append("]");
		return builder.toString();
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public No<T> getFim() {
		return fim;
	}

	public void setFim(No<T> fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
