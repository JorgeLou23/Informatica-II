/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmética;

import Expresiones.*;

/**
 *
 * @author ciencias
 */
public class Aritmética {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constante cte4 = new Constante(4);
        Constante cte5 = new Constante(5);
        Constante cte7 = new Constante(7);
        Constante cte2 = new Constante(2);
        Variable var = new Variable(0);
        Suma suma = Suma.getSuma();
        Resta resta = Resta.getResta();
        Multiplicación multiplicación = Multiplicación.getMultiplicación();
        División división = División.getDivisión();
        ExpresionSimple e1 = new ExpresionSimple(cte4,var,suma);
        ExpresionSimple e2 = new ExpresionSimple(cte5,cte7,resta);
        ExpresionSimple e3 = new ExpresionSimple(e2,cte2,división);
        ExpresionSimple e4 = new ExpresionSimple(e3,var,suma);
        ExpresionSimple expr = new ExpresionSimple(e1,e4,multiplicación);
        System.out.println(expr.evaluar());
        var.cambiaValor(1);
        System.out.println(expr.evaluar());
    }
    
}
