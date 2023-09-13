package edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Estabelecimento;

import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Copiadora.Copiadora;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Impressora.Deskjet;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Impressora.Impressora;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Impressora.Lazerjet;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        System.out.println("Testando objetos para cada classe");
        Impressora impressora = new Deskjet();
        impressora.imprimir();
        Impressora impressora2 = new Lazerjet();
        impressora2.imprimir();

        System.out.println("\nCriando um objeto com base total na multifuncional");
        EquipamentoMultiFuncional multifuncional = new EquipamentoMultiFuncional();
        multifuncional.imprimir();
        multifuncional.copiar();
        multifuncional.digitalizar();
        

        System.out.println("\nTestando multifuncional categoricamente");
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora3 = em;
        Copiadora copiadora3 = em;
        Digitalizadora digitalizadora3 = em;

        impressora3.imprimir();
        copiadora3.copiar();
        digitalizadora3.digitalizar();
    }
}
