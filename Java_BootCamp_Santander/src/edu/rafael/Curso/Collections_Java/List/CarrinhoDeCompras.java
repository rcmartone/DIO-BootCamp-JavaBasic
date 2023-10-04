package edu.rafael.Curso.Collections_Java.List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo Item List
    private List<Item> itemList;

    //ArrayList vazio do atributo ItensList
    public CarrinhoDeCompras () {
        this.itemList = new ArrayList<>();
    }

    //Metodo que adiciona um novo item a lista com nome, preço e quantidade especificada
    public void adicionarItem(String name, double price, int quantityEspec){
        itemList.add(new Item(name, price, quantityEspec));
    }

    //Metodo para remover um item com base no nome
    public void removerItem (String name){
            itemList.removeIf(item -> item.getName().equals(name));
    }

    //Metodo para calcular o valor total do carrinho de compras

    public void calcularValorTotal(){
        double valTotal = 0;
        double valItem;
        for(Item I : itemList){
           valItem =  I.getPrice() * I.getQuantityEspec();
           valTotal = valTotal + valItem;
            }
            System.out.println("Valor total no carrinho= R$ " + Double.toString(valTotal));
        }


    //Exibe os itens no carrinho com nome, preço e quantidade de cada
    public void exibirItens(){
        if (itemList.size() > 0){
            System.out.println("O Carrinho agora possui o(s) seguinte(s) item(ns)");
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
        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 3);
        carrinhoDeCompras.adicionarItem("Feijao", 40.0, 6);
        carrinhoDeCompras.adicionarItem("Carne", 60.0, 9);
        carrinhoDeCompras.adicionarItem("Arroz", 13.0, 1);
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho pelo nome, repitido ou não
        carrinhoDeCompras.removerItem("Feijao");
        System.out.println("Removendo item do carrinho");
        carrinhoDeCompras.exibirItens();

        //Calculando o valor total no carrinho
        System.out.println("Calculando o valor total no carrinho.");
        carrinhoDeCompras.calcularValorTotal();

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