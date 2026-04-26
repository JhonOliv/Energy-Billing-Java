package models;

import java.util.ArrayList;
import java.util.List;

import Exception.ExceptionCollectionIsEmpty;
import Exception.ExceptionExistElement;

public class Cliente extends Pessoa {
	
	private List<ConsumoEnergia> consumo = new ArrayList<>();

	public Cliente(String nome, String cpf, double faixaSalarial) {
		super(nome, cpf, faixaSalarial);
	}
	
	public Cliente() {
		
	}
	
	public List<ConsumoEnergia> getAllConsumo(){
		
		return this.consumo;
	}
	
	public ConsumoEnergia getConsumo(String cpf, String mesConsumo) throws ExceptionCollectionIsEmpty {
		
		if(this.consumo.isEmpty()) {
			throw new ExceptionCollectionIsEmpty("A lista de consumo deste usuário está vazia!");
		}
		
		for (ConsumoEnergia cons : this.consumo) {
				
				if(cons.getCliente().getCpf().equals(cpf) && cons.getMesRegistro().equals(mesConsumo)) {
					return cons;
				}
			
		}
	
		return null;
			
	}
	
	public void setConsumoEnergia(ConsumoEnergia consumo) throws ExceptionExistElement {
		
		for (ConsumoEnergia cons : this.consumo) {
			
			if(cons.getMesRegistro().equals(consumo.getMesRegistro()) && cons.getAnoRegistro().equals(consumo.getAnoRegistro())) {
				throw new ExceptionExistElement("Registro já existe dentro da lista deste cliente!");
			}
		
		}
		
			this.consumo.add(consumo);
	}

	@Override
	public String toString() {
		return "Cliente [consumo = " + consumo + ", Nome = " + getNome() + ", CPF = " + getCpf()
				+ ", Faixa Salarial = " + getFaixaSalarial() + "]\n";
	}	

}
