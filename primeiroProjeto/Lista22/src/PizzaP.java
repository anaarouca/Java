import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza pz = new Pizza();
		
		
		pz.sabor = "Portuguesa";
	    pz.tamanho = "Pequena";
	    pz.bordaRecheada = true;
	    
	    pz.preparar();
	    pz.assando();
	    pz.mostrarInformacoes();
	    
	    System.out.println("\n\n");
	    
	    System.out.println("Qual o sabor?");
		pz.sabor = scanner.nextLine();
		System.out.println("Qual o tamanho?");
		pz.tamanho = scanner.next();
		System.out.println("É com borda recheada? (true ou false)");
		pz.bordaRecheada = scanner.nextBoolean();
		System.out.println("\n");
		
		pz.mostrarInformacoes();

	}

}
