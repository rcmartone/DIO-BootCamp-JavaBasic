package edu.rafael.Curso.conhecendo_Java.POO.Desafio_Iphone.Celular.Servico_de_Navegacao;

public class Aplicativo_Navegador implements Navegador_na_Internet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina!!");
    }
    
}
