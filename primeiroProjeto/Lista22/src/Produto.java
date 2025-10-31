
public class Produto {
	String nome;
	int preco;
	int estoque;
	
	void vender(int quantidade) {
		if(estoque >= 10) {
			double diminui = quantidade - 5;
			System.out.println("Quantidade em estoque é: "+diminui);
		} else {
			System.out.println("Estoque insuficiente!");
		}
	}
	void mostrarInformacoes() {
		System.out.print("Nome do produto: "+nome+"\n");
		System.out.print("Preço do produto: "+preco+"\n");
		System.out.print("Estoque: "+estoque+"\n");
	}
	
	
}

