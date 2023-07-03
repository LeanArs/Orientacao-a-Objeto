package controle;

import javax.swing.DefaultListModel;

import modelo.BancoDeDados;

public class ControllerUsuario {
	
	public static DefaultListModel<String> listarQuestoes() {
		DefaultListModel<String> questoes = new DefaultListModel<>();
		for(int i = 0; i < BancoDeDados.getQuestoes().size(); i++) {
			int index = i + 1;
			String questao = "Questão " + index + " - " + BancoDeDados.getQuestoes().get(i).getMateria();
			questoes.addElement(questao);
		}
		return questoes;
	}
	
	public static DefaultListModel<String> buscarListaQuestoes(String materia) {
		DefaultListModel<String> listaQuestoesBuscadas = new DefaultListModel<>();
		if (materia.isEmpty() == true) {
			listaQuestoesBuscadas = listarQuestoes();
		}
		else {
			for(int i = 0; i < BancoDeDados.getQuestoes().size(); i++) {
				if (BancoDeDados.getQuestoes().get(i).getMateria().equals(materia)){
					String questao = listarQuestoes().get(i);
					listaQuestoesBuscadas.addElement(questao);
				}
			}
		}
		return listaQuestoesBuscadas;
	}
	
	public static int buscarQuestoes(String materia, int index) {
		int posicao = 0;
		int[] posicDB = new int[BancoDeDados.getQuestoes().size()];
		int j = 0;
		for(int i = 0; i < BancoDeDados.getQuestoes().size(); i++) {
			if (BancoDeDados.getQuestoes().get(i).getMateria().equals(materia)){
				posicDB[j] = i;
				j++;
			}
		}
		if (index < j) {
	        posicao = posicDB[index];
	    }
		return posicao;
	}
	
}
