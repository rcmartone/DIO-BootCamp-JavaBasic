package edu.rafael.Curso.conhecendo_Java.POO.Pilares;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
