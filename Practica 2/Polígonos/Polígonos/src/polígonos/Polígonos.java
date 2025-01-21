/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polígonos;

import Figuras.Punto;
import Figuras.Rectángulo;

/**
 *
 * @author ciencias
 */
public class Polígonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p = new Punto(4,8);
        
        Rectángulo r1 = new Rectángulo(2.3,4.3,6.3,6.8);
        
        Rectángulo r2= new Rectángulo(p,4.6,2.6);
        Rectángulo r3= new Rectángulo(p,2.3,5.3);
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        Rectángulo r4=r2.mover(3.4,5.2);
        System.out.println(r4.toString());
        System.out.println(r3.toString());
    }
    
}
