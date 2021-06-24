package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// add
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// remove
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);

		// for each
		for (String aula : aulas) { // Para cada String aula dentro de aulas
			System.out.println("Aula: " + aula);
		}

		// get
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		// for + get
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		// size
		System.out.println(aulas.size());

		// método forEach
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula - " + aula);
		});
		
		//Ordenar listas
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("Antes de ordenar: " + aulas); //Antes da ordenação alfabética
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: " + aulas); //Depois de ordenado
	}
}
