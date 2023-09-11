package edu.rafael.curso.bootcamp.conhecendo_Java.aprendendo_sintaxe_java.anatomia_de_classes;
public class minhaClasse {
    public static void main(String[] args) {
       String primeiroNome = "Rafael";
       String segundoNome = "Martone" ;
       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
       return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);//Concatena
       //duas strings
    }


    
}
