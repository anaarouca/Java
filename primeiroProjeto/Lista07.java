package primeiroProjeto;

import java.util.Scanner;

public class Lista07 {

	private static String residente;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Classificação de Filme
		int idade;
		System.out.println("Informe a idade: ");
		idade = scanner.nextInt();
		if(idade < 16 || idade > 70) {
		System.out.println("Classificação especial");
		}else {
			System.out.println("Classificação regular");
		}

		// 2 - Promoção de Produto
		System.out.println("Qual o valor da compra?");
		double valor = scanner.nextDouble();
		System.out.println("Informe a quantidade comprada:");
		int quantidade = scanner.nextInt();
		
		if(valor > 200 && quantidade > 5) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f" , valorFinal);
		}else {
			System.out.println("Não tem desconto");
			}
		
		// 3 - Alerta de Saúde
		System.out.println("\n");
		System.out.println("Informe a frequência cardíaca (em bpm): ");
		double frequencia = scanner.nextDouble();
		System.out.println("Sente tontura?");
		String tontura = scanner.next();
		
		if(frequencia >= 100 || tontura.equalsIgnoreCase("SIM")) {
			System.out.printf("Procure atendimento médico.");
		}else {
			System.out.println("Sem sinais de alerta.");
		}
		
		// 4 - Participação em Concurso
		System.out.println("\n");
		int idadeCandidato;
		System.out.println("Informe a idade: ");
		idadeCandidato = scanner.nextInt();
		System.out.println("Você é residente do Estado?");
		residente = scanner.next();
		if(idadeCandidato >= 18 && idadeCandidato <= 30) {
		System.out.println("Elegível para o curso");
		}else {
			System.out.println("Não elegível para o curso");
		}
		
		// 5 - Recompensa por Desempenho
		System.out.println("\n");
		int projetos;
		int errosReportados;
		System.out.println("Informe o número de projetos concluídos: ");
		projetos = scanner.nextInt();
		System.out.println("Informe o número de erros reportados:");
		errosReportados = scanner.nextInt();
		if(projetos > 10 && errosReportados <= 3) {
		System.out.println("Recompensa concedida");
		}else {
			System.out.println("Sem recompensa");
		}
		
		// 6 - Autorização para Viagem
		System.out.println("\n");
		int idadeViagem;
		String passaporte;
		System.out.println("Informe a idade: ");
		idadeViagem = scanner.nextInt();
		System.out.println("Possui passaporte válido?");
		passaporte = scanner.next();
		if(idadeViagem >= 18 && passaporte.equalsIgnoreCase("SIM")) {
		System.out.println("Viagem autorizada");
		}else {
			System.out.println("Viagem não autorizada");
		}

		// 7 - Aprovação em Curso Online
		System.out.println("\n");
		int aprovacao;
		int aulasAssistidas;
		System.out.println("Informe a nota final (0 a 100): ");
		aprovacao = scanner.nextInt();
		System.out.println("Informe o número de aulas assistidas (0 a 50):");
		aulasAssistidas = scanner.nextInt();
		if(aprovacao >= 70 && aulasAssistidas >= 40) {
		System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		// 8 - Controle de Irrigação
		System.out.println("\n");
		double umidadeDoSolo;
		double temperatura;
		System.out.println("Informe a umidade do solo (%): ");
		umidadeDoSolo = scanner.nextDouble();
		System.out.println("Informe a temperatura (°C):");
		temperatura = scanner.nextDouble();
		if(umidadeDoSolo < 30 || temperatura > 30) {
		System.out.println("Irrigação necessária");
		}else {
			System.out.println("Irrigação não necessária");
		}
		
		// 9 - Inscrição em Feira Profissional
		System.out.println("\n");
		int idadeS;
		String experiencia;
		System.out.println("Informe a idade: ");
		idadeS = scanner.nextInt();
		System.out.println("Você tem experiência?");
		experiencia = scanner.next();
		if(idadeS >= 20 && idadeS <= 40 && experiencia.equalsIgnoreCase("Sim")) {
		System.out.println("Inscrição Aceita");
		}else {
			System.out.println("Inscrição não permitida");
		}



 
	}

}
