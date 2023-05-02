package modelo;

public class Main {

	public static void main(String[] args) {
		
		Estudante e1 = new Estudante("Leandro", "leandro@gmail.com", "senha", 12345);
		Administrador a1 = new Administrador("Joao", "joao@gmail.com", "senha", "Professor");
		Administrador a2 = new Administrador("Maria", "maria@gmail.com", "senha", "Professor");
		Questao q1 = new Questao("STJ", 2018, "Matemática", "Quanto é 2 + 2?", "8", "4", "3", "7", "4");
		Questao q2 = new Questao("DETRAN", 2020, "Química", "Qual é a fórmula da água?", "H2O", "NaCl", "N2", "H2C6O12", "H2O");
		
		System.out.println(e1.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(q1.toString());
		System.out.println(q2.toString());
		
	}

}