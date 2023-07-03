package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControllerEstudante;
import modelo.BancoDeDados;
import modelo.Estudante;

class LogarEstudanteTest {
	  
	// Instanciando um estudante e adicionando-o em uma lista de estudantes.
	public void setup() {
		Estudante e1 = new Estudante("Pedro", "pedro@gmail.com", "senha123", 12345);
		BancoDeDados.getEstudantes().add(e1);
	}
	
	@Test
	public void testLogarEstudante_CredenciaisCorretas() {
	    
		setup();
	    
	    String email = "pedro@gmail.com";
	    String senha = "senha123";
	    
	    boolean resultado = ControllerEstudante.logarEstudante(email, senha);
	    
	    // Verificação do resultado
	    assertTrue(resultado);
	}
	 
	@Test
	public void testLogarEstudante_CredenciaisIncorretas() {
	    
		setup();
	    
	    String email = "pedro@gmail.com";
	    String senha = "aaaaaaaaa";
	    
	    boolean resultado = ControllerEstudante.logarEstudante(email, senha);
	    
	    // Verificação do resultado
	    assertFalse(resultado);
	}
}
