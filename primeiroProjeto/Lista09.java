package primeiroProjeto;

import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	// 1 - Contador:
		int numero = 1;
		while(numero <= 10) {
			System.out.println(numero);
			numero++; // +1
			}
System.out.println("\n");

	// 2 - Contagem regressiva:
		int numero2 = 10;
		while(numero2 >= 1) {
			System.out.println(numero2);
			numero2--; // -1
			}
System.out.println("\n");

	// 3 - Sequência numérica:
		int numero3 = 0;
		while(numero3 <= 100) {
			System.out.println(numero3);
			numero3+= 5; 
			}
System.out.println("\n");
	
		
// 4 - Mostrando mensagem:
	int mensagem = 1;
	while(mensagem <= 5) {
		System.out.println("Eu gosto de Java");
		mensagem++; 
		}
System.out.println("\n");
	
// 5 - Soma de Números Digitados:
int soma = 0;
int valor;
int contador = 1;
while (contador <=5) {
	System.out.println("Digite 5 números: ");
	valor = scanner.nextInt();
	soma += valor;
	contador += 1 ;
}
System.out.println("A soma dos números é: "+ soma);
System.out.println("\n");

// 6 - Validação de Senha:
System.out.println("Digite a senha:");
int senha = scanner.nextInt();

while(senha != 1234) {
	System.out.println("Senha errada");
     senha = scanner.nextInt();
}
System.out.println("A senha está correta");
System.out.println("\n");

	// 7 - Contagem Regressiva:
System.out.print("Digite um número inteiro positivo: ");
int cont = scanner.nextInt();
while (cont >= 1) {
    System.out.println(cont);
    cont--; 
  }
	
	
	
	
	
}

}

