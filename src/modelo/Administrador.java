package modelo;

public class Administrador extends Usuario {
	
	//Attributes
	private String cargo;
	
	//Constructor
	public Administrador(String nome, String email, String senha, String cargo) {
		super(nome, email, senha);
		this.cargo = cargo;
	}

	//Gets e Sets
	public String getCargo() {
		System.out.println(this.cargo);
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Administrador [nome=" + nome + ", email=" + email + ", senha=" + senha + ", cargo=" + cargo + ", listaQuestoes=" + "]";
	}
	
}
