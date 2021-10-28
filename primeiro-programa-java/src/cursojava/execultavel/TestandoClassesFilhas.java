package cursojava.execultavel;

import cursojava.Classes.Aluno;
import cursojava.Classes.Diretor;
import cursojava.Classes.Secretario;


public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - treinamento ");
		aluno.setNomeEscola("Alex JDev - treinamento");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("33344444");
		diretor.setNome("egidio");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setDataNascimento("Adiministracao ");
		secretario.setDataNascimento("44444444444");
		secretario.setIdade(18);
        secretario.setNome("João ");
        
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("salario Aluno é = " + aluno.salario());
		System.out.println("salario diretor é = " + diretor.salario());
		System.out.println("salario secretario é = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	public static void teste(cursojava.Classes.pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "
				+ pessoa.getNome() + " e o salario é de = " + pessoa.salario());
	}
}
