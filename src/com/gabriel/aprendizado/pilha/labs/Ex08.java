package com.gabriel.aprendizado.pilha.labs;

import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		
		Stack<Integer> original = new Stack<>();
		Stack<Integer> dest = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		
		for(int i=3; i>0; i--) {
			original.push(i);
		}
		System.out.println(original);
		torreHanoi(original.size(), original, dest, aux);

	}
	
	public static void torreHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux) {
		
		if(n>0) {
			
			torreHanoi(n-1, original, aux, dest);
			dest.push(original.pop());
			System.out.println("-------");
			System.out.println("Pilha Original: "+original);
			System.out.println("Pilha Destino: "+dest);
			System.out.println("Pilha Auxiliar"+aux);
			torreHanoi(n-1, aux, dest, original);
			
		}
		
	}

}
