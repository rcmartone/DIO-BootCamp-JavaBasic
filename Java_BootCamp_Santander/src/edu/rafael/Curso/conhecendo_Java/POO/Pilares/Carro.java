package edu.rafael.Curso.conhecendo_Java.POO.Pilares;

public class Carro extends Veiculo{

    

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");

    }
    
    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }
}
