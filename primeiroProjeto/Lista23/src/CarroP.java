import java.util.Scanner;

public class CarroP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      Carro carro = new Carro();

	      System.out.println("-----------------------");
	      System.out.println("Cadastro de Carro");
	      System.out.println("-----------------------");

	      System.out.print("Modelo do carro: ");
	      String modelo = sc.next();
	      carro.setModelo(modelo);

	      System.out.print("Ano do carro: ");
	      int ano = sc.nextInt();
	      carro.setAno(ano);

	      System.out.println("-----------------------");
	      System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual() + " km/h");

	      System.out.print("Aumentar velocidade em (km/h): ");
	      int acelerar = sc.nextInt();
	      carro.acelerar(acelerar);
	      System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

	      System.out.print("Reduzir velocidade em (km/h): ");
	      int frear = sc.nextInt();
	      carro.frear(frear);
	      System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

	      System.out.println("-----------------------");
	      System.out.println("Carro: " + carro.getModelo() + " (" + carro.getAno() + ")");
	      System.out.println("Velocidade final: " + carro.getVelocidadeAtual() + " km/h");

	      sc.close();
	   }
	}