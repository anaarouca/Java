package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Contador:
		for(int cont = 10; cont <= 30; cont++) {
			System.out.println(cont);
			}
		System.out.println("-------------------");
		
		// 2 - Classificação de Idades:
		int idade;
		for (int cont = 1; cont <=10; cont++) {
			System.out.println("Informe a idade:");
			idade = scanner.nextInt();
			if (idade < 18) {
				System.out.println("Menor de idade");
			}else {
				System.out.println("Maior de idade");
			}
		}
		System.out.println("-------------------");
		
		//3 - Eleição:
		int eleicao;
		for(int cont1 = 1; cont1 <= 5; cont1++) {
		System.out.println("Informe seu voto: ");
		eleicao = scanner.nextInt();
				
		if (eleicao == 1 || eleicao == 2 || eleicao == 3 || eleicao == 4) {
		System.out.println("Você votou no candidato");
		} else if (eleicao == 5){
		System.out.println("Voto Nulo");
		} else if (eleicao == 6){
		System.out.println("Voto em branco");
		} else {
		System.out.println("Voto inválido");
			}
		}
		
		// 4 - Repetição de Frase
		
		System.out.println("Informe uma frase: ");
		String frase = scanner.next();
		System.out.println("Quantas vezes quer ver a frase?");
		int vezes = scanner.nextInt();
		
		for(int i = 1; i <= vezes; i++) {
			System.out.println(frase);
		}
		System.out.println("-------------------");

		// 5 - Sequência
		for(int cont = 50; cont >= 30; cont--) {
			System.out.println(cont);
			}
		System.out.println("-------------------");

		// 6 - Números Alternados
		for(int cont = 1; cont <= 50; cont+= 2) {
			System.out.println(cont);
			}
		System.out.println("-------------------");
		
		// 7 - Aprovado ou Reprovado
		for(int voltas = 1; voltas <= 5; voltas++) {
			System.out.println("Informe a nota: ");
			double nota = scanner.nextDouble();
			if(nota < 7) {
				System.out.println("Reprovado");
			}else {
				System.out.println("Aprovado");
				
			}
		}
		System.out.println("-------------------");
		// 8 - Categoria de Idade
		int categoria;
		for(int cont1 = 1; cont1 <= 5; cont1++) {
		System.out.println("Informe a idade: ");
		categoria = scanner.nextInt();
				
		if (categoria <= 12) {
		System.out.println("Criança");
		} else if (categoria <= 17 ){
		System.out.println("Adolescente");
		} else if (categoria <= 59){
		System.out.println("Adulto");
		} else {
			
		System.out.println("Idoso");
		}
	}
		System.out.println("-------------------");
		
		// 9 - Número Positivo ou Negativo
		int num3;
		for(int cont2 = 1; cont2 <= 7; cont2++) {
		System.out.println("Informe o número: ");
		num3 = scanner.nextInt();
				
		if (num3 < 0) {
		System.out.println("Negativo");
		} else if (num3 == 0 ){
		System.out.println("Zero");
	    } else if (num3 >= 1) {
		System.out.println("Positivo");
		 }
			
		}
		
		
		}
}