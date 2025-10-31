
public class Pizza {
	String sabor;
	String tamanho; 
    boolean bordaRecheada;
    
        void preparar() {
    	System.out.println("Preparando pizza de " + sabor);
    	
    	}
    
    void assando() {
    	System.out.println("Assando a pizza tamanho: " + tamanho);
    	System.out.println("\n\n");
    	}
    
    
    void mostrarInformacoes() {
    	System.out.println("Dados da pizza: " + "\n" + "Sabor: " + sabor + "\n" + "Tamanho: " + tamanho + "\n" + "Borda Recheada: " + bordaRecheada);
    	
    	}
    
    

}
