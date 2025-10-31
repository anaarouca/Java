import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      ContaBancaria conta = new ContaBancaria();

	      System.out.println("-----------------------");
	      System.out.println("Cadastro de Conta Bancária");
	      System.out.println("-----------------------");
	      System.out.print("Nome do titular: ");
	      String nome = sc.next();
	      conta.setTitular(nome);

	      System.out.println("-----------------------");
	      System.out.print("Valor para depósito inicial: ");
	      double deposito = sc.nextDouble();
	      conta.depositar(deposito);

	      System.out.println("-----------------------");
	      System.out.print("Valor para saque: ");
	      double saque = sc.nextDouble();
	      conta.sacar(saque);

	      System.out.println("-----------------------");
	      System.out.println("Titular: " + conta.getTitular());
	      System.out.println("Saldo atual: R$" + conta.getSaldo());

	      sc.close();
	   }
	}