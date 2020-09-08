package classesjava;

public class Pessoas {
	private String nome;
	private String sexo;
	private int idade;
	private String paisorigem;


public Pessoas(String paisorigem) {
	this.paisorigem = paisorigem;
	
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


public String getSexo() {
	return sexo;
}


public void setSexo(String sexo) {
	this.sexo = sexo;
}


public String getPaisorigem() {
	return paisorigem;
}


public void setPaisorigem(String paisorigem) {
	this.paisorigem = paisorigem;
}
public void casa() {
	System.out.print( "Fique em casa !!!!");
}


}