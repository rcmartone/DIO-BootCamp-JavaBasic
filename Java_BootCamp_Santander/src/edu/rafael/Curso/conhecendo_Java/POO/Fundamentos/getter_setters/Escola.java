package edu.rafael.Curso.conhecendo_Java.POO.Fundamentos.getter_setters;

public class Escola {
	public static void main(String[] args) {
		aluno felipe = new aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	}
}
