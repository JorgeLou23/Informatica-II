/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author ciencias
 */
public class Punto {
    private final double x,y;
    
    public Punto(Punto p){
        x=p.x; y=p.y;
    }
    public Punto(double x,double y){
        this.x=x; this.y=y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
    
    public Punto mover(double x, double y){
        return new Punto(this.x+x,this.y+y);
    }
    public Punto mover(Punto p){
        return new Punto(x+p.x,y+p.y);
    }
}
