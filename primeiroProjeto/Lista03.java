package primeiroProjeto;

import java.util.Scanner;

public class Lista03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// 1- Resultado de dois números 
		int numeroUm;
		int numeroDois;
		System.out.println("Informe o primeiro número (inteiro): ");
		numeroUm = scanner.nextInt();
		System.out.println("Informe o segundo número (inteiro): ");
		numeroDois = scanner.nextInt();
		int soma = numeroUm + numeroDois; 
		System.out.println("A soma dos números é: " + soma);
		
		// 2- Divisão e Resto 
		int numeroum;
		int numerodois; 
		System.out.println("Informe o primeiro número (inteiro): ");
		numeroum = scanner.nextInt();
		System.out.println("Informe o segundo número (inteiro): ");
		numerodois = scanner.nextInt();
		int divisao = numeroum / numerodois;
		int resto = numeroum % numerodois; 
		System.out.println("O resultado da divisão é: " + divisao);
		System.out.println("O resto da divisão é: " + resto);
		
		
		// 3- Perímetro de um triângulo 
		double ladoUm;
		double ladoDois;
		double ladoTres;
		System.out.println("Informe o primeiro lado do triângulo: ");
		ladoUm = scanner.nextDouble();
		System.out.println("Informe o segundo lado do triângulo: ");
		ladoDois = scanner.nextDouble(); 
		System.out.println("Informe o terceiro lado do triângulo: ");
        ladoTres = scanner.nextDouble(); 
        double perimetro = ladoUm + ladoDois + ladoTres; 
        System.out.println("O perímetro do triângulo é: " + perimetro);
        
        // 4- Calculadora de Gorjeta 
        double conta; 
        double porcentagem;
        System.out.println("Informe o valor da conta: ");
        conta = scanner.nextDouble();
        System.out.println("Informe a porcentagem de gorjeta desejada: ");
        porcentagem = scanner.nextDouble();
        double gorjeta = conta * (porcentagem/100);
        double total = conta + gorjeta; 
        System.out.println("O total da gorjeta é: R$" + gorjeta);
        System.out.println("O total a ser pago é: R$" + total);
        
        // 5- Calculadora de área de círculo 
        double raio;
        double pi = 3.14159;
        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextDouble();
        double area = pi * raio * raio;
        System.out.println("A área do círculo é: " + area);
        
        // 6- Conversor de idade em dias
        
        System.out.println("Anos: ");
        int anos = scanner.nextInt();
        System.out.println("Meses: ");
        int meses = scanner.nextInt();
        System.out.println("Dias: ");
        int dias = scanner.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Total de dias vividos: " + totalDias);
        
        // 7- Calculadora de pagamento por hora 
        double hora;
        double valorPorHora;
        System.out.println("Informe o número de horas trabalhadas>: ");
        hora = scanner.nextDouble();
        System.out.println("Informe o valor pago por hora: ");
        valorPorHora = scanner.nextDouble(); 
        double salario = hora * valorPorHora; 
        System.out.println("O salário bruto é de: " + salario);
        
	}

}
