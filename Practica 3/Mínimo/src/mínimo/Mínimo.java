/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mínimo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class Mínimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce una cadenas de String");
        int k=0;    //número de eltos. guardados en el array
        String[] x = new String[10];
        String n = miteclado.next();
        while(!n.equals("0") && k<x.length){
            x[k] = n;
            k++;
            n = miteclado.next();
        }
        String[] xfinal = Arrays.copyOf(x, k);
        
        //Arrays.sort(xfinal);
        ordena(xfinal);
        System.out.println(Arrays.toString(xfinal));
    }
    
    public static void ordena(String[] x) {
        String aux;
        int posMin;
        for(int i=0; i<x.length-1; i++){
            posMin = i;
            for(int j=i+1; j<x.length;j++){
                if(x[j].compareTo(x[posMin])<0){
                    posMin = j;
                }
            }
            if(posMin!=i) {
                aux=x[i]; x[i]=x[posMin]; x[posMin]=aux;
            }
        }
    }
    
}
