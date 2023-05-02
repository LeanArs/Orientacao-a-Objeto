package modelo;

public abstract class Usuario {
	
	//Attributes
	protected String nome;
	protected String email;
	protected String senha;
	
	//Constructor
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	//Gets e Sets
	public String getNome() {
		System.out.println(this.nome);
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		System.out.println(this.email);
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		System.out.println(this.senha);
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	//Methods
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}
	
	public void filtrarQuestoes(Questao materia) {
		
	}
}
