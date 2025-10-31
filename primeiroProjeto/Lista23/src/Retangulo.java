
public class Retangulo {
	private double largura;
	   private double altura;

	   
	   public double getLargura() {
	      return largura;
	   }

	   public void setLargura(double largura) {
	      if (largura > 0) {
	         this.largura = largura;
	      } else {
	         System.out.println("Valor inválido! A largura deve ser maior que 0.");
	      }
	   }

	   public double getAltura() {
	      return altura;
	   }

	   public void setAltura(double altura) {
	      if (altura > 0) {
	         this.altura = altura;
	      } else {
	         System.out.println("Valor inválido! A altura deve ser maior que 0.");
	      }
	   }

	   
	   public double calcularArea() {
	      return largura * altura;
	   }

	   
	   public double calcularPerimetro() {
	      return 2 * (largura + altura);
	   }
	}