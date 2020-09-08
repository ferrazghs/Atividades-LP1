package classesjava;

import javax.swing.JOptionPane;

public class TesteLugares {

	public static void main(String[] args) {
		Lugares[] novolugar = new Lugares[5];
		for(int i=0;i<5;i++) {
			novolugar[i] =  new Lugares("America do Sul");
			novolugar[i].setPais(JOptionPane.showInputDialog("Digite um pais da America do Sul :"));
			novolugar[i].setCapital(JOptionPane.showInputDialog("Digite a sua capital :"));
			novolugar[i].setMoeda(JOptionPane.showInputDialog("Digite a sua moeda de origem :"));

		}
		for(int i=0;i<5;i++) {
			System.out.print("\n" + "O nome do lugar é : " + novolugar[i].getPais() + "\n" + "O seu continente é : " + novolugar[i].getContinente() +"\n" + "A sua capital é " + novolugar[i].getCapital() + "\n" + "A sua moeda é :" + novolugar[i].getMoeda());
			
		}
	}

}
