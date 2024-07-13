package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaComputadorasAPP {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);
        //Creamos un objeto tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo,
                        tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell",27);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",
                monitorDell,tecladoDell,ratonDell);

        //Computadora Mac
        Monitor monitorMac = new Monitor("Mac",27);
        Teclado tecladoMac = new Teclado("usb", "Mac");
        Raton ratonMac = new Raton("usb","Mac");
        Computadora computadoraMac = new Computadora("Computadora iMac",
                monitorMac,tecladoMac,ratonMac);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraMac);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();


    }
}