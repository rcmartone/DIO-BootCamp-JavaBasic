package edu.rafael.tema.Operadores;

public class Operadores {
    public static void main(String[] args) {

        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);
        
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        //A soma ocorre após a leitura do valor > Le 6 e soma +1

        System.out.println(numero);// agora sim, numero virou 7
        
        //ordem de precedencia conta aqui
        System.out.println(++ numero);
        //Aqui ele soma 1 + numero e então le o valor que é 8
        
        boolean verdadeiro = true;
        
        System.out.println("Inverteu " + !verdadeiro);
    }
}
