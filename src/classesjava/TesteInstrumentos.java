package classesjava;

import javax.swing.JOptionPane;

public class TesteInstrumentos {

	public static void main(String[] args) {
		Instrumentos[] novoInstrumento = new Instrumentos[5];
		for(int i=0;i<5;i++) {
			novoInstrumento[i] =  new Instrumentos("Marrom");
			novoInstrumento[i].setNome(JOptionPane.showInputDialog("Nome"));
			novoInstrumento[i].setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do instrumento")));
		
		}
		
		for(int i=0;i<5;i++) {
			System.out.print("\n" + "O nome do instrumento é : " + novoInstrumento[i].getNome() + "\n" + "A sua cor é : " + novoInstrumento[i].getCor() +"\n" + "O seu valor é " + novoInstrumento[i].getValor()+ " R$");
			novoInstrumento[i].boa();
		}
		
	}

}
