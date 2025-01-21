/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

/**
 *
 * @author ciencias
 */
public class División extends Operador {
    private static División división= null;
    private División(){};
    public static División getDivisión(){
        if (división==null)
            división = new División();
        return división;

    }
    
    public double operar(double a, double b){
        return a/b;
    }
}
