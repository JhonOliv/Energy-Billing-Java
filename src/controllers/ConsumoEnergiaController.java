package controllers;

import models.Cliente;
import models.ConsumoEnergia;

public class ConsumoEnergiaController {
	
	private Cliente listConsumoClient = new Cliente();
	
	public void cadastrarConsumoEnergia(int consumoMensal, String mesRegistro, String anoRegistro) {	
		
		try {
			
			ConsumoEnergia conEnergia = new ConsumoEnergia();
			
			conEnergia.setConsumoMensal(consumoMensal);
			conEnergia.setMesRegistro(mesRegistro);
			conEnergia.setAnoRegistro(anoRegistro);
			
			listConsumoClient.setConsumoEnergia(conEnergia);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
