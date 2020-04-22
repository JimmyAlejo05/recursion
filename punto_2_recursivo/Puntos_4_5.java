package usb.taller4.punto_2_recursivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import usb.taller4.punto_2_recursivo.controlador.ControladorPunto4;
import usb.taller4.punto_2_recursivo.controlador.ControladorPunto4_Contador;

/**
 *
 * @author jimmy rios
 */
public class Puntos_4 {

    public static void main(String[] args) throws IOException {
        punto4();
       
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
}
