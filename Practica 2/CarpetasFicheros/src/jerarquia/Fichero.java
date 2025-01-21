/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquia;

/**
 *
 * @author Lou
 */
public class Fichero {
    private String nombre;
    private int tamaño;
    
    Fichero(String nombre, int tamaño){
        this.nombre=nombre; this.tamaño=tamaño;
    }
    //Alcance de paquete, no podemos permitir que se creen ficheros desde el
    //main, pero necesitaremos que los objetos de la clase Carpeta los creen
    
    public String getNombre(){
        return nombre;
    }
    public int getTamaño() {
        return tamaño;
    }
    
    public String toString(){
        return nombre+" --- "+tamaño;
    }

    
    
}
