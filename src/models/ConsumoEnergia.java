package models;

import java.util.Objects;

public class ConsumoEnergia {
	
	private Cliente cliente;
	private int consumoMensal;
	private String mesRegistro;
	private String anoRegistro;
	
	public String getAnoRegistro() {
		return anoRegistro;
	}
	public void setAnoRegistro(String anoRegistro) {
		this.anoRegistro = anoRegistro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getConsumoMensal() {
		return consumoMensal;
	}
	public void setConsumoMensal(int consumoMensal) {
		this.consumoMensal = consumoMensal;
	}
	public String getMesRegistro() {
		return mesRegistro;
	}
	public void setMesRegistro(String mesRegistro) {
		this.mesRegistro = mesRegistro;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cliente, consumoMensal, mesRegistro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsumoEnergia other = (ConsumoEnergia) obj;
		return Objects.equals(cliente, other.cliente) && consumoMensal == other.consumoMensal
				&& Objects.equals(mesRegistro, other.mesRegistro);
	}
	@Override
	public String toString() {
		return "ConsumoEnergia [consumoMensal=" + consumoMensal + ", mesRegistro=" + mesRegistro + ", anoRegistro="
				+ anoRegistro + "]";
	}
	
	
	
	
	
	
	

}
