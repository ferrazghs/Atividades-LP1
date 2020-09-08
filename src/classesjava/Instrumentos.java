package classesjava;

public class Instrumentos {
	private String nome;
	private String cor;
	private float valor;
	
	//construtor
	public Instrumentos(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	// facilidade para tocar
	public void boa() {
		System.out.print("\n" + "Bons instrumentos para tocar");
	}
	public void ruim() {
		System.out.print("Péssimos instrumentos para tocar");
	}

}
