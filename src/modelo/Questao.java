package modelo;

public class Questao {
	
	//Attributes
	private String nomeConcurso;
	private int anoAplicacao;
	private String materia;
	private String enunciado;
	private String itemA;
	private String itemB;
	private String itemC;
	private String itemD;
	private String gabarito;
	
	//Constructor
	public Questao(String nomeConcurso, int anoAplicacao, String materia, String enunciado, String itemA, String itemB,
			String itemC, String itemD, String gabarito) {
		super();
		this.nomeConcurso = nomeConcurso;
		this.anoAplicacao = anoAplicacao;
		this.materia = materia;
		this.enunciado = enunciado;
		this.itemA = itemA;
		this.itemB = itemB;
		this.itemC = itemC;
		this.itemD = itemD;
		this.gabarito = gabarito;
	}
	
	//Gets e Sets
	public String getNomeConcurso() {
		System.out.println(this.nomeConcurso);
		return nomeConcurso;
	}
	public void setNomeConcurso(String nomeConcurso) {
		this.nomeConcurso = nomeConcurso;
	}
	public int getAnoAplicacao() {
		System.out.println(this.anoAplicacao);
		return anoAplicacao;
	}
	public void setAnoAplicacao(int anoAplicacao) {
		this.anoAplicacao = anoAplicacao;
	}
	public String getMateria() {
		System.out.println(this.materia);
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getEnunciado() {
		System.out.println(this.enunciado);
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getItemA() {
		System.out.println(this.itemA);
		return itemA;
	}
	public void setItemA(String itemA) {
		this.itemA = itemA;
	}
	public String getItemB() {
		System.out.println(this.itemB);
		return itemB;
	}
	public void setItemB(String itemB) {
		this.itemB = itemB;
	}
	public String getItemC() {
		System.out.println(this.itemC);
		return itemC;
	}
	public void setItemC(String itemC) {
		this.itemC = itemC;
	}
	public String getItemD() {
		System.out.println(this.itemD);
		return itemD;
	}
	public void setItemD(String itemD) {
		this.itemD = itemD;
	}
	public String getGabarito() {
		System.out.println(this.gabarito);
		return gabarito;
	}
	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}

	//Methods
	@Override
	public String toString() {
		return "Questao [nomeConcurso=" + nomeConcurso + ", anoAplicacao=" + anoAplicacao + ", materia=" + materia
				+ ", enunciado=" + enunciado + ", itemA=" + itemA + ", itemB=" + itemB + ", itemC=" + itemC + ", itemD="
				+ itemD + ", gabarito=" + gabarito + "]";
	}
}
