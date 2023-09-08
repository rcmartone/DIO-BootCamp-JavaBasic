package edu.rafael.Curso.conhecendo_Java.estruturas_condicionais;

// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T"; // B ou M ou T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
            /*A falta de break; permite que o switch continue executando os proximos
            *cases, exemplo acima, caso selecione o T, ele executa os cases M e B
            */
		}
	}
}