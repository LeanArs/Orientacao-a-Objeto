package modelo;

public class Estudante extends Usuario {

	//Attributes
	private int matricula;
	
	//Constructor
	public Estudante(String nome, String email, String senha, int matricula) {
		super(nome, email, senha);
		this.matricula = matricula;
	}

	//Gets e Sets
	public int getMatricula() {
		System.out.println(this.matricula);
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", email=" + email + ", senha=" + senha + ", matricula=" + matricula + "]";
	}
	
}
