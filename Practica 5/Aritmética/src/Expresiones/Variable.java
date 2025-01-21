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
public class Variable extends Expresion {
    private double n;
    
    public Variable(double n){
        this.n=n;
    }
    
    public double evaluar(){
        return n;
    }
    
    public void cambiaValor(double m){
        n=m;
    }
}
