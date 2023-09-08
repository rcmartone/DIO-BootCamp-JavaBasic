package edu.rafael.Curso.conhecendo_Java.estruturas_condicionais;

// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T"; // B ou M ou T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
            /*A falta de break; permite que o switch continue executando os proximos
            *cases, exemplo acima, caso selecione o T, ele executa os cases M e B
            */
		}
	}
}