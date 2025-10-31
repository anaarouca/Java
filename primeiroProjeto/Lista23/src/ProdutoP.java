import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Cadastro de produtos");
		System.out.println("-----------------------");
		System.out.println("Nome do produto: ");
		String prod = sc.next();
		System.out.println("Preço do produto: ");
		double preco = sc.nextDouble();
		System.out.println("-----------------------");
		System.out.println("Quantidade no estoque: ");
		int estoque = sc.nextInt();
		
		produto.setNome(prod);
		produto.setPreco(preco);
		produto.setEstoque(estoque);
		
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getEstoque());
	}

}
