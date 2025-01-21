/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirfichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class EscribirFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        File f = new File("Carpeta1","Fichero1.txt");
        if(f.exists()) System.out.println("si");
        System.out.println("Introduce unas líneas(acaba con un punto):");
        FileWriter salida = null;
        try{
            salida = new FileWriter(f, true);
            String s = miTeclado.nextLine();
            while(!".".equals(s)){
                salida.write(s);
                s = miTeclado.nextLine();
            }
            
        }catch(IOException e){
            System.out.println("Ha habido un error");
        }finally{
            if(salida != null){
                try{ salida.flush(); salida.close();
                } catch(IOException e){}
            }
            
        }
        
    }
    
}
