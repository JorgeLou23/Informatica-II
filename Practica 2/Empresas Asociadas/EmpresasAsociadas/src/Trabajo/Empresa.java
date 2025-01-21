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
public class Empresa {
    private String nombre;
    private Empleado[] listaEmpleados;
    private int numEmpleados;
    
    public Empresa(String nombre,int numMax){
        this.nombre=nombre; listaEmpleados=new Empleado[numMax]; 
        numEmpleados=numMax;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void mostrar(){
        System.out.println(this.getNombre());
        for(int i=0;i<listaEmpleados.length;i++){
            System.out.println(listaEmpleados[i].toString());
        }
    }
    
    public void contratar(Empleado e){
        for(int i=0;i<listaEmpleados.length;i++){
            if(listaEmpleados[i]==null){
                listaEmpleados[i]=e;
                break;
            }
        }
        if(i==listaEmpleados.length-1)
            System.out.println("No se pueden contratar más empleados");
    }
}
