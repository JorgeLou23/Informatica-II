/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresymatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class VectoresYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el tamaño de los vectores");
        int n = miteclado.nextInt();
        System.out.println("Introduce el primer vector");
        double[] a = leerVector(n);
        escribirVector(a);
        System.out.println("Introduce el segundo vector");
        double[] b = leerVector(n);
        escribirVector(b);
        System.out.println("Su producto escalar es: " + productoEscalar(a,b));
    }
    
    public static double[] leerVector(int m){
        double[] x = new double[m];
        for(int i=0;i<m;i++)
            x[i] = miteclado.nextDouble();
        return x;
    }
    
    public static void escribirVector(double[] x){
        int m = x.length;
        System.out.println(Arrays.toString(x));
        for(int i=0;i<m;i++)
            System.out.print(x[i] + " ");   
    }
    
    public static double productoEscalar(double[] x, double[] y){
        int m = x.length;
        double res = 0;
        for(int i=0;i<m;i++)
            res += x[i]*y[i];
        return res;
    }
    
    
    public static Scanner miteclado = new Scanner(System.in);
           
}
