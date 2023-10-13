package edu.rafael.Curso.Collections_Java.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Criando o Construtor
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    //Adicionar um convidado comnome e codigo
    public void adicionarConvidado(String name, int inviteCode){
        convidadoSet.add(new Convidado(name, inviteCode));
    }

    //Remover um convidado por codigo
    public void removerConvidadoPorCodigoConvite(int inviteCode){
        Convidado convidadoParaRemover = null;
            for (Convidado c : convidadoSet){
                if (c.getInviteCode() == inviteCode){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
    }

    //Contar convidados
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //Exibr convidados
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    //Criando metodo Main para testar
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        //Adicionando convidados
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        //Teste de inserção com codigos duplicados, apenas o primeiro dos dois será salvo
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        //removendo um convidados por codigo
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        //Exibindo convidados (Exibe em ordem crescente)
        conjuntoConvidados.exibirConvidados();
    }
}
