package com.gabriel.aprendizado.pilha.labs;

import java.util.Scanner;

import com.gabriel.aprendizado.pilha.Pilha;

public class Ex01 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>(10);
		Scanner scan = new Scanner(System.in);

		for(int i = 1; i<=10; i++) {
			System.out.println(pilha);
			System.out.println("Entre com um número: ");
			int num = scan.nextInt();
			if(num % 2 == 0) {
				pilha.empilha(num);
			}else{
				Integer desempilha = pilha.desempilha();

				if(desempilha == null) {
					System.out.println("A pilha está vazia");
				}else {
					System.out.println(desempilha);
					
				}
			}
		}

		while(!pilha.estaVazio()) {
			
				System.out.println("Desenpilhando o elemento: " + pilha.desempilha());
				
		}

	}

}
