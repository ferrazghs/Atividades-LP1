package classesjava;

public class Sapatos {
	private String modelo;
	private int tamanho;
	private String cor;


//construtor
public Sapatos(String modelo, int tamanho) {
	this.modelo = modelo;
	this.tamanho = tamanho;	
}
//métodos de acesso set
public void setModelo(String m) {
	modelo = m;
}
public void setTamanho(int t) {
	 tamanho = t;
}
public void setCor(String c) {
	cor = c;
}
//metodo de acesso get
public String getModelo(){
	return modelo;
}
public int getTamanho(){
	return tamanho;
}
public String getCor(){
	return cor;
}
// sapato feio
public void feio() {
	System.out.print("\n" + "Modelos de sapatos são feios");
}
public void bonito() {
	System.out.print("Modelos de sapatos são bonitos");
}
}