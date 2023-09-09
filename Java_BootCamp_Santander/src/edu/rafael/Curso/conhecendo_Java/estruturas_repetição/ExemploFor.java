package edu.rafael.Curso.conhecendo_Java.estruturas_repetição;

public class ExemploFor {
    /* Estrutura do controle de fluxo for
    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
        comando que será executado até que a expressão de validação torne-se falsa 
    } 
    */
    public static void main(String[] args) {
            //Array com os alunos por indice, 0 a 3
            String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
            //Forma abreviada
	        for(String aluno : alunos) {
            /* O uso do : define que, a cada iteração a partir do indice 0 até o ultimo
            indice declarado no caso 3, a execução ocorrerá imprimindo no atual índice e o 
            incremento no contador que nesse caso é invisivel, será feito de forma automática 
            */    
	        System.out.println("Nome do aluno é " + aluno);
	        }
        }
	}

