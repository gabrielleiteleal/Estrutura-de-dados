package com.gabriel.aprendizado.pilha.labs;

import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {

		decimalQualquerBase(25, 16);
		decimalQualquerBase(10035, 8);
		decimalQualquerBase(10035, 16);
		decimalQualquerBase(10, 2);
		decimalQualquerBase(100, 8);

	}

	public static void decimalQualquerBase(int numero, int base) {
		
		if(base > 16) {
			throw new IllegalArgumentException("Base inválida");
		}

		Stack<Integer> pilha = new Stack<Integer>();

		int resto, quosciente=numero;
		String numBase="";
		String bases = "0123456789ABCDEF";

		while(quosciente>0) {
			resto = quosciente % base;
			quosciente /= base;
			pilha.push(resto);
		}
		
		while(!pilha.isEmpty()) {
			numBase += bases.charAt(pilha.pop());
		}
		
		System.out.println("O número '" + numero + "' na base " + base + " é: " + numBase);

	}

}
