/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class Cadenas {

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
                System.out.println("Introduce una cadena:");
                String cadena = miteclado.nextLine();
                if(digitos(cadena)) System.out.println("Esta cadena es un número");
                else System.out.println("Esta cadena no es un número");
                break;
                
            case 2:
                System.out.println("Introduce una palabra:");
                String palabra = miteclado.nextLine();
                if(palindromo1(palabra)) System.out.println("Esta palabra es un palíndromo");
                else System.out.println("Esta palabra no es un palíndromo");
                break;
                
            default: break;
        }
        
    }
    
    public static boolean digitos(String a){
        int i = 0;
        while (i<a.length() &&
                '0'<=a.charAt(i) && a.charAt(i)<='9') i++; 
//        Character.isDigit(a.charAt(i))
        return i==a.length();     
        
//        boolean z = true;
//        int n = a.length();
//        int i=0;
//        while(i<n && z){
//            if(30<=a.codePointAt(i)&& 39>=a.codePointAt(i)) z=true;
//            else return false;
//            i++;
//        }
//        return z;
    }
    
    public static boolean palindromo1(String a){
        int n=a.length()-1;
        String aux = String.valueOf(a.charAt(n));
        for(int i=n-1;i>=0;i--)
            aux = aux.concat(String.valueOf(a.charAt(i)));
        return a.equals(aux);
        
    }
}
