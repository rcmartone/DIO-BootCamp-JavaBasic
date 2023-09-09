package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

public class ExemploFor {
    /* Estrutura do controle de fluxo for
    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        comando que será executado até que a expressão de validação torne-se falsa 
    } 
    */
    public static void main(String[] args) {

    //o que importa é somente o bloco condicional
    int carneirinhos = 1;
    for( ; carneirinhos <=20; ) {
     System.out.println(carneirinhos + " - Carneirinho(s)");
     carneirinhos ++;//adição fora do escopo dos parametros do FOR
    }

/*for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }
*/
	}
}
