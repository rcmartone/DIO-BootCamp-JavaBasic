package edu.rafael.tema.Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void canalUp(){
        if (canal < 200)
            canal = canal + 1;
        else canal = 1;
    }

    public void canalDown(){
        if (canal > 1)
            canal = canal - 1;
        else canal = 200;
    }

    public void aumentarVolume(){
        if (volume < 100)
            volume = volume + 1;
    }

    public void abaixarVolume(){
        if (volume > 0)    
            volume = volume - 1;
    }



}
