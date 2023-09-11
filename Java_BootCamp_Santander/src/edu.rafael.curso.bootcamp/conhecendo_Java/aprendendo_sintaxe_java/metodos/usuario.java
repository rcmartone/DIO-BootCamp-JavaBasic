package edu.rafael.curso.bootcamp.conhecendo_Java.aprendendo_sintaxe_java.metodos;

public class usuario {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();

        System.out.println("SmartTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo estado -> SmartTV Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);
        smartTv.canalUp();
        smartTv.canalUp();
        System.out.println("Novo estado -> Canal atual: " + smartTv.canal);
        smartTv.canalUp();
        smartTv.canalUp();
        System.out.println("Novo estado -> Canal atual: " + smartTv.canal);
        smartTv.canalDown();
        smartTv.canalDown();
        smartTv.canalDown();
        System.out.println("Novo estado -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(50);
        System.out.println("Novo estado -> Canal atual: " + smartTv.canal);
    }
    
}
