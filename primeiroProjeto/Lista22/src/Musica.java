
public class Musica {
 String titulo;
 String artista;
 int duracao; 
 
 void tocar() {
 	System.out.println("Tocando " + titulo + " de " + artista);
 	
 	}
 
 void pausar() {
	 	System.out.println("Música pausada");
	 	System.out.println("\n\n");
	 	}
 
 void mostrarDetalhes() {
	 	System.out.println("Informações sobre a música: " + "\n" + "Título: " + titulo + "\n" + "Artista: " + artista + "\n" + "Duração: " + duracao + "min");
	 	
	 	}
 
}
