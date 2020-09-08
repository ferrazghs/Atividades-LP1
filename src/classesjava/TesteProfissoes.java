package classesjava;

import javax.swing.JOptionPane;

public class TesteProfissoes {

	public static void main(String[] args) {
		Profissoes[] novaProfissao = new Profissoes[5];
		for(int i=0;i<5;i++) {
			novaProfissao[i] = new Profissoes("Engenheiro de software", "Engenharia de software");
			novaProfissao[i].setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		}
			novaProfissao[0].setAnosexperiencia(10);
			novaProfissao[1].setAnosexperiencia(20);
			novaProfissao[2].setAnosexperiencia(30);
			novaProfissao[3].setAnosexperiencia(40);
			novaProfissao[4].setAnosexperiencia(50);

		for(int i=0;i<5;i++) {
			System.out.print("\n" + "O nome é " + novaProfissao[i].getNome() + "\n" + "A profissao é " + novaProfissao[i].getProfissao() +"\n" + "Sua faculdade é " + novaProfissao[i].getFaculdade() + "\n" + "Seu tempo de experiência é " + novaProfissao[i].getAnosexperiencia()+ " anos");

		}

}
}

