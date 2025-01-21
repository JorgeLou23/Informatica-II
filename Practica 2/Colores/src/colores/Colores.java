/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

/**
 *
 * @author ciencias
 */
public class Colores {
    private int red , green, blue;
    
    public Colores(){
        red=255; green=255; blue= 255;
    }
    public Colores(int r, int g, int b) {
        red = r; green = g; blue = b;
    }
    public Colores(Colores c){
        red=c.red; green=c.green; blue=c.blue;
    }
    
    public int getRed(){
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    
    public void setRed(int red){
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    
    
    
    public String toString() {
        return "(" + red + "; " + green + "; " + blue + ")";
    }
    
    public Colores mezclar(Colores c){
        return new Colores((red+c.red)/2,(green+c.green)/2,(blue+c.blue)/2);
    }
}
