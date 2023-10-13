package edu.rafael.Curso.Collections_Java.Set;

public class Convidado {

    private String name;
    private int inviteCode;


    //Getters dos dois dados
    public String getName() {
        return name;
    }


    public int getInviteCode() {
        return inviteCode;
    }

//o Construtor
    public Convidado(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        return "Convidado [name=" + 
        name + ", inviteCode=" + 
        inviteCode + "]";
    }

    //Metodo de comparação e geração de convidado unico por codigo 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + inviteCode;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (inviteCode != other.inviteCode)
            return false;
        return true;
    }
    
}
