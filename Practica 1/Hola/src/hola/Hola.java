/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = miteclado.next();
        System.out.println("Hola " + nombre);
    }
    
}
