package edu.rafael.Curso.Collections_Java.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    //Atributo tarefa List
    private List<Tarefa> tarefaList;

    //ArrayList vazio do atributo tarefaList
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Criar uma Lista que vai receber as tarefas a serem excluidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            //Laço de repetição para passar as tarefas com a mesma descrição
            //para a Lista TarefaParaRemover
            if (t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //Remove todas as tarefas com a descrição igual nas duas Listas
            tarefaList.removeAll(tarefasParaRemover);
    }

    //Tamanho da lista como valor inteiro
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //Imprime a Lista
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    //Testando os métodos
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        //verificando o tamanho da lista
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterNumeroTotalTarefas());

        //Adicionando uma tarefa e verificar o tamanho da lista
        listaTarefa.adicionarTarefa("Arroz");
        listaTarefa.adicionarTarefa("Arroz");
        listaTarefa.adicionarTarefa("Feijao");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterNumeroTotalTarefas());

        //removendo tarefas com a descricao igual
        listaTarefa.removerTarefa("Feijao");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterNumeroTotalTarefas());

        //Obter a descrição das tarefas

        listaTarefa.obterDescricoesTarefas();

    } 
}
