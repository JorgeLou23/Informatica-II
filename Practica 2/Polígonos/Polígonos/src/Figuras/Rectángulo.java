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
public class Rectángulo {
    private double alto,ancho;
    private Punto origen;
    
    public Rectángulo(double x, double y, double alto, double ancho){
        origen=new Punto(x,y); this.alto=alto; this.ancho=ancho;
    }
    public Rectángulo(Punto p, double alto, double ancho){
        this.origen=new Punto(p); this.alto=alto; this.ancho=ancho;
    }
    
    public double area(){
        return alto*ancho;
    }
    public String toString(){
        return origen.toString()+", "+alto+", "+ancho;
    }
    
    public Rectángulo mover(double x, double y){
        return new Rectángulo(origen.mover(x,y),alto,ancho);
    }
    public Rectángulo mover (Punto p){
        return new Rectángulo(origen.mover(p),alto,ancho);
    }
}
