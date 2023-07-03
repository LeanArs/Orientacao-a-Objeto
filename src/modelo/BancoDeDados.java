package modelo;

import java.util.ArrayList;

public class BancoDeDados {
	
	public static ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
	public static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
	public static ArrayList<Questao> questoes = new ArrayList<Questao>();
	
	public static ArrayList<Estudante> getEstudantes() {
		return estudantes;
	}
	public static void setEstudantes(ArrayList<Estudante> estudantes) {
		BancoDeDados.estudantes = estudantes;
	}
	public static ArrayList<Administrador> getAdministradores() {
		return administradores;
	}
	public static void setAdministradores(ArrayList<Administrador> administradores) {
		BancoDeDados.administradores = administradores;
	}
	public static ArrayList<Questao> getQuestoes() {
		return questoes;
	}
	public static void setQuestoes(ArrayList<Questao> questoes) {
		BancoDeDados.questoes = questoes;
	}

}
