/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionales;

import clases.Racional;

/**
 *
 * @author ciencias
 */
public class Racionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional a = new Racional(4,8);
        Racional b = new Racional(8,16);
        System.out.println(a.equals(b));
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.canonico().toString());
        System.out.println(b.canonico().toString());
        System.out.println(Racional.sumar(a,b).toString());
        
    }
    
}
