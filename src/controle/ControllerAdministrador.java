package controle;

import modelo.Administrador;
import modelo.Questao;
import modelo.BancoDeDados;
import visao.HomeAdministrador;

public class ControllerAdministrador{

	public static void adicionarAdministradorLista(String nome, String email, String senha, String cargo) {
		Administrador novoAdministrador = new Administrador (nome, email, senha, cargo);
		BancoDeDados.getAdministradores().add(novoAdministrador);
	}
	
	public static boolean logarAdministrador(String email, String senha) {
		boolean check = false;
		for (int i = 0; i < BancoDeDados.getAdministradores().size(); i++) {
			if (BancoDeDados.getAdministradores().get(i).getEmail().equals(email)
					& BancoDeDados.getAdministradores().get(i).getSenha().equals(senha)){
				check = true;
				new HomeAdministrador(BancoDeDados.getAdministradores().get(i), "");
			}
		}
		return check;
	}
	
	public static void criarQuestao(String enunciado, String itemA, String itemB, String itemC, String itemD, String gabarito, String materia, String concurso, int ano) {
		Questao novaQuestao = new Questao (enunciado, itemA, itemB, itemC, itemD, gabarito, materia, concurso, ano);
		BancoDeDados.getQuestoes().add(novaQuestao);
	}
	
	public static void editarQuestao(Questao questao, String enunciado, String itemA, String itemB, String itemC, String itemD, String gabarito, String materia, String concurso, int ano) {
		questao.setEnunciado(enunciado);
		questao.setItemA(itemA);
		questao.setItemB(itemB);
		questao.setItemC(itemC);
		questao.setItemD(itemD);
		questao.setGabarito(gabarito);
		questao.setMateria(materia);
		questao.setNomeConcurso(concurso);
		questao.setAnoAplicacao(ano);
	}
	
	public static void deletarQuestao(int posicao) {
		for(int i = 0; i < BancoDeDados.getQuestoes().size(); i++){
			if(BancoDeDados.getQuestoes().get(i) == BancoDeDados.getQuestoes().get(posicao)) {
				BancoDeDados.getQuestoes().remove(i);
			}
		}
	}
	
}
