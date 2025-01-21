/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realescod;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class RealesCod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        File f = new File("Carpeta2","Fichero2.dat");
        if(f.exists()) System.out.println("si");
        BufferedReader entrada = null;
        try{
            entrada = new BufferedReader(new FileReader(f));
            try{
                double d;
                d=entrada.nextByte().doubleValue();
                
            }catch{
                
            }finally{
                
            }  
        } catch(FileNotFoundException e){
        }
    }
    
}
