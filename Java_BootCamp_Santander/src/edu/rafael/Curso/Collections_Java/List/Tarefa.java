package edu.rafael.Curso.Collections_Java.List;

import java.lang.reflect.Constructor;

public class Tarefa {
    //Atributo descrição
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "Tarefa{" + 
        "descricao='" + descricao + '\'' + 
        '}';
    }
    
}
