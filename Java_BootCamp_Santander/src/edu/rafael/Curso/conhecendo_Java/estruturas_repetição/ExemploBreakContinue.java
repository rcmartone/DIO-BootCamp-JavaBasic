package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;//Uso do continue, define que ele pule a iteração com numero = 3
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ? // 1 2 4 5

    }
}