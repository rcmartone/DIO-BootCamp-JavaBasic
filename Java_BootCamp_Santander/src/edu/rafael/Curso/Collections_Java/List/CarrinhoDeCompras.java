package edu.rafael.Curso.Collections_Java.List;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Constructor;

public class CarrinhoDeCompras {
    //Atributo Item List
    private List<Item> itemList;

    //ArrayList vazio do atributo ItensList
    public void listaItens() {
        this.itemList = new ArrayList<>();
    }
    //Metodo que adiciona um novo item a lista com nome, preço e quantidade especificada
    public void adicionarItem(String name, double price, int quantityEspec){
        itemList.add(new Item(name, price, quantityEspec));
    }

    //Metodo para remover um item com base no nome
    public void removerItem(String name){
        itemList.remove(name);
    }

    //Metodo para calcular o valor total do carrinho de compras

    public double calcularValorTotal(){
        double valTotal = 0;
        double valItem;
        for(Item I : itemList){
           valItem =  I.getPrice() * I.getQuantityEspec();
           valTotal = valTotal + valItem;
            }
            return valTotal;
        }


    //Exibe os itens no carrinho com nome, preço e quantidade de cada
    public void exibirItens(){
        if (itemList.size() > 0){
            System.out.println("O Carrinho possui o(s) seguinte(s) item(ns)");
            for( Item I : itemList){
                System.out.println("Nome= " + I.getName() + " - " + "Preço= R$ " + I.getPrice() + " - Quantidade Especificada= " + I.getQuantityEspec());
            }
        }
        else{
        System.out.println("O Carrinho está vazio!!!");
        }
    }

    //Testando os métodos
    public static void main(String[] args) {

        //Criando o objeto carrinhoDeCompras do tipo CarrinhoDeCompras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //verificando o se o carrinho possui algum item ou está vazio
        carrinhoDeCompras.exibirItens();
    }
}
        /* 
    //Adicionando uma tarefa e verificar o tamanho da lista e a descrição de cada uma
        listaTarefa.adicionarTarefa("Arroz");
        listaTarefa.adicionarTarefa("Arroz");
        listaTarefa.adicionarTarefa("Feijao");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        //removendo tarefas com a descricao igual
        listaTarefa.removerTarefa("Arroz");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterNumeroTotalTarefas());

        //Obter a descrição das tarefas

        listaTarefa.obterDescricoesTarefas();

    } 
    

    
}
*/