package cursojava.execultavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.Classes.Aluno;
import cursojava.Classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class primeiraClasseJava {

	/* main é um auto execultavel em java */
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login ");
		String senha = JOptionPane.showInputDialog("Informe o Senha ");

		if (login.equalsIgnoreCase("admin ") && senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qdt = 1; qdt <= 5; qdt++) {

				/* NEW ALUNO () É UMA INSTANCIA (CRIAÇÃO DE OBJETO */
				/* ALUNO1 É UMA REFENCIA PARA O OBJETO ALUNO */

				String nome = JOptionPane.showInputDialog(" Qual o nome do aluno " + qdt + "?");
				/*
				 * String idade = JOptionPane.showInputDialog(" Qual a idade? "); String
				 * dataNascimento = JOptionPane.showInputDialog(" Data de nascimento? "); String
				 * rg = JOptionPane.showInputDialog(" Registro Geral? "); String cpf =
				 * JOptionPane.showInputDialog(" Qual é o cpf? "); String NomeMae =
				 * JOptionPane.showInputDialog(" Qual é o nome da mae? "); String NomePai =
				 * JOptionPane.showInputDialog(" Qual é o nome do Pai "); String DataMatricula =
				 * JOptionPane.showInputDialog(" Qual é a Data da matricula? "); String
				 * SerieMatricula = JOptionPane.showInputDialog(" Qual a serie matriculada? ");
				 * String NomeEscola = JOptionPane.showInputDialog(" Qual o nome da escola? ");
				 */

				Aluno aluno1 = new Aluno();/* AQUI SERA O JOÃO */
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(NomeMae);
				 * aluno1.setNomePai(NomePai); aluno1.setDataMatricula(DataMatricula);
				 * aluno1.setSerieMatricula(SerieMatricula); aluno1.setNomeEscola(NomeEscola);
				 */

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

				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}

			}
			System.out.println("------------Lista dos Aprovados-----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media = " + aluno.getMediaNota());
			}
			System.out.println("------------Lista dos Aprovados-----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media = " + aluno.getMediaNota());
			}
			System.out.println("------------Lista dos Aprovados-----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com media = " + aluno.getMediaNota());
			}
		}
	}
}
