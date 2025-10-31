import java.util.Scanner;

public class AvaliacaoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      Avaliacao avaliacao = new Avaliacao();

	      System.out.println("-----------------------");
	      System.out.println("Cadastro de Avaliação");
	      System.out.println("-----------------------");

	      System.out.print("Nome do aluno: ");
	      String nome = sc.next();
	      avaliacao.setNome(nome);

	      System.out.print("Nota 1: ");
	      double nota1 = sc.nextDouble();
	      avaliacao.setNota1(nota1);

	      System.out.print("Nota 2: ");
	      double nota2 = sc.nextDouble();
	      avaliacao.setNota2(nota2);

	      System.out.println("-----------------------");
	      System.out.println("Aluno: " + avaliacao.getNome());
	      System.out.println("Média final: " + avaliacao.calcularMedia());

	      sc.close();
	   }
	}
