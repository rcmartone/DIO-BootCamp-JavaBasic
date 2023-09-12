package edu.rafael.Curso.conhecendo_Java.POO.Pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1564876854");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("1561333");
        //z400.ligar();

        Veiculo coringa = z400;
        coringa.ligar();
    }
    
}
