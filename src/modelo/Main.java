package modelo;

import visao.Login;

public class Main {

	public static void main(String[] args) {
		
		Estudante e1 = new Estudante("Léo", "leo@gmail.com", "123", 12345);
		Administrador a1 = new Administrador("João", "joao@gmail.com", "123", "Dono");
		Administrador a2 = new Administrador("Maria", "maria@gmail.com", "123", "Professora");
		Questao q1 = new Questao("Quanto é 2 + 2?", "8", "4", "3", "7", "4", "Matemática", "STJ", 2018);
		Questao q2 = new Questao("Qual é a fórmula da água?", "H2O", "NaCl", "N2", "H2C6O12", "H2O", "Química", "DETRAN", 2020);
		Questao q3 = new Questao("Quanto è 2 * 4?", "4", "6", "8", "10", "8", "Matemática", "ITA", 2020);
		Questao q4 = new Questao("O que respiramos?", "Oxigênio", "Água", "Nitrogênio", "Carbono", "Oxigênio", "Química", "STF", 2020);
		Questao q5 = new Questao("Cachorro é inglês é?", "Cat", "Dog", "Elephant", "Frog", "Dog", "Inglês", "BB", 2009);
		
		BancoDeDados.getEstudantes().add(e1);
		BancoDeDados.getAdministradores().add(a1);
		BancoDeDados.getAdministradores().add(a2);
		BancoDeDados.getQuestoes().add(q1);
		BancoDeDados.getQuestoes().add(q2);
		BancoDeDados.getQuestoes().add(q3);
		BancoDeDados.getQuestoes().add(q4);
		BancoDeDados.getQuestoes().add(q5);
		
		/*
		//Prints para a apresentação 1
		System.out.println(e1.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(q1.toString());
		System.out.println(q2.toString());		
		 */
		
		new Login();
	}	

}