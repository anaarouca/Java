import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gato gato = new Gato();
		
		gato.nome = "Milque";
	    gato.idade = 1;
	    gato.raca = "Maine Coon";
	    
	    gato.miar();
	    gato.comer();
	    gato.mostrarInformacoes();
	    
	    System.out.println("\n\n");
	
	    System.out.println("Qual a raça?");
		gato.raca = scanner.nextLine();
		System.out.println("Qual o nome do pet?");
		gato.nome = scanner.next();
		System.out.println("Qual a idade?");
		gato.idade = scanner.nextInt();
		
		
		gato.mostrarInformacoes();
	   
				

	}

}
