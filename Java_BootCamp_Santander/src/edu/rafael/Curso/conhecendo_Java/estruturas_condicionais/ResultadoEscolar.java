package edu.rafael.Curso.conhecendo_Java.estruturas_condicionais;

public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = (( nota >=7 ) ? "Aprovado!" : "Reprovado!");
		System.out.println(resultado);
	} 
}