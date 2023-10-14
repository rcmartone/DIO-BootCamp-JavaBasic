package edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Musica;

public class Reprodutor_Musical implements Aplicativo_Musical  {
    
    public void tocar(){
        System.out.println("Tocando música!!");
    }

    public void pausar(){
        System.out.println("Música pausada!!");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando outra musica!!");
    }
}
