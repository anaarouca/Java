package primeiroProjeto;

import java.util.Scanner;

public class lista04 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
// 1 - Verificar maioridade

		int idade;
		System.out.println("Qual a sua idade? ");
		idade = scanner.nextInt();
		if(idade >= 18) {
		System.out.println("Você tem " + idade + " anos e é maior de idade");
		} else {
			System.out.println("Você tem " + idade + " anos e é menor de idade");
		}
		
// 2 - Comparar dois números

		int numeroUm;
		int numeroDois;
		System.out.println("Informe o primeiro número: ");
		numeroUm = scanner.nextInt();
		System.out.println("Informe o segundo número: ");
		numeroDois = scanner.nextInt();
		if(numeroUm > numeroDois) {
		System.out.println("O primeiro é maior que o segundo.");
		} else {
			System.out.println("O segundo número é maior ou eles são iguais.");
		}
		
// 	3 - Aprovação por nota
		double nota;
    	System.out.println("Informe a nota:");
    	nota= scanner.nextDouble();
    	if(nota > 7) {
    		System.out.println("Aprovado: sua nota foi " + nota);
    	}else {
    		System.out.println("Reprovado: sua nota foi " + nota);
    	}
    	
//  4 - Verificar número positivo 
    	double numero;
    	System.out.println("Informe o número:");
    	numero= scanner.nextDouble();
    	if(numero > 0) {
    		System.out.println("O número é positivo. ");
    	}else {
    		System.out.println("O número é negativo ou zero.");
    	}
  	   
// 5 - Cálculo de frete
    	double distancia =0;
    	    	System.out.println("Informe a distância:");
    	distancia= scanner.nextDouble();
    	double frete = distancia * 0.5;
    	if(distancia <= 50) {
    		System.out.println("Valor do frete: R$10.00" );
    	}else {
    		System.out.println("Valor do frete: R$" + frete);
    	}
    	
// 6 - O Número é 10?
    	int num;
		System.out.println("Informe o número: ");
		num = scanner.nextInt();
		if(num == 10) {
		System.out.println("O número é 10");
		} else {
			System.out.println("O número não é 10");
		} 
    	
// 7 - Desconto para Associados
		String associado;
	    System.out.println("Você é associado da loja? ");
	    associado = scanner.next();
	    if(associado != "sim") {
	    	System.out.println("Você tem desconto");
	    }else {
	    	System.out.println("Você não tem desconto");
	    }

// 8 - Cálculo de bônus por horas extras
	    int horas =0;
    	System.out.println("Informe as horas trabalhadas:");
horas= scanner.nextInt();        
double menorQueDez = horas * 20;
double maiorQueDez = horas * 15;
if(horas < 10) {
	System.out.println("Bônus por hora extra R$" + menorQueDez );
	
}else {
	System.out.println("Bônus por hora extra R$" + maiorQueDez);
}
	    
	}

}
