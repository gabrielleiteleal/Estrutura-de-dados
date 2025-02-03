package com.gabriel.aprendizado.pilha.labs;

import com.gabriel.aprendizado.pilha.Pilha;

public class Ex03 {

	public static void main(String[] args) {
		
		Pilha<Ex03Livro> pilha = new Pilha<Ex03Livro>(6);
		Ex03Livro livro1 = new Ex03Livro("Livro 1", 001, "2001", "Autor 1");
		Ex03Livro livro2 = new Ex03Livro("Livro 2", 002, "2002", "Autor 2");
		Ex03Livro livro3 = new Ex03Livro("Livro 3", 003, "2003", "Autor 3");
		Ex03Livro livro4 = new Ex03Livro("Livro 4", 004, "2004", "Autor 4");
		Ex03Livro livro5 = new Ex03Livro("Livro 5", 005, "2005", "Autor 5");
		Ex03Livro livro6 = new Ex03Livro("Livro 6", 006, "2006", "Autor 6");
		 
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		
		
		System.out.println(pilha);

	}

}
