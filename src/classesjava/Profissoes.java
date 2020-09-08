package classesjava;

public class Profissoes {
	private String nome;
	private String profissao;
	private String faculdade;
	private int anosexperiencia;


//construtor
public Profissoes(String profissao, String faculdade) {
	this.profissao = profissao;
	this.faculdade = faculdade;
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getProfissao() {
	return profissao;
}

public void setProfissao(String profissao) {
	this.profissao = profissao;
}

public String getFaculdade() {
	return faculdade;
}

public void setFaculdade(String faculdade) {
	this.faculdade = faculdade;
}

public int getAnosexperiencia() {
	return anosexperiencia;
}

public void setAnosexperiencia(int anosexperiencia) {
	this.anosexperiencia = anosexperiencia;
}

}
