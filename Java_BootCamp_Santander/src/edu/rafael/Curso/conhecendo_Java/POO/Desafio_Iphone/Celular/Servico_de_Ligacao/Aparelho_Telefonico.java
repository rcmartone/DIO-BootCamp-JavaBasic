package edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Ligacao;

public class Aparelho_Telefonico implements Aplicativo_Telefone {

    @Override
    public void ligar() {
        System.out.println("Ligando!!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!!");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!!");
    }

    
}
