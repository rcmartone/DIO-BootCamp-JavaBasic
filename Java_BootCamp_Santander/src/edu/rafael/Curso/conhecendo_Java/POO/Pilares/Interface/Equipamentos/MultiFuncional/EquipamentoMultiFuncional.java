package edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.MultiFuncional;

import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Copiadora.Copiadora;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import edu.rafael.Curso.conhecendo_Java.POO.Pilares.Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora{

    @Override
    public void digitalizar() {
       System.out.println("Digitalizando via equipamento Multifuncional!!!");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional!!!");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional!!!");
    }
    
}
