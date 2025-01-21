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
public class Constante extends Expresion {
    private final double c;
    
    public Constante(double c){
        this.c=c;
    }
    
    public double evaluar(){
        return c;
    }
}
