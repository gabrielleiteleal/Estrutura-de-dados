package com.gabriel.aprendizado.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.add(1, "B");
		arrayList.add("A");
		System.out.println(arrayList);
		System.out.println("Tamanho do Array: "+arrayList.size());
		int index = arrayList.indexOf("B");
		boolean contain = arrayList.contains("A");
		System.out.println(index);
		System.out.println(contain);
		System.out.println(arrayList.get(2));
		//arrayList.remove(0);
		//arrayList.remove("B");
		System.out.println(arrayList);
		System.out.println(arrayList.lastIndexOf("A"));
		
	}

}
