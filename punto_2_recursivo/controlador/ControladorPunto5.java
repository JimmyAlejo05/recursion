/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb.taller4.punto_2_recursivo.controlador;

import java.util.Stack;



/**
 *
 * @author Camilo y Roberth
 */
public class ControladorPunto5 {

   Stack< Integer> torre = new Stack< Integer>();

    public void push(int disco) {
        torre.push(disco);
    }

    public boolean apilar(int disco) {
        boolean apilado = false;
        if (torre.empty()|| disco < torre.peek()) {
            torre.push(disco);
            apilado = true;
        }
        return apilado;
    }

    public int desapilar() {
        int elemento = 0;
        elemento = torre.pop();
        return elemento;
    }

    public void imprimir() {
        torre.toString();
    }

}
