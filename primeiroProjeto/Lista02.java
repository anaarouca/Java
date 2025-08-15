package primeiroProjeto;

import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1 - Resultado de dois números

		Scanner scanner = new Scanner (System.in);
		
		int primeiroNumero;
		int segundoNumero;
		System.out.println("Informe um número:");
		primeiroNumero = scanner.nextInt();
		System.out.println("Informe o segundo número:");
		segundoNumero = scanner.nextInt();
		int soma = primeiroNumero + segundoNumero;
		int sub = primeiroNumero - segundoNumero;
		int mult = primeiroNumero * segundoNumero;
		int div = primeiroNumero / segundoNumero; 
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + sub);
		System.out.println("A multiplicação é: " + mult);
		System.out.println("A divisão é: " + div);
		
		// 2- Cálculo de temperatura
		
		double temperatura;
		System.out.println("Informe a temperatura:");
		temperatura = scanner.nextDouble();
		double temp = (temperatura * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é: " + temp);
		
		// 3- Conversão de Valor
		double dolar = 5.70;
		double real;
		System.out.println("Informe o valor em $: ");
		real = scanner.nextDouble();
		double conversao = real / dolar;
		System.out.println("O valor convertido é: R$" + conversao);
		
		// 4- Área do retângulo 
		double base;
		double altura;
		System.out.println("Informe a base do retângulo: ");
		base = scanner.nextDouble();
		System.out.println("Informe a altura do retângulo: ");
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A área do retângulo é: " + area);
		
		// 5- Conversor de idade 
		int idade;
		int meses = 12;
		System.out.println("Informe a idade: ");
		idade = scanner.nextInt();
		int idadeEmMeses = idade * meses;
		System.out.println("A idade em meses é: " + idadeEmMeses);
		
		// 6- Conversor de minutos para segundos
		int minutos;
		int segundos = 60;
		System.out.println("Informe os minutos: ");
		minutos = scanner.nextInt(); 
		int convertido = minutos * segundos;
		System.out.println("Os minutos convertidos para segundos é: " + convertido);
		
		// 7- Custo da compra 
		double preco; 
		int quantidade;
		System.out.println("Informe o preço do produto: "); 
		preco = scanner.nextDouble();
		System.out.println("Informe a quantidade de produtos: ");
		quantidade = scanner.nextInt();
		double total = preco * quantidade; 
		System.out.println("O total da compra é: R$" + total);
		
		// 8- Divisão de uma conta de restaurante 
		double totalConta;
		int numeroDePessoas;
		System.out.println("Informe o total da conta: ");
		totalConta = scanner.nextDouble();
		System.out.println("Informe a quantidade de pessoas: ");
		numeroDePessoas = scanner.nextInt();
		double totalPorPessoa = totalConta / numeroDePessoas;
		System.out.println("Cada pessoa deve pagar R$" + totalPorPessoa);
		
		// 9- Cálculo de troco 
		double valorDaCompra; 
		double valorPago;
		System.out.println("Informe o valor da compra: ");
		valorDaCompra = scanner.nextDouble();
		System.out.println("Informe o valor pago pelo cliente: ");
		valorPago = scanner.nextDouble();
		double troco = valorPago - valorDaCompra; 
		System.out.println("O valor do troco será: R$" + troco);
		
		
		
		
		
		
	}

}
