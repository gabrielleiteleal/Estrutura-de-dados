package com.gabriel.aprendizado.pilha.teste;

import java.util.Stack;

import com.gabriel.aprendizado.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		

	}

}
