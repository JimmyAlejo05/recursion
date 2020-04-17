
package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

/**
 *
 * @author jimmy rios
 */
public class menorVector {

    static int menorvector(int vector[], int size) {

        if (size == 0) {
            return vector[0];

        } else {

            if (vector[size] < menorvector(vector, size - 1)) {
                return vector[size];
            } else {
                return menorvector(vector, size - 1);
            }
        }
    }
    public static int menorVectorIterativo(int vector[],int menor){
        for (int i = 0; i < vector.length -1; i++) {
            if(vector[i]<menor) {
                menor = vector[i];
            }        
        }       
        return menor;
    }
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

         System.out.println("Ingresa el tamaño del vector");
        int vector[] = new int[l.nextInt()];

        System.out.print("Introduce los Valores :");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = l.nextInt();
        }
        System.out.println(menorvector(vector, vector.length-1));
        System.out.println("Iterarivo\n"+ menorVectorIterativo(vector, 0));
    }
}
