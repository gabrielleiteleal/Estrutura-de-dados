package com.gabriel.aprendizado.vetor.exercicios.internet;

import java.util.Random;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex01 {

	public static void main(String[] args) {

		Lista<Integer> lista = new Lista<Integer>(10);
		Random random = new Random();

		int media = 0, alunosMediaMaior = 0, nota;

		for (int i = 1; i < 11; i++) {
			nota = random.nextInt(100);
			lista.adicionar(nota);
			media += nota;
		}

		media /= 10;

		System.out.println("Lista de notas: " + lista);
		System.out.println("Media da turma: " + media);
		System.out.println("");
		System.out.println("Alunos com nota maior que a média da turma ");
		for (int i = 0; i < 10; i++) {
			if (lista.buscar(i) > media) {
				alunosMediaMaior += 1;
				System.out.println(lista.buscar(i));
			}
		}

	}

}
