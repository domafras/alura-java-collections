package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {

		//Set<String> alunos = new HashSet<>();
		
		//Sendo gen�rico
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Anichie");
		alunos.add("Mauricio Anichie");
		
		//Verifica se cont�m
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println("Paulo est� matriculado: " + pauloEstaMatriculado);
		
		//Tamanho
		System.out.println("Tamanho: " + alunos.size());
		
		System.out.println("--------------------");
		
		//Usando "foreach + Ctrl Espa�o"
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//Remover
		alunos.remove("Sergio Lopes");
		
		System.out.println("--------------------");
		
		//Usando forEach
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Vantagem "Set" -> ordem n�o especificada, n�o repete elementos
		System.out.println(alunos);
		
	}
}
