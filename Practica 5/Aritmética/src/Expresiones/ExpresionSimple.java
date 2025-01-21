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
public class ExpresionSimple extends Expresion {
    private Expresion e1, e2;
    private Operador operador;
    
    public ExpresionSimple(Expresion e1,Expresion e2, Operador operador){
        this.e1=e1; this.e2=e2; this.operador=operador;
    }
    
    public double evaluar(){
         return operador.operar(e1.evaluar(),e2.evaluar());
    }
    
}
