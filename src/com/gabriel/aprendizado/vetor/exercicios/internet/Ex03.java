package com.gabriel.aprendizado.vetor.exercicios.internet;

import java.util.Random;
import java.util.Scanner;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex03 {

	public static void main(String[] args) {

		Lista<Integer> lista = new Lista<Integer>(100);
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int x, contain = 0, rand;

		System.out.println("Entre com o valor 'x' a ser procurado: ");
		x = scan.nextInt();

		for (int i = 0; i < 100; i++) {
			rand = random.nextInt(150);
			lista.adicionar(rand);
			if (x == rand) {
				contain = 1;

			}
		}

		if (contain == 1) {
			System.out.println("O número 'x' existe na lista");
		} else {
			System.out.println("O número 'x' não foi encontrado na lista");
		}

		System.out.println(lista);

	}

}
