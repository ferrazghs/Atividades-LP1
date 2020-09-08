package classesjava;

import javax.swing.JOptionPane;

public abstract class TestePessoas {

	public static void main(String[] args) {
		Pessoas[] pessoas =  new Pessoas[5];
		for(int i=0;i<5;i++) {
		pessoas[i] = new Pessoas(" Brasil");
		pessoas[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa :")));
		pessoas[i].setNome(JOptionPane.showInputDialog("Digite o nome da pessoa :"));
		pessoas[i].setSexo(JOptionPane.showInputDialog("Informe o sexo da pessoa"));
		}
		
		for(int i=0;i<5;i++) {
			System.out.print("\n" + "A idade da pessoa é : " + pessoas[i].getIdade() +" anos"+ "\n" + "O nome da pessoa é : " +  pessoas[i].getNome() + "\n" + "O seu sexo é : " + pessoas[i].getSexo() + "\n" + "O seu pais de origem é :" +pessoas[i].getPaisorigem());
			pessoas[i].casa();
		}
	}

}
