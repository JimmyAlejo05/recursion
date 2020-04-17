package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

public class factorial_numero {
     //METODO RECURSIVO
   static int factorial(int n) {
        if (n == 0) {
            return 1; //Caso Base
        } else {
            return n * factorial(n - 1);  //Fórmula Recursiva
        }
    }
    //METODO ITERATIVO
     static int factorialIterativo(int valor) {
        int resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el numero para hallar su facturial: ");
        int n=l.nextInt();
        System.out.println(factorial(n));
         System.out.println("iterativo ");
       
        System.out.println(factorialIterativo(n));
    }
}
