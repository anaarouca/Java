import java.util.Scanner;

public class RetanguloP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      Retangulo ret = new Retangulo();

	   System.out.println("-----------------------");
	   System.out.println("Cálculo de Retângulo");
	   System.out.println("-----------------------");

	   System.out.print("Digite a largura: ");
	   double largura = sc.nextDouble();
	   ret.setLargura(largura);

	   System.out.print("Digite a altura: ");
	   double altura = sc.nextDouble();
	   ret.setAltura(altura);

	   System.out.println("-----------------------");
	   System.out.println("Largura: " + ret.getLargura());
	   System.out.println("Altura: " + ret.getAltura());
	   System.out.println("Área: " + ret.calcularArea());
	   System.out.println("Perímetro: " + ret.calcularPerimetro());

	      sc.close();
	   }
	}