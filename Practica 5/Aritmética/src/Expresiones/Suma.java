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
public class Suma extends Operador{
    private static Suma suma= null;
    private Suma(){};
    public static Suma getSuma(){
        if (suma==null)
            suma = new Suma();
        return suma;

    }
    
    public double operar(double a, double b){
        return a+b;
    }
    
    
}
