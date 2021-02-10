/**
 * Meu Primeiro Programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com método  main.
 * 3) Como exibir informações no terminal (console = área da tela de comunicação com o usuário) do Jabva.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Mariana Zubi
 * data: 03/02/2021
 */
public class Principal { // Classe que contém o método principal.
	public static void main(String[] args) { // Este é o método principal
		
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica para o nome lido.
		System.out.printf("Olá %s!", nome);
		in.close();

		
	}

}
