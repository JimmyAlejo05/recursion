
package usb.taller4.punto_2_recursivo;

/**
 *
 * @author jimmy rios
 */
public class  Torre_Hanoi {
      static void TorreHanoi(int n, char barra, char barra2, char aux) 
    { 
        if (n == 1) 
        { 
            System.out.println("Mueva el disco 1 de la barra " +  barra + " a la barra " + barra2); 
            return; 
        } 
        TorreHanoi(n-1, barra, aux, barra2); 
        System.out.println("Mueva el disco" + n + "de la barra " +  barra + "  a la barra " + barra2); 
        TorreHanoi(n-1, aux, barra2, barra); 
    } 
      

    public static void main(String args[]) 
    { 
        int n = 3; // Numero de discos 
        TorreHanoi(n, 'A', 'C', 'B');  // A, B y C nombre de la barra  
    } 

}
