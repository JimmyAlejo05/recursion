
package usb.taller4.punto_2_recursivo;

import java.util.Scanner;

public class Palíndromo {

    public static boolean palindromo(String n){
        if(n.length() <= 1){
        return true;
    }else{
        if(n.charAt(0) == n.charAt(n.length() - 1)){
            return palindromo(n.substring(1,n.length() - 1 ) );
        }else{
            return false;
        }
    }  

    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese palabra: ");
        String n = lector.next();
        
        System.out.println(palindromo(n));
    }
    
}
