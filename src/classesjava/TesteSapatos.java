package classesjava;

import javax.swing.JOptionPane;

public class TesteSapatos {

	public static void main(String[] args) {
		Sapatos[] novoSapato = new Sapatos[5];
		for(int i=0;i<5;i++) {
			novoSapato[i] = new Sapatos ("Sapat�nis", 42);
			novoSapato[i].setCor(JOptionPane.showInputDialog("Digite a cor do sapato"));
			
		}
		for(int i=0;i<5;i++) {
			
			System.out.print("\n" +"O modelo do sapato � :"+novoSapato[i].getModelo() + "\n" + "O seu tamanho �: " +novoSapato[i].getTamanho() + "\n" + "Sua cor �: "+novoSapato[i].getCor());
			novoSapato[i].feio();
		}
	}
	

}
