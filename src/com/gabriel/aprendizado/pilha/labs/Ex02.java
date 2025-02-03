package com.gabriel.aprendizado.pilha.labs;

import java.util.Scanner;

import com.gabriel.aprendizado.pilha.Pilha;

public class Ex02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		Scanner scan = new Scanner(System.in);

		for(int i = 1; i<=10; i++) {
			System.out.println("Entre com um número: ");
			int num = scan.nextInt();
			if(num == 0) {
				if(par.estaVazio() || impar.estaVazio()) {
					System.out.println("Uma das pilhas está vazia");
				}else {
					System.out.println("Desempilhando um elemento de cada pilha: ");
					System.out.println("Par: " + par.desempilha());
					System.out.println("Ímpar: " + impar.desempilha());
					//par.desempilha();
					//impar.desempilha();
					System.out.println(par);
					System.out.println(impar);
				}
			}else if(num % 2 == 0){
				System.out.println("Empilhando na pilha 'par'.");
				par.empilha(num);
				System.out.println(par);
			}else {
				System.out.println("Empilhando na pilha 'impar'.");
				impar.empilha(num);
				System.out.println(impar);
			}
		}

		while(!par.estaVazio()) {

			System.out.println("Desempilhando a pilha 'par': " + par.desempilha());

		}
		while(!impar.estaVazio()) {

			System.out.println("Desempilhando a pilha 'impar': " + impar.desempilha());

		}

	}

}
