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
            
            //Controle de fluxo para mostrar qual aluno esta em cada índice
            for (int x=0; x<alunos.length; x++) {
                System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
            }
        
        }
	}

