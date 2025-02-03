package com.gabriel.aprendizado.arvore;

public class Arvore<T extends Comparable> {

	private Elemento<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public void adicionar(T elemento) {
		Elemento<T> novo = new Elemento<>(elemento);
		if (raiz == null) {
			this.raiz = novo;
		} else {
			Elemento<T> atual = this.raiz;
			while (true) {
				if (novo.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novo);
						break;
					}
				} else {
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novo);
						break;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Arvore [raiz=" + raiz.getValor() + "]";
	}

}
