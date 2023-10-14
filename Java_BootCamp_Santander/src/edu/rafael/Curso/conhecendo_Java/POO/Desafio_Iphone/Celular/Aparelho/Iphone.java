package edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Aparelho;

import edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Ligacao.Aplicativo_Telefone;
import edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Musica.Aplicativo_Musical;
import edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Navegacao.Navegador_na_Internet;

public class Iphone implements Aplicativo_Musical, Aplicativo_Telefone, Navegador_na_Internet {

    @Override
    public void exibirPagina() {
        try {
             System.out.println("Exibindo pagina no navegador!!"); 
        } catch (Exception e) {
            System.out.println("Pagina não existe!!");
        }
    }

    @Override
    public void adicionarNovaAba() {
        try {
            System.out.println("Adicionando nova aba no navegador!!");  
        } catch (Exception e) {
            System.out.println("Falta de espaço para criação de nova aba!!");
        }
    }

    @Override
    public void atualizarPagina() {
        try {
            System.out.println("Atualizando Pagina no navegador!!");
        } catch (Exception e) {
            System.out.println("Erro de conexão e/ou problemas no servidor dedicado!!");
        }
    }

    @Override
    public void ligar() {
        try {
            System.out.println("Ligando pelo aplicativo telefonico!!"); 
        } catch (Exception e) {
            System.out.println("Número incorreto ou fora de área!!");
        }
    }

    @Override
    public void atender() {
        try {
            System.out.println("Atendendo pelo aplicativo telefonico!!");  
        } catch (Exception e) {
            System.out.println("Ligação perdida!!");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        try {
            System.out.println("Iniciando correio de voz no aplicativo telefonico!!");
        } catch (Exception e) {
            System.out.println("Correio de voz vazio!!");
        }
    }

    @Override
    public void tocar(){
        try {
            System.out.println("Tocando música no aplicativo musical!!");
        } catch (Exception e) {
            System.out.println("Música não selecionada!!");
        }
    }

    @Override
    public void pausar(){
        try {
            System.out.println("Música pausada no aplicativo musical!!");
        } catch (Exception e) {
            System.out.println("Erro de aplicação!!");
        }
    }

    @Override
    public void selecionarMusica(){
        try {
           System.out.println("Selecionando outra musica no aplicativo!!");
        } catch (Exception e) {
            System.out.println("A música selecionada não existe ou sem rede!!");
        }
    }
}
    
