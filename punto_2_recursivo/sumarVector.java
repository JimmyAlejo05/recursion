
package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class sumarVector {

    static int sumarValores(int array[], int posArray) {

        int tam = posArray;
        int rta;

        if (tam == 0) {
            return array[tam];
        } else {
            rta = (array[tam]) + sumarValores(array, tam - 1);
        }
        return rta;
    }

    static int sumaVectorIterativo(int arrat[]) {
        int tamanio = arrat.length;
        int sumaTotal=0;
        for (int i = 0; i < tamanio; i++) {
            sumaTotal = sumaTotal + arrat[i];
        }
        return sumaTotal;
    }

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del vector");
        int arr[] = new int[l.nextInt()];

        System.out.print("Introduce los Valores :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.nextInt();
        }

        System.out.println(sumarValores(arr, arr.length - 1));
        System.out.println("iterativo\n"+sumaVectorIterativo(arr));
    }
}
