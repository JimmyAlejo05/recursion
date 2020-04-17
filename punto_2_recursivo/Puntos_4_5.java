package usb.taller4.punto_2_recursivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import usb.taller4.punto_2_recursivo.controlador.ControladorPunto4;
import usb.taller4.punto_2_recursivo.controlador.ControladorPunto4_Contador;
import usb.taller4.punto_2_recursivo.controlador.ControladorPunto5;

/**
 *
 * @author jimmy rios
 */
public class Puntos_4_5 {

    public static void main(String[] args) throws IOException {
        punto4();
        punto5();
    }

    static void punto4() throws IOException {
        ControladorPunto4 fichero = new ControladorPunto4();
        ControladorPunto4_Contador contadores = new ControladorPunto4_Contador();
        String cadena = fichero.cargarPoema();
        System.out.println(cadena);
        contadores.contadorVocales(cadena, 0, 0);
        contadores.contadorConsonantes(cadena, 0, 0);
        contadores.contarEspacios(cadena, 0, 0);
        contadores.contarPalabras(cadena, 0);
    }

    static void punto5() {
        ControladorPunto5 torreA = new ControladorPunto5();
        torreA.push(4);
        torreA.push(3);
        torreA.push(2);
        torreA.push(1);
        ControladorPunto5 torreB = new ControladorPunto5();
        ControladorPunto5 torreC = new ControladorPunto5();
        boolean continuar = true;
        while (continuar) {
            torreA.imprimir();
            torreB.imprimir();
            torreC.imprimir();
            System.out.println("Extraer de la torre:");
            Scanner sc = new Scanner(System.in);
            String torre = sc.nextLine();
            String SegundoPaso;
            switch (torre) {
                case "A":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "B":
                            torreB.apilar(torreA.desapilar());
                            break;
                        case "C":
                            torreC.apilar(torreA.desapilar());
                            break;
                    }
                    break;
                case "B":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "A":
                            torreA.apilar(torreB.desapilar());
                            break;
                        case "C":
                            torreC.apilar(torreB.desapilar());
                            break;
                    }
                    break;
                case "C":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "A":
                            torreA.apilar(torreC.desapilar());
                            break;
                        case "B":
                            torreB.apilar(torreC.desapilar());
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
