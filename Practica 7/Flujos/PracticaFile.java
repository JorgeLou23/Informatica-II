o
package primerosejemplosflujos;

import java.util.*;
import java.io.*;

public class PracticaFile {
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);

        System.out.print("Intro. nombre fich. o carpeta (ej. c:/usuarios): ");
        String s = miTeclado.next();

        /* Se crea un objeto File que representa ese nombre de fichero o carpeta
         * y se comprueba is dicho fichero o carpeta existe realmente. En caso
         * de que exista se muestran en pantalla algunas de sus propiedades.
         */
        File f = new File(s);
        if(f.exists()) {
            propiedadesFile(f, 0);
        } else {
            System.out.println("El fichero/carpeta " + f.getName() +
                    " NO existe o no se encontro.");
        }
    }

    //El siguiente método ilustra el trabajo de algunos métodos de la clase
    //File. Notar que se trata de un método recursivo: si el parámetro f
    //se refiere a un fichero se muestran en pantalla algunos datos de él;
    //pero si es una carpeta, además de mostrar sus datos, muestra información
    //de todos los ficheros que contiene y de sus 'subcarpetas' recursivamente.
    public static void propiedadesFile(File f, int n) {
        File[] listaFich;

        //Se escriben n espacios en blanco en una linea
        for(int i=0; i<n; i++) System.out.print(" ");

        //Se indica si f es una carpeta o un fichero. En el primer caso
        //se obtiene la lista de ficheros y subcarpetas que contiene.
        if (f.isDirectory()) {
            System.out.print("CARPETA:  ");
            listaFich = f.listFiles();
        } else {
            System.out.print("FICHERO:  ");
            listaFich = new File[0];
        }

        //Se muestra en la pantalla la ruta del fichero o carpeta f desde
        //el comienzo de la unidad (ej. 'c:/usuarios/...')
        System.out.print(f.getAbsolutePath());

        //Se indica si el fichero o carpeta puede ser leido/escrito
        System.out.print("  lectura: " + siOno(f.canRead()));
        System.out.println("  escritura: " + siOno(f.canWrite()));

        //Si f es una carpeta se muestran, recursivamente, datos de los
        //ficheros y subcarpetas que contiene.
        for(int i=0; i<listaFich.length; i++) {
            propiedadesFile(listaFich[i], n+2);
        }
    }

    //Este método escribe 'SI' en la pantalla si el parámetro booleano es true
    //y 'NO' si es false
    public static String siOno(boolean b) {
        if(b) return("SI");
        else return("NO");
    }
}
