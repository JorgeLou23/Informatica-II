/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirsecuencia;

import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class InvertirSecuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce la secuencia:");
        int i=0;    //número de eltos. guardados en el array
        int[] x = new int[200];
        int n = miteclado.nextInt();
        while(i<x.length && n>=0){
            x[i] = n;
            i++;
            n = miteclado.nextInt();   
        }
        for(int j=i-1;j>=0;j--) {
            System.out.print(x[j]+" ");
        }
    }
    
}
