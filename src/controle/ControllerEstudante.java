package controle;

import modelo.BancoDeDados;
import modelo.Estudante;
import visao.HomeEstudante;

public class ControllerEstudante extends ControllerUsuario{
	
	public static void adicionarEstudanteLista(String nome, String email, String senha, int matricula) {
		Estudante novoEstudante = new Estudante(nome, email, senha, matricula);
		BancoDeDados.getEstudantes().add(novoEstudante);
	}
	
	public static boolean logarEstudante(String email, String senha) {
		boolean check = false;
		for (int i = 0; i < BancoDeDados.getEstudantes().size(); i++) {
			if (BancoDeDados.getEstudantes().get(i).getEmail().equals(email)
					& BancoDeDados.getEstudantes().get(i).getSenha().equals(senha)){
				check = true;
				new HomeEstudante(BancoDeDados.getEstudantes().get(i), "");
			}
		}
		return check;
	}
	
	public static boolean responderQuestao(String resposta, int index) {
		boolean check = false;
			if (BancoDeDados.getQuestoes().get(index).getGabarito().equals(resposta)){
				check = true;
			}
		return check;
	}
	
	}
