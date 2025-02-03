package com.gabriel.aprendizado.pilha;

import com.gabriel.aprendizado.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		this.adicionar(elemento);
	}

	public T desempilha() {

		if (estaVazio()) {
			return null;
		}

		return this.elementos[--tamanho];
	}

	public T espiarTopo() {

		if (estaVazio()) {
			return null;
		}

		return this.elementos[tamanho - 1];
	}

}
