package classesjava;

import javax.swing.JOptionPane;

public class TesteAlunos {

	public static void main(String[] args) {

		AlunosFatec[] Alunosfatec = new AlunosFatec[5];
		for(int i=0;i<5;i++) {
			Alunosfatec[i] =  new AlunosFatec("Banco de dados" , 2);
			Alunosfatec[i].setNome(JOptionPane.showInputDialog("Digite o nome do aluno :"));
			Alunosfatec[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade :")));
			
		}
		
		for(int i=0;i<5;i++) {
			System.out.print("\n" + "O nome do aluno é : " + Alunosfatec[i].getNome() + "\n" + "A sua idade é : " +  Alunosfatec[i].getIdade() + "anos" + "\n" + "O seu semestre é " + Alunosfatec[i].getSemestre()+ " Semestre" + "\n" + "O seu curso é :" + Alunosfatec[i].getCurso());
			Alunosfatec[i].bons();
		}
		
	}
}
