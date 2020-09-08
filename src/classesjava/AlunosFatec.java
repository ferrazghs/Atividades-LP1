package classesjava;

public class AlunosFatec {
	private String nome;
	private int idade;
	private String curso;
	private int semestre;
	
	//construtor
		public AlunosFatec(String curso, int semestre) {
			this.curso = curso;
			this.semestre = semestre;
		}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void bons() {
		System.out.print("\n" + "Bom Aluno ");
	}
	public void ruins() {
		System.out.print("Péssimo Aluno");
	}


}
