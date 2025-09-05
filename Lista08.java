package primeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
 // 1 - Classificação de Dia da Semana

    System.out.println("Escolha o número do dia (1 a 7)");
    int semana = scanner.nextInt();
   switch (semana) {
case 1: // domingo
System.out.println("Fim de semana");
break;
case 2: // segunda
System.out.println("Dia útil");
break;
case 3: // terça
System.out.println("Dia útil");
break;
case 4: // quarta
System.out.println("Dia útil");
break;
case 5: // quinta
System.out.println("Dia útil");
break;
case 6: // sexta
System.out.println("Dia útil");
break;
case 7: // sabado
System.out.println("Fim de semana");
break;
default:
System.out.println("Dia inválido");
}
    

   // 2 - Menu de Bebidas
   System.out.println("Insira o código da bebida: ");
	System.out.println("1 - Café");
	System.out.println("2 - Chá");
	System.out.println("3 - Suco");
	System.out.println("4 - Refrigerante");
   int bebida = scanner.nextInt();
  switch (bebida) {
case 1: 
System.out.println("Café: R$5,00");
break;
case 2: 
System.out.println("Chá: R$3,50");
break;
case 3: 
System.out.println("Suco: R$4,00");
break;
case 4: 
System.out.println("Refrigerante: R$4,50");
break;
default:
System.out.println("Código inválido");
	}
  
  // 3 - Tipo de Veículo
  System.out.println("Insira o código dos veículos para saber o peso: ");
	System.out.println("1 - Carro");
	System.out.println("2 - Moto");
	System.out.println("3 - Caminhão");
	int veiculo = scanner.nextInt();
   switch (veiculo) {
case 1: 
System.out.println("Categoria: Leve");
break;
case 2: 
System.out.println("Categoria: Motocicleta");
break;
case 3: 
System.out.println("Categoria: Pesado");
break;
default:
System.out.println("Veículo inválido");
	}
 
// 4 - Escolha de Plano de Assinatura
   System.out.println("Insira o código do plano: ");
	System.out.println("1 - Básico");
	System.out.println("2 - Intermediário");
	System.out.println("3 - Premium");
	int plano = scanner.nextInt();
  switch (plano) {
case 1: 
System.out.println("Acesso limitado");
break;
case 2: 
System.out.println("Acesso padrão + suporte");
break;
case 3: 
System.out.println("Acesso total + suporte prioritário");
break;
default:
System.out.println("Plano inválido");
	}
  
  // 5 - Seleção de Mês
  System.out.println("Insira o número do mes (1-Janeiro...): ");
	int estacao = scanner.nextInt();
switch (estacao) {
case 1: 
case 2: 
System.out.println("Verão");
break;
case 3: 
case 4: 
case 5: 
System.out.println("Outono");
break;
case 6: 
case 7: 
case 8: 
System.out.println("Inverno");
break;
case 9: 
case 10: 
case 11: 
System.out.println("Primavera");
break;
case 12: 
System.out.println("Verão");
break;
default:
System.out.println("Mês inválido");
	}

// 6 - Tipo de Ingresso
System.out.println("Insira o código do ingresso: ");
System.out.println("1 - Inteira");
System.out.println("2 - Meia-entrada");
System.out.println("3 - VIP");
int ingresso = scanner.nextInt();
switch (ingresso) {
case 1: 
System.out.println("Inteira: R$50,00");
break;
case 2: 
System.out.println("Meia-entrada: R$25,00");
break;
case 3: 
System.out.println("VIP: R$100,00");
break;
default:
System.out.println("Ingresso inválido");
}

// 7 - Escolha de Idioma
System.out.println("Insira o código do ingresso: ");
System.out.println("1 - Português");
System.out.println("2 - Inglês");
System.out.println("3 - Espanhol");
int idioma = scanner.nextInt();
switch (idioma) {
case 1: 
System.out.println("Olá!");
break;
case 2: 
System.out.println("Hello!");
break;
case 3: 
System.out.println("Hola!");
break;
default:
System.out.println("Idioma inválido");
}

// 8 - Nível de Acesso
System.out.println("Insira o código do plano: ");
System.out.println("1 - Usuário");
System.out.println("2 - Moderador");
System.out.println("3 - Administrador");
int nivel = scanner.nextInt();
switch (nivel) {
case 1: 
System.out.println("Acesso básico");
break;
case 2: 
System.out.println("Acesso básico + edição");
break;
case 3: 
System.out.println("Acesso total");
break;
default:
System.out.println("Nível inválido");
}

// 9 - Tipo de Pagamento
System.out.println("Insira o código do plano: ");
System.out.println("1 - Dinheiro");
System.out.println("2 - Cartão de Crédito");
System.out.println("3 - Pix");
int pagamento = scanner.nextInt();
switch (pagamento) {
case 1: 
System.out.println("Pagamento em dinheiro confirmado");
break;
case 2: 
System.out.println("Pagamento com cartão processado");
break;
case 3: 
System.out.println("Pagamento via Pix realizado");
break;
default:
System.out.println("Método inválido");
}
}
}