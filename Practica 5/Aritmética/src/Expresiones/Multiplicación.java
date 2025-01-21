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
public class Multiplicación extends Operador{
    private static Multiplicación multiplicación= null;
    private Multiplicación(){};
    public static Multiplicación getMultiplicación(){
        if (multiplicación==null)
            multiplicación = new Multiplicación();
        return multiplicación;

    }
    
    public double operar(double a, double b){
        return a*b;
    }
}
