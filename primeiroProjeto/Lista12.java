package primeiroProjeto;

import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Contador:

		int contador = 10;
		do {
			System.out.println(contador);
			contador++; 
		} while (contador <= 30);
		System.out.println("-------------------");

		
		// 2 - Adivinhação de número:
		int numero;
		do {
			System.out.println("Qual o número?");
			numero= scanner.nextInt();
			} while(numero != 5);
		System.out.println("Acertou o número!");
		
		System.out.println("-------------------");
		
		// 3 - Verificação de peso na mala:
        int peso;
		
		do {
			System.out.println("Informe o peso da mala:");
			peso= scanner.nextInt();
			 if(peso > 23){
				System.out.println("Peso excedido");
				} else {
				System.out.println("Peso dentro do limite");
				
			} 
		} while (peso > 23);
		System.out.println("-------------------");
        
        // 4 - Verificar quantidade de páginas lidas na semana:
        int dias = 1;
		int totalPaginas = 0;
		
		do {
			System.out.println("Quantas páginas você leu hoje?");
			int paginas = scanner.nextInt();
			totalPaginas = totalPaginas + paginas;
			dias++; 
			} while(dias <= 7);
		System.out.println("Você leu " + totalPaginas + " páginas na semana");
		System.out.println("-------------------");
		
		// 5 - Testar código de acesso:
		int codigo;
		
		do {
			System.out.println("Qual é o código?");
			codigo= scanner.nextInt();
			 if(codigo != 42){
				System.out.println("Código Errado");
				} else {
				System.out.println("Código correto");
				System.out.println("Acesso liberado");
			} 
		} while (codigo != 42);
		System.out.println("-------------------");
		
		// 6 - Verificar nível de combustivel:
        int nivel;
		
		do {
			System.out.println("Informe o nível de combustivel (em litros):");
			nivel= scanner.nextInt();
			 if(nivel < 10){
				System.out.println("Combustível baixo");
				
			} else {
				System.out.println("Combustível suficiente");
				
			} 
		} while (nivel < 10);
		System.out.println("-------------------");
		
		// 7 - Contar Kilômetros Percorridos:
		int distancia;
		int totalKm = 0;
		do {
		System.out.println("Digite a distância percorrida:");
		distancia = scanner.nextInt();
		if (distancia > 0) {
		totalKm += distancia;
		}
		} while (distancia > 0);
		System.out.println("Total de quilômetros percorridos: " + totalKm);

		System.out.println("-------------------");

        

	
		

	}

}
