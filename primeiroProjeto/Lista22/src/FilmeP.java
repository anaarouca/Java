import java.util.Scanner;

public class FilmeP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Filme fil = new Filme();
		
		
		
		fil.titulo = "A Proposta";
	    fil.genero = "Romance";
	    fil.duracao = 1;
	    
	    fil.assistir();
	    fil.mostrarInformacoes();
	    
	    System.out.println("\n\n");

	    
	    fil.titulo = "Se Eu Fosse Você";
	    fil.genero = "Romance";
	    fil.duracao = 1;
	    
	    
	    fil.mostrarInformacoes();
	    
	    System.out.println("\n\n");

	}

}
