package edu.rafael.Curso.Collections_Java.List;

import java.lang.reflect.Constructor;

public class Tarefa {
    //Atributo descrição
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Metodo Getter
    public String getDescricao() {
        return descricao;
    }

    //Metodo toString
    public String toString(){
        return descricao;
    
    }
    

}
