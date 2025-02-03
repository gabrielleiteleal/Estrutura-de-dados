package com.gabriel.aprendizado.vetor.teste;

import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		// 
		
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> soma = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		for(int k: lista) {System.out.print(k);}
		
		lista.forEach((v)->{soma.add(v*2);});
		
		System.out.println(soma);

	}

}
