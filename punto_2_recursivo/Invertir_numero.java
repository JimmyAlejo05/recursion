package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

public class Invertir_numero {

    static String invertir(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf(num % 10) + invertir(num / 10);
        }
    }
      static String invertirNumeroIterativo(int valor) {
        String invertirNumeroString = String.valueOf(valor), invertirNumeroInvertido = null;
        for (int x = invertirNumeroString.length() - 1; x >= 0; x--) {
            invertirNumeroInvertido = invertirNumeroInvertido + invertirNumeroString.charAt(x);
        }
        return invertirNumeroInvertido;
    }
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el numero para invertir: ");
        int n = l.nextInt();
        System.out.println(invertir(n));
        System.out.println("Iterativo");
        invertirNumeroIterativo(n);
    }
}
