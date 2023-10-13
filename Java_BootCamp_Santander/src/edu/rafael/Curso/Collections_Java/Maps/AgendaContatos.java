package edu.rafael.Curso.Collections_Java.Maps;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Atributo
    private Map<String, Integer> agendaContatoMap;

    //Implementação mais comum
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    //adicionar contato
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //Remover um contato por nome(key) > Valor unico, sem necessidade de um Looping
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    //Exibir contatos
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rafael", 123456);
        agendaContatos.adicionarContato("Rafael", 159753);
        agendaContatos.adicionarContato("Rafael Martone", 123456);
        agendaContatos.adicionarContato("Rafael Camacho", 123987);
        agendaContatos.adicionarContato("Rafael Java", 456159);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rafael Java");
        agendaContatos.exibirContatos();

        System.out.println("O numero do Rafael Martone é: " + agendaContatos.pesquisarPorNome("Rafael Martone"));
    }
}

