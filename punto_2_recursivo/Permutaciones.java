package usb.taller4.punto_2_recursivo;

import java.util.LinkedList;
import java.util.Scanner;

public class Permutaciones {

    static void escribe(String a, LinkedList<String> conjunto) {
        if (conjunto.size() == 1) {
            System.out.println(a + conjunto.get(0));
        }
        for (int i = 0; i < conjunto.size(); i++) {
            String b = conjunto.remove(i);
            escribe(a + b, conjunto);
            conjunto.add(i, b);
        }
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        LinkedList<String> conjunto = new LinkedList<String>();
        String f;

        System.out.println("Ingresa el tamaño del cadena");
        int n = l.nextInt();

        System.out.print("Introduce los Valores :");
        for (int i = 0; i < n; i++) {
            f = l.next();
            conjunto.add(f);
        }

        escribe("", conjunto);
    }
}
