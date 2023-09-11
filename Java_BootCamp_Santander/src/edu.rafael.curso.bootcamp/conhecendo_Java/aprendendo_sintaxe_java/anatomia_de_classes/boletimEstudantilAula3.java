package edu.rafael.curso.bootcamp.conhecendo_Java.aprendendo_sintaxe_java.anatomia_de_classes;
public class boletimEstudantilAula3 {
    public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}