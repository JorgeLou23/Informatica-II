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
public class Resta extends Operador{
    private static Resta resta= null;
    private Resta(){};
    public static Resta getResta(){
        if (resta==null)
            resta = new Resta();
        return resta;

    }
    
    public double operar(double a, double b){
        return a-b;
    }
}
