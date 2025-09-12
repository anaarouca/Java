package primeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Contador:
		int contador =10;
		while(contador <= 30) {
			System.out.println(contador);
			contador++; // +1
		}
		System.out.println("-------------------");
		// 2 - Soma de Números Digitados:

		Scanner sc= new Scanner (System.in);
		int contador2 = 1;
		int soma = 0;
		
		while (contador2 <= 3){
		System.out.println("Digite o numero "+ contador2 + ":");
		int numero = sc.nextInt();
		soma = soma + numero;
			contador2++; 
		}
		System.out.println("A soma é: " + soma);
		System.out.println("-------------------");
		// 3 - Multiplicação de Números Digitados:

		int contador3 = 1;
		int mult = 1;
		
		while (contador3 <= 5){
		System.out.println("Digite o numero "+ contador3 + ":");
		int numero = sc.nextInt();
		mult = mult * numero;
			contador3++; 
		}
		System.out.println("A muliplicação é: " + mult);
		System.out.println("-------------------");
		// 4 - Contar até o número informado:
		System.out.print("Digite um número inteiro: ");
		int cont = scanner.nextInt();
		int numero = 1;
		while (numero <= cont) {
		    System.out.println(numero);
		    numero++; 
		  }
		System.out.println("-------------------");
		// 5 - Somar os números de 1 a 5:
		int um = 1;
		int dois = 0;
		
		while(um <= 5) {
			dois = dois + um;
			um++;
		}
		System.out.println("A soma do 1 a 5 é: " + dois);
		System.out.println("-------------------");

		// 6 - Tabuada
		System.out.println("Digite um número para ver a tabuada: ");
		int tabuada = scanner.nextInt();
		int i = 1;
		while (i <= 10) {
		System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		i++;
		}


	}

}
