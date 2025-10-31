import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Musica mus = new Musica();
		
		mus.titulo = "Melhor eu Ir";
	    mus.artista = "Péricles";
	    mus.duracao = 4;
	    
	    mus.tocar();
	    mus.pausar();
	    mus.mostrarDetalhes();
	    System.out.println("\n\n");
	    
	    mus.titulo = "Ate Que Durou";
	    mus.artista = "Péricles";
	    mus.duracao = 5;
	    
	    mus.tocar();
	    mus.pausar();
	    mus.mostrarDetalhes();
	    System.out.println("\n\n");
	    
	    System.out.println("Qual o título da música? ");
		mus.titulo = scanner.nextLine();
		System.out.println("Qual o artista? ");
		mus.artista = scanner.nextLine();
		System.out.println("Qual a duração da música? (em min.)");
		mus.duracao = scanner.nextInt();
		
		mus.mostrarDetalhes();

	}

}
