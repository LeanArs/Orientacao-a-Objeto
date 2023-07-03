package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControllerEstudante;
import modelo.BancoDeDados;

class AdicionarEstudanteListaTest {
	
	@Test
	public void testAdicionarEstudanteLista() {
		
		BancoDeDados.getEstudantes().clear();
		
		// Preparação do teste
		String nome = "Roberta";
		String email = "roberta@gmail.com";
		String senha = "senha456";
		int matricula = 54321;
		 
		ControllerEstudante.adicionarEstudanteLista(nome, email, senha, matricula);
		 
		assertFalse(BancoDeDados.getEstudantes().isEmpty());
	 }
}
