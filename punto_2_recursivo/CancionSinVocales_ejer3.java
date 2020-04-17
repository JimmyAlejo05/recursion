package usb.taller4.punto_2_recursivo;

import java.io.*;

public class CancionSinVocales_ejer3 {

    static String muestraContenido() throws FileNotFoundException, IOException {
        String cancion = "";
        FileReader archivo = new FileReader("C:\\Users\\jimmy\\OneDrive\\Documentos\\NetBeansProjects\\clases virtuales\\src\\usb\\taller4\\punto_2_recursivo\\Cancion.txt");
        BufferedReader buffer = new BufferedReader(archivo);
        boolean validacion = true;
        String aux = "";
        while (validacion) {
            aux = buffer.readLine();
            if (aux == null) {
                validacion = false;
            } else {
                cancion = cancion + "\n" + aux;
            }

        }

        return cancion;
    }

    static void eliminarVocal(String cadena, int i) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\jimmy\\OneDrive\\Documentos\\NetBeansProjects\\clases virtuales\\src\\usb\\taller4\\punto_2_recursivo\\Cancion2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter ow = new PrintWriter(bw);

        if (i < cadena.length()) { //Condición base.
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'
                    || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
                String f; //Variable que recepciona la nueva cadena generada.
                f = cadena.substring(0, i) + "" + cadena.substring(i + 1, cadena.length());
                eliminarVocal(f, i);
            } else {
                eliminarVocal(cadena, i + 1);
            }
        } else {
            System.out.println(cadena);
            bw.write(cadena);
            bw.close();
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("SIN MIRAR LAS SEÑALES - RElS B");
        String a = muestraContenido();// String a el archivo plano 
        System.out.println(a);//lo muestro
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        eliminarVocal(a, 0);

    }
}

//"C:\\Users\\jimmy\\OneDrive\\Documentos\\NetBeansProjects\\clases virtuales\\src\\usb\\taller4\\punto_2_recursivo\\Cancion2.txt"
