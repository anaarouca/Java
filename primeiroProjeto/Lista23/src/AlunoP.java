import java.util.Scanner;



public class AlunoP {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);

		
		System.out.println("-----------------------");
		System.out.println("Cadastro de alunos");
		System.out.println("-----------------------");
		System.out.println("Nome do aluno: ");
		String nome = sc.next();
		System.out.println("Idade do aluno: ");
		int idade = sc.nextInt();
		System.out.println("-----------------------");
		
		aluno.setNome(nome);
		aluno.setIdade(idade);
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());

	}

}
