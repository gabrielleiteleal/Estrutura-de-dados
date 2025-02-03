package com.gabriel.aprendizado.lista;

import java.util.Stack;

public class ListaEncadeada<T> {

	private No<T> inicio;
	private No<T> fim;
	private int tamanho;

	public void adicionaNoInicio(T elemento) {
		No<T> novo = new No<T>(elemento, this.inicio);
		this.inicio = novo;
		if (this.tamanho == 0)
			this.fim = novo;
		this.tamanho++;
	}

	public void adicionaNoFinal(T elemento) {
		if (this.tamanho == 0) {
			adicionaNoInicio(elemento);
		} else {
			No<T> novo = new No<T>(elemento);
			this.fim.setProximo(novo);
			this.fim = novo;
			tamanho++;
		}
	}

	public void adicionarQualquerPos(int pos, T elemento) {
		if (pos == 0) {
			this.adicionaNoInicio(elemento);
		} else if (pos == this.tamanho) {
			this.adicionaNoFinal(elemento);
		} else {
			No<T> anterior = this.pegarNo(pos - 1);
			No<T> proximo = anterior.getProximo();
			No<T> novo = new No<T>(elemento, proximo);
			anterior.setProximo(novo);
			this.tamanho++;
		}
	}

	private No<T> pegarNo(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		No<T> atual = this.inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public T pegarElemento(int posicao) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Pósição inválida");
		}
		return (T) pegarNo(posicao).getElemento();
	}

	public int pegarPosicao(T elemento) {
		No<T> atual = this.inicio;
		int pos = 0;
		for (int i = 0; i < this.tamanho; i++) {
			if (atual.getElemento().equals(elemento)) {
				return pos;
			}
			pos++;
			atual = atual.getProximo();
		}
		return -1;
	}

	public int quantidadeDeNos() {
		if (this.tamanho == 0) {
			throw new IllegalArgumentException("Pósição inválida");
		}
		No<T> atual = this.inicio;
		int quantidade = 1;
		while (atual.getProximo() != null) {
			quantidade++;
			atual = atual.getProximo();
		}
		return quantidade;
	}

	public void removeFinal() {
		if (this.tamanho == 0) {
			throw new IllegalArgumentException("Lista vazia! Impossível remover!");
		} else if (this.tamanho == 1) {
			this.removeInicio();
		} else {
			No<T> anterior = this.pegarNo(this.tamanho - 2);
			anterior.setProximo(null);
			this.fim = anterior;
			this.tamanho--;
		}
	}

	public void removeInicio() {
		this.inicio = this.inicio.getProximo();
		this.tamanho--;
		if (this.tamanho == 0) {
			this.fim = null;
		}
	}

	public void removerQualquerPos(int pos) {
		if (!posicaoValida(pos)) {
			throw new IllegalArgumentException("Posição inválida");
		} else if (pos == 0) {
			this.removeInicio();
		} else if (pos == this.tamanho) {
			this.removeFinal();
		} else {
			No<T> removido = this.pegarNo(pos);
			No<T> anterior = this.pegarNo(pos - 1);
			anterior.setProximo(removido.getProximo());
			removido.setProximo(null);
			this.tamanho--;
		}
	}

	public int encontrarKaesimo(int pos, ListaEncadeada<Integer> lista) {
		No<Integer> atual = lista.getInicio();
		Stack<Integer> pilha = new Stack<Integer>();
		this.ordenarMaiorParaMenor(lista);
		System.out.println("Lista ordenada: " + this.ordenarMaiorParaMenor(lista));
		for (int i = 0; i <= pos; i++) {
			pilha.push(atual.getElemento());
			atual = atual.getProximo();
		}
		return pilha.peek();
	}

	public ListaEncadeada<Integer> ordenarMaiorParaMenor(ListaEncadeada<Integer> lista) {
		boolean trocou;
		do {
			trocou = false;
			No<Integer> atual = lista.getInicio();
			while (atual != null && atual.getProximo() != null) {
				if (((Number) atual.getElemento()).doubleValue() < ((Number) atual.getProximo().getElemento())
						.doubleValue()) {
					int temp = atual.getElemento();
					atual.setElemento(atual.getProximo().getElemento());
					atual.getProximo().setElemento(temp);
					trocou = true;
				}
				atual = atual.getProximo();
			}
		} while (trocou);
		return lista;
	}

	public void testeVetor() {
		int vetor[] = { 1, 4, 6, 8, 2, 3 };
		int aux;
		boolean controle;

		System.out.print("Não ordenada: ");
		for (int k : vetor) {
			System.out.print(vetor[k] + " ");
		}
		System.out.println();
		// ORDEM CRESCENTE
		for (int i = 0; i < vetor.length; i++) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
		System.out.print("Ordenado crescente: ");
		for (int k : vetor) {
			System.out.print(vetor[k] + " ");
		}
		System.out.println();
		// ORDEM DECRESCENTE
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < (vetor.length - 1); j++) {
				if (vetor[j] < vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		System.out.print("Ordenado decrescente: ");
		for (int k : vetor) {
			System.out.print(vetor[k] + " ");
		}
	}

	public ListaEncadeada<T> inverterLista() {
		No<T> atual = this.inicio;
		ListaEncadeada<T> lista = new ListaEncadeada<T>();
		for (int i = 0; i < this.tamanho; i++) {
			lista.adicionaNoInicio(atual.getElemento());
			atual = atual.getProximo();
		}
		return lista;
	}

	public void limparLista() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.tamanho;
	}

	public int tamanho() {
		return this.tamanho;
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

	@Override
	public String toString() {
		if (tamanho == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[ ");
		No<T> NoAtual = this.inicio;
		for (int i = 0; i < tamanho - 1; i++) {
			builder.append(NoAtual.getElemento());
			builder.append(", ");
			NoAtual = NoAtual.getProximo();
		}
		builder.append(NoAtual.getElemento());
		builder.append(" ]");
		return builder.toString();
	}
}
