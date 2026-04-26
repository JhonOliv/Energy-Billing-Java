package controllers;

import java.util.List;

import models.Cliente;
import models.ConsumoEnergia;
import models.ListaClientes;
public class ClienteController {
	
	private ListaClientes listaCliente = new ListaClientes();
	
	
	public void cadastrasNovoCliente(String nome, String cpf, double faixaSalarial) {
		try {
				Cliente cliente = new Cliente();
			
			if(nome.isEmpty() || cpf.isEmpty()) {
				System.out.println("Nome ou Cpf estão sem informação e são obrigatório o preenchimento!");
			}
			
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setFaixaSalarial(faixaSalarial);
			
			// Salvando o cliente em uma lista
			this.listaCliente.setCliente(cliente);
			
			System.out.println("Salvo com sucesso!");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void excluirDadosClientes(String cpf) {
		
		try {
		
			for(Cliente client : this.listaCliente.getAllClients()) {
				
				if(client.getCpf().equals(cpf)) {
					
					int indexElement = this.listaCliente.getClienteByCpf(cpf);
					this.listaCliente.getAllClients().remove(indexElement);
				}
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void atualizarDadosCliente(String nome, String cpf, double faixaSalarial) {
		try {
			
			for (Cliente client : this.listaCliente.getAllClients()) {
				
				if(client.getCpf().equals(cpf)) {
					
					// Removendo cliente para ser atualizado
					int indexElement = this.listaCliente.getClienteByCpf(cpf);
					this.listaCliente.getAllClients().remove(indexElement);
					
					// Salvando cliente atualizado
					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					cliente.setCpf(cpf);
					cliente.setFaixaSalarial(faixaSalarial);
					
					listaCliente.setCliente(cliente);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void getAllClients() {
	
		System.out.print(listaCliente.getAllClients());
		
	}
	
	public List<Cliente> getAllClientes(){
		return listaCliente.getAllClients();
	}
	
public double  calcConsumoMes(String cpf, String mes) {
		
		try {
			
			ConsumoEnergia conEnergia;
			
			for (Cliente cliente : this.listaCliente.getAllClients()) {
				
				if(cliente.getCpf().equals(cpf)) {
					
					conEnergia = cliente.getConsumo(cpf, mes);
					
					double valTotal = conEnergia.getConsumoMensal() <= 100 ? 
							conEnergia.getConsumoMensal() * 0.60 : conEnergia.getConsumoMensal() * 0.75;
					
					return valTotal;	
				}
			}
						
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return 0;
	}
	

}
