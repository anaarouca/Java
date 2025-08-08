public class MyClass {
  public static void main(String args[]) {
      
// 1 - Cálculo para empresa 

double instalacao = 300.00;
double limpeza = 150.00;
double manutencao = 499.99;
double soma = instalacao + limpeza + manutencao;
System.out.println("O cliente devera pagar: " + soma);

System.out.println("\n");

   // 2 - Cálculo de salário 
   
   double salarioPorHora = 35.00;
   int horas = 8;
   double salarioPorDia = salarioPorHora * horas;
   System.out.println("Ao final do dia Joaquim receberá: " + salarioPorDia);
   
   System.out.println("\n");
   
   // 3 - Caixas de bombons
int cadaCaixa = 27;
int comprou = 16;
int quantosTem = cadaCaixa * comprou;
 System.out.println("Pamela têm: " + quantosTem + " bombons");
 
 System.out.println("\n");
 
 // 4 - Garrafas de água
int garrafas = 300;
int naCaixa = 20;
int quantasCaixas = garrafas / cadaCaixa;
System.out.println("Eles usaram: " + quantasCaixas + " caixas");

System.out.println("\n");

// 5 - Cálculo para camisetas 
double cadaCusta = 30.00;
int camisetas = 120;
int venda = 80;
int compraDeCamiseta = 50;
double faturamento = venda * cadaCusta;
int quantasTem = (camisetas - venda) + compraDeCamiseta;
System.out.println("A loja possui: " + quantasTem + " camisetas");
System.out.println("\n");
System.out.println("O faturamento da loja foi de: R$" + faturamento);

System.out.println("\n");

// 6 - Dobro e Metade
int numero = 8;
int dobro = numero * 2;
int metade = numero / 2;
System.out.println("A variável é 8");
System.out.println("O dobro do número é: " + dobro);
System.out.println("A metade do número é: " + metade);
 }
}