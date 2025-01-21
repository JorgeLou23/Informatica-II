/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class Tchebychev {
    
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce un número real y un entero(orden del polinomio):");
        double numero = miteclado.nextDouble();
        int orden = miteclado.nextInt();
        System.out.println(Tcheb(numero,orden));
    }
    
    public static double Tcheb(double x, int n) {
        double a=1, b=x, c=0;
        for(int i=2;i<=n;i++) {
            c=2*x*b-a;
            a=b;
            b=c;
        }
    return c;    
        
    }
    
}
