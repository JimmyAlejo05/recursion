package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

public class Fibonacci {
    //recursividad
    static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    // iterativo
    static void fibonacciIterativo(int valor) {
        int aux1 = 0, aux2 = 1, total = 1;
        System.out.print(aux1 + " ");
        for (int i = 1; i < valor; i++) {
            System.out.print(total + " ");
            total = aux1 + aux2;
            aux1 = aux2;
            aux2 = total;
        }

    }

    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el tamaño para la serie fibonacci: ");
        int n = l.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        System.out.println("Iterativo\n");
        fibonacciIterativo(n);
    }
   
}
