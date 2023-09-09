package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

public class ExemploFor {
    /* Estrutura do controle de fluxo for
    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        comando que será executado até que a expressão de validação torne-se falsa 
    } 
    */
    public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
	}
}
