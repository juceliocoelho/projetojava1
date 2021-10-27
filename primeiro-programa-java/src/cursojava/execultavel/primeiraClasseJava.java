package cursojava.execultavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.Classes.Aluno;
import cursojava.Classes.Disciplina;

public class primeiraClasseJava {

	/* main é um auto execultavel em java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qdt = 1; qdt <= 2; qdt++) {

			/* NEW ALUNO () É UMA INSTANCIA (CRIAÇÃO DE OBJETO */
			/* ALUNO1 É UMA REFENCIA PARA O OBJETO ALUNO */

			String nome = JOptionPane.showInputDialog(" Qual o nome do aluno " + qdt + "?");
			String idade = JOptionPane.showInputDialog(" Qual a idade? ");
			String dataNascimento = JOptionPane.showInputDialog(" Data de nascimento? ");
			String rg = JOptionPane.showInputDialog(" Registro Geral? ");
			String cpf = JOptionPane.showInputDialog(" Qual é o cpf? ");
			String NomeMae = JOptionPane.showInputDialog(" Qual é o nome da mae? ");
			String NomePai = JOptionPane.showInputDialog(" Qual é o nome do Pai ");
			String DataMatricula = JOptionPane.showInputDialog(" Qual é a Data da matricula? ");
			String SerieMatricula = JOptionPane.showInputDialog(" Qual a serie matriculada? ");
			String NomeEscola = JOptionPane.showInputDialog(" Qual o nome da escola? ");

			Aluno aluno1 = new Aluno();/* AQUI SERA O JOÃO */
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(NomeMae);
			aluno1.setNomePai(NomePai);
			aluno1.setDataMatricula(DataMatricula);
			aluno1.setSerieMatricula(SerieMatricula);
			aluno1.setNomeEscola(NomeEscola);

			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina ? ");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
					posicao++;
				}

				alunos.add(aluno1);
			}

			for (int pos = 0; pos < alunos.size(); pos++) {

				Aluno aluno = alunos.get(pos);

				if (aluno.getNome().equalsIgnoreCase("alex")) {

					Aluno trocar = new Aluno();
					trocar.setNome("Aluno foi trocado");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina("Matematica");
					disciplina.setNota(96);

					trocar.getDisciplinas().add(disciplina);

					alunos.set(pos, trocar);
					aluno = alunos.get(pos);
				}

				System.out.println("Aluno = " + aluno.getNome());
				System.out.println("Media do aluno = " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------");

				for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++)
					;

				Disciplina disc = aluno.getDisciplinas().get(pos);
				System.out.println("Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());
			}
		}
	}
}