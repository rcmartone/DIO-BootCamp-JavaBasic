package edu.rafael.Curso.conhecendo_Java.java_tratamento_de_exceções;


public class FormatadorCepExemplo {
    public static void main(String[] args) {
        

    try {
        String cepFormatado = formatarCep("1543688");
        System.out.println(cepFormatado);

    } catch (cepInvalidoException e) {
        System.out.println("Numero inválido, tente novamente!");
    }
}

    static String formatarCep(String cep) throws cepInvalidoException{
        if(cep.length() != 8)
          throw new cepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
