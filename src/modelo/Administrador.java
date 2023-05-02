package modelo;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
	
	//Attributes
	private String cargo;
	private List<Questao> listaQuestoes;
	
	//Constructor
	public Administrador(String nome, String email, String senha, String cargo) {
		super(nome, email, senha);
		this.cargo = cargo;
		listaQuestoes = new ArrayList<Questao>();
	}

	//Gets e Sets
	public String getCargo() {
		System.out.println(this.cargo);
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Questao> getListaQuestoes() {
		System.out.println(this.listaQuestoes);
		return listaQuestoes;
	}

	public void setListaQuestoes(List<Questao> listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Administrador [cargo=" + cargo + ", listaQuestoes=" + listaQuestoes + "]";
	}

	public void adicionarQuestaoLista() {
		
	}

	public void deletarQuestao() {
		
	}
}
