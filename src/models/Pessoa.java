package models;

public class Pessoa {
	
	private String  nome;
	private String cpf;
	private double faixaSalarial;
	
	public Pessoa( String nome, String cpf, double faixaSalarial){
		setNome(nome);
		setCpf(cpf);
		setFaixaSalarial(faixaSalarial);
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getFaixaSalarial() {
		return faixaSalarial;
	}
	public void setFaixaSalarial(double faixaSalarial) {
		this.faixaSalarial = faixaSalarial;
	}
	
	

}
