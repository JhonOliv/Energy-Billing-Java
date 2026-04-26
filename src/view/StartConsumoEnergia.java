package view;

import java.util.Scanner;

import Exception.ExceptionExistElement;
import controllers.ClienteController;
import controllers.ConsumoEnergiaController;
import models.Cliente;
import models.ConsumoEnergia;
import models.ListaClientes;

public class StartConsumoEnergia {
	
	public static void main(String[] args) throws ExceptionExistElement {
		
		Scanner scan = new Scanner(System.in);
		
		ClienteController controllerCliente = new ClienteController();
		ConsumoEnergiaController conEnergiaController = new ConsumoEnergiaController();
		
		
		menuPrincipal();
		System.out.println("Escolha a sua opção: ");
		int opcao = scan.nextInt();
		
		while(opcao != 7) {
			if(opcao == 1) {
				
				System.out.println("Digite o Nome do Cliente: ");
				String nome = scan.next();
				
				System.out.println("Digite o CPF: ");
				String  cpf = scan.next();
				
				System.out.println("Digite a faixa salarial do cliente: ");
				double faixaSalarial = scan.nextInt();
				
				controllerCliente.cadastrasNovoCliente(nome, cpf, faixaSalarial);
				
				menuPrincipal();
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
			}else if(opcao == 2) {
				
				System.out.println("Digite o Nome do Cliente: ");
				String nome = scan.next();
				
				System.out.println("Digite o CPF: ");
				String  cpf = scan.next();
				
				System.out.println("Digite a faixa salarial do cliente: ");
				double faixaSalarial = scan.nextInt();
				
				controllerCliente.atualizarDadosCliente(nome, cpf, faixaSalarial);
				menuPrincipal();
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
			}else if(opcao == 3) {
				
				controllerCliente.getAllClients();
				menuPrincipal();
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
			}else if(opcao == 4) {
				
				System.out.println("Digite o Cpf que deseja excluir o cliente: ");
				String cpf = scan.next();
				
				controllerCliente.excluirDadosClientes(cpf);
				menuPrincipal();
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
				
			}else if (opcao == 5) {
				
				ConsumoEnergia conEnergia = new ConsumoEnergia();
				System.out.println("Digite cpf do cliente para adicionar seu consumo: ");
				String cpf = scan.next();
								
				for(Cliente cliente : controllerCliente.getAllClientes()) {
					
					if(cliente.getCpf().equals(cpf)) {
						
						System.out.println("Digite o Consumo Mensal: ");
						int consumo = scan.nextInt();
						
						System.out.println("Digite Mês de Registro: ");
						String mes = scan.next();
						
						System.out.println("Digite Ano de Registro: ");
						String ano = scan.next();
						
						conEnergia.setCliente(cliente);
						conEnergia.setConsumoMensal(consumo);
						conEnergia.setMesRegistro(mes);
						conEnergia.setAnoRegistro(ano);
						
						conEnergiaController.cadastrarConsumoEnergia(consumo, mes, ano);
						cliente.setConsumoEnergia(conEnergia);
					}
				}
				
				
				menuPrincipal();
				
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
			}else if(opcao == 6) {
				
				System.out.println("Digite o Cpf que deseja excluir o cliente: ");
				String cpf = scan.next();
				System.out.println("Digite o mês que deseja realizar o calculo: ");
				String mes = scan.next();
				
				double vlTotal = controllerCliente.calcConsumoMes(cpf, mes);
				System.out.println("Valor a ser pago no mês é : R$  " + 
				vlTotal);			
				menuPrincipal();
				System.out.println("Escolha a sua opção: ");
				opcao = scan.nextInt();
			}
		}
			
		scan.close();

		
	}
	
	public static void menuPrincipal() {
		System.out.println("-------------Menu Principal--------------\n"
				+ "1 - Cadastrar Novo Cliente------------------------\n"
				+ "2 - Atualizar Cliente-----------------------------\n"
				+ "3 - Visualizar Todos os Clientes------------------\n"
				+ "4 - Excluir o Cliente-----------------------------\n"
				+ "5 - Registar Consumo do Mês do Cliente------------\n"
				+ "6 - Calcular Consumo do Mês-----------------------\n"
				+ "7 - Encerrar Sistema--------------------------------");
	}

}
