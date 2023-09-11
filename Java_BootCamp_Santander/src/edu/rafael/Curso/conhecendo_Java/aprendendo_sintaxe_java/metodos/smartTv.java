package edu.rafael.Curso.conhecendo_Java.aprendendo_sintaxe_java.metodos;


public class smartTv {
    boolean ligada = false;
    int canal = 198;
    int volume = 99;

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

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
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
