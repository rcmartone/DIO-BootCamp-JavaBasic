package edu.rafael.tema.AnatomiaDeClasses;
public class MinhaClasse {
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