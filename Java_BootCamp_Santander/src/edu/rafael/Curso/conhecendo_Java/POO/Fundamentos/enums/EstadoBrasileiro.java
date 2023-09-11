package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.enums;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 12),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 15),
	PIAUI ("PI", "Piauí", 16),
	MARANHAO ("MA","Maranhão", 18),
    BAHIA ("BH", "Bahia", 23);
	
	private String nome;
	private String sigla;
    private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
        this.ibge = ibge;
	}

    public int getIbge(){
        return ibge;
    } 

	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
