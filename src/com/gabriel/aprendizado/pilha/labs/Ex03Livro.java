package com.gabriel.aprendizado.pilha.labs;

public class Ex03Livro {

	private String nome;
	private int isbn;
	private String ano;
	private String autor;
	
	public Ex03Livro(String nome, int isbn, String ano, String autor) {
		super(); 
		this.setNome(nome);
		this.setIsbn(isbn);
		this.setAno(ano);
		this.setAutor(autor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Ex03Livro [nome=" + nome + ", isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]";
	}
	
	
	
	
	
}
