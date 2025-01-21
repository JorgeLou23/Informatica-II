/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class Numeros {
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce el programa:");
        int programa = miteclado.nextInt();
        switch(programa){
            case 1:
                System.out.println("Introduce un número:");
                int numero = miteclado.nextInt();
                if (numero==inverso(numero))
                    System.out.println("Este número es capicúa");
                else System.out.println("Este número no es capicúa");
                break;
                
            case 2:
                System.out.println("Polinomio de Tchebychev \nIntroduce un número real y un entero(orden del polinomio):");
                double numero2 = miteclado.nextDouble();
                int orden = miteclado.nextInt();
                System.out.println(Tcheb(numero2,orden));
                break;
            
            case 3:
                System.out.println("Introduce las 2 coordenadas:");
                double x = miteclado.nextDouble();
                double y = miteclado.nextDouble();
                System.out.println("La distancia euclídea al origen es:" + euclídea(x,y));
                break;
            
            case 4:
                System.out.println("Introduce un número entero:");
                int fact = miteclado.nextInt();
                System.out.println("El factorial es: " + factorial(fact));
                break;
                
            default: break;
        }       
    }
    
    public static int inverso(int m){
        int res = 0;
        while(m!=0){
            res=res*10+m%10;
            m=m/10;
        }
        return res;
    } 
    
    public static double tcheb2(double x, int n) {
        if (n==0) return 1.0;
        else if (n==1) return x;
        else return 2*x*tcheb2(x, n-1) - tcheb2(x, n-2);
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
    
    public static double euclídea(double a, double b) {
        double c = Math.sqrt(a*a+b*b);
        return c;
    }
    
    public static long factorial(long a) {
        long res=1;
        for(int i=1;i<=a;i++)
            res = res*i;
        return res;
    }
    
    public static BigInteger factorial(int a) {
        BigInteger res=BigInteger.ONE;
        for(int i=1;i<=a;i++)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }
    
}