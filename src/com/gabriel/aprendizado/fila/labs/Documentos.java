package com.gabriel.aprendizado.fila.labs;

public class Documentos {

	private String nome;
	private int numFolhas;
	
	public Documentos(String nome, int qtdFolhas) {
		super();
		this.nome = nome;
		this.numFolhas = qtdFolhas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdFolhas() {
		return numFolhas;
	}
	public void setQtdFolhas(int qtdFolhas) {
		this.numFolhas = qtdFolhas;
	}

	@Override
	public String toString() {
		return "Documentos [nome=" + nome + ", qtdFolhas=" + numFolhas + "]";
	}
	
}
