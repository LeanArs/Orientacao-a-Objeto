package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControllerAdministrador;
import modelo.BancoDeDados;

class CriarQuestaoTest {

	@Test
	public void testAdicionarEstudanteLista() {
		
		BancoDeDados.getQuestoes().clear();
		
		// Preparação do teste
		String enunciado = "Qual é a cor do céu?";
		String itemA = "Azul"; 
		String itemB = "Vermelho";
		String itemC = "Verde";
		String itemD = "Amarelo";
		String gabarito = "Azul";
		String materia = "Ciências";
		String concurso = "Caixa";
		int ano = 2023;
		
		ControllerAdministrador.criarQuestao(enunciado, itemA, itemB, itemC, itemD, gabarito, materia, concurso, ano);
		 
		assertFalse(BancoDeDados.getQuestoes().isEmpty());
	 }

}
