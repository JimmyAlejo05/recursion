/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb.taller4.punto_2_recursivo.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Camilo y Roberth
 */
public class ControladorPunto4 {

    //CargarFichero
    public String cargarPoema() throws FileNotFoundException, IOException {
        String poema = "";
        FileReader archivo = new FileReader("C:\\Users\\jimmy\\OneDrive\\Documentos\\NetBeansProjects\\clases virtuales\\src\\usb\\taller4\\punto_2_recursivo\\Prueba.txt");
        BufferedReader buffer = new BufferedReader(archivo);
        boolean validacion = true;
        String aux = "";
        while (validacion) {
            aux = buffer.readLine();
            if (aux == null) {
                validacion = false;
            } else {
                poema = poema + " " + aux;
            }
        }
        return poema;
    }
}
