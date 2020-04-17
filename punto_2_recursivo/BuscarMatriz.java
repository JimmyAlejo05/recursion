
package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class BuscarMatriz {
    public static boolean buscarRecursivo(String[][] matriz, String buscar, int f, int c, int a, int b) {
        boolean validar = false;
        if (a <= f-1 && b <= c-1) {
            if (buscar.equalsIgnoreCase(matriz[a][b])) {
                a = f;
                b = c;
                validar = true;
            } else {
                if (validar == false) {
                    if (b < c-1) {
                        b++;
                        validar = buscarRecursivo(matriz, buscar, f, c, a, b);
                    } else {
                        a++;
                        b = 0;
                        validar = buscarRecursivo(matriz, buscar, f, c, a, b);
                    }
                }
            }
        }
        return validar;
    }
     
    public static boolean buscarIterativo(String[][] matriz, String buscar){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz [i][j] == null ? buscar == null : matriz [i][j].equals(buscar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String[][] matriz = new String[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                matriz[i][j] = l.next();
            }
        }
        System.out.println("Elemento a buscar: ");
        String n = l.next();

        System.out.println("Recursivo \n"+buscarRecursivo(matriz, n, 2, 2, 0, 0));
        System.out.println("Iterativo \n"+buscarIterativo(matriz, n));
    }
}
 