package conta_bancaria;

import java.util.Scanner;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;


public class Menu {
	
      public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);

				int opcao;
				
				// Criar (instanciar) um objeto da Classe Conta
				Conta c1 = new Conta(1, 123, 1, "Aylla", 500000);
				c1.visualizar();
				
				// Sacar
				c1.sacar(100);
				c1.visualizar();
				
				// Depositar
				c1.depositar(1000);
				c1.visualizar();
				
				// Alterar a propriedade titular
				c1.setTitular("Aylla Scaglia");
				c1.visualizar();
				
				// Instanciando um Objeto da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(2, 456, 1, "Renata Negrini", 600000, 60000);				
				cc1.visualizar();
				
				cc1.sacar(659000);
				cc1.visualizar();
				
				cc1.depositar(50000);
				cc1.visualizar();
				
				// Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Lívia Cunha", 1000000, 14);
				cp1.visualizar();
		        cp1.sacar(1000);
				cp1.visualizar();
				cp1.depositar(5000);
				cp1.visualizar();
				
				while (true) {

					System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE +"⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛"); 
					System.out.println("                                                     ");
					System.out.println("               BANCO DO BRAZIL COM Z                 ");
					System.out.println("                                                     ");
					System.out.println("⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛");
					System.out.println("                                                     ");
					System.out.println("            1 - Criar Conta                          ");
					System.out.println("            2 - Listar todas as Contas               ");
					System.out.println("            3 - Buscar Conta por Número              ");
					System.out.println("            4 - Atualizar Dados da Conta             ");
					System.out.println("            5 - Apagar Conta                         ");
					System.out.println("            6 - Sacar                                ");
					System.out.println("            7 - Depositar                            ");
					System.out.println("            8 - Transferir valores entre Contas      ");
					System.out.println("            9 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("-----------------------------------------------------");
					System.out.println("                                                     ");
					System.out.println("              Insira a opção desejada:               ");
					System.out.println("                                                     ");

					opcao = leia.nextInt();

					if (opcao == 9) {
						System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
						sobre();
		                 leia.close();
						System.exit(0);
					}

					switch (opcao) {
						case 1:
							System.out.println("Criar Conta\n\n");

							break;
						case 2:
							System.out.println("Listar todas as Contas\n\n");

							break;
						case 3:
							System.out.println("Consultar dados da Conta - por número\n\n");

							break;
						case 4:
							System.out.println("Atualizar dados da Conta\n\n");

							break;
						case 5:
							System.out.println("Apagar a Conta\n\n");

							break;
						case 6:
							System.out.println("Saque\n\n");

							break;
						case 7:
							System.out.println("Depósito\n\n");

							break;
						case 8:
							System.out.println("Transferência entre Contas\n\n");

							break;
						default:
							System.out.println("\nOpção Inválida!\n");
							break;
					}
				}
			}
		    
			public static void sobre() {
				System.out.println("\n***********************************************************");
				System.out.println("Projeto Desenvolvido por: Lívia D'Alexandri                ");
				System.out.println("Lívia D'Alexandri - liviadlxcunha@gmail.com                ");
				System.out.println("github.com/liviadalexandri                                 ");
				System.out.println("***********************************************************");
				}

		}
