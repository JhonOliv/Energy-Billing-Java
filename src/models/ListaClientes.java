package models;


import java.util.List;

import Exception.ExceptionExistElement;
import java.util.ArrayList;


public class ListaClientes {
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<Cliente> clientesExcluidos = new ArrayList<Cliente>();
	
	public Cliente getCliente(String cpf) {
		
		if(!clientes.isEmpty()){
			
			for (Cliente client : this.clientes) {
					
					if(client.getCpf().equals(cpf)) {
						return client;
					}
			}
		}
		
		return null;
		
		
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public int getClienteByCpf(String cpf) {
		
		for (Cliente cliente : this.clientes) {
			
			if(cliente.getCpf().equals(cpf)) {
				System.out.print(this.clientes.indexOf(cliente));
				return this.clientes.indexOf(cliente);
				
			}
		}
		
		return -1;
		
	}
	
	
	public void setCliente(Cliente cliente) throws ExceptionExistElement {
		
		
		for (Cliente client : this.clientes) {
			
			if(client.getCpf().equals(cliente.getCpf())) {
				throw new ExceptionExistElement("Cliente já existente !!!");
			}
		}
		
		this.clientes.add(cliente);
	}
	
	public Cliente getClienteExcluidos(String cpf) {
		
		if(!clientesExcluidos.isEmpty()){
			
			for (Cliente client : this.clientes) {
					
					if(client.getCpf().equals(cpf)) {
						return client;
					}
			}
		}
		
		return null;
		
		
	}
	
	public void setClienteExcluidos(Cliente cliente) throws ExceptionExistElement {
		
		
		for (Cliente client : this.clientesExcluidos) {
			
			if(client.getCpf().equals(cliente.getCpf())) {
				throw new ExceptionExistElement("Cliente já excluido !!!");
			}
		}
		
		this.clientesExcluidos.add(cliente);
	}
	
	
	public List<Cliente> getAllClients(){
		return this.clientes;
	}
	
}


