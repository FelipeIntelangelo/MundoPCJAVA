package test;

import Domain.*;

public class MundoPC {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("USB", "HyperX");
        Teclado teclado2 = new Teclado("USB", "Zowie");
        
        Mouse mouse1 = new Mouse("USB", "HyperX");
        Mouse mouse2 = new Mouse("Wireless", "Zowie");
        
        Monitor monitor1 = new Monitor("Philips", 17);
        Monitor monitor2 = new Monitor("BenQ", 22);
        
        Computadora computadora1 = new Computadora("HyperX", monitor1, teclado1, mouse1);
        Computadora computadora2 = new Computadora("BenQ", monitor2, teclado2, mouse2);
        Computadora computadora3 = new Computadora("PC MIX", monitor2, teclado1, mouse2);
        Computadora computadora4 = new Computadora("PC MIX2", monitor1, teclado2, mouse1);
        Computadora computadora5 = new Computadora("PC MIX3", monitor2, teclado2, mouse1);
        
        Orden ordenSinMix = new Orden();
        ordenSinMix.agregarComputadora(computadora1);
        ordenSinMix.agregarComputadora(computadora2);
        ordenSinMix.mostrarOrden();
        
        Orden ordenMix = new Orden();
        ordenMix.agregarComputadora(computadora3);
        ordenMix.agregarComputadora(computadora4);
        ordenMix.agregarComputadora(computadora5);
        ordenMix.mostrarOrden();
        
        
    }
}
