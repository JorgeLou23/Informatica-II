/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

/**
 *
 * @author ciencias
 */
public class Empleado {
    private String nombre,apellido1,apellido2,cargo;
    
    public Empleado(){
    }
    public Empleado(String n, String a1, String...y){
        nombre=n; apellido1=a1 ; apellido2=y[0]; cargo=y[1];
    }
    
//    public Empleado(String n, String a1, String a2, String c) {
//        
//    }
//    public Empleado(String n, String a1, String a2) {
//        this(n, a1, a2, null);
//    }
    
    public String getAyN(){
        if(apellido2!=null)return apellido1+" "+apellido2+", "+nombre;
        else return apellido1+", "+nombre;
    }
    public String getCargo(){
        return cargo;
    }
    
    public boolean equals(Empleado e){
        return nombre.equals(e.nombre)&&apellido1.equals(e.apellido1)
                &&apellido2.equals(e.apellido2)&&cargo.equals(e.cargo);
    }
    
    public String toString(){
        return this.getAyN()+"\n"+this.getCargo();
    }
    
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
}
