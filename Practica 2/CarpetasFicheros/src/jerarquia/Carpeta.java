/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquia;

import java.util.Arrays;

/**
 *
 * @author Lou
 */
public class Carpeta {
    private String nombre;
    private Carpeta[] c;
    private Fichero[] f;
    private int nc, nf; 
    private Carpeta padre;
    private static Carpeta raiz=null;
    
    private Carpeta(){
        nombre="/";
        c=new Carpeta[10]; f=new Fichero[10]; nc=0; nf=0;
    }
    public static Carpeta getRaiz(){
        if (raiz==null)
            raiz = new Carpeta();
        return raiz;
    }
    //Delegas la creación de la carpeta única raíz en un método público
    //que utiliza el constructor privado, para poder regularla.
    
    private Carpeta(String nombre, Carpeta padre){
        this.nombre=nombre; this.padre=padre;
        c=new Carpeta[10]; f=new Fichero[10]; nc=0; nf=0;
    }
    //Alcance privado, solo podrá crear carpetas otra carpeta (de las cuales
    // será padre)
    
    public String getNombre(){
        return nombre;
    }
    public int getTamaño(){
        int tamaño=0;
        for(int i=0;i<nc;i++)
            tamaño+=c[i].getTamaño();
        for(int j=0;j<nf;j++)
            tamaño+=f[j].getTamaño();
        return tamaño;
    }
    
    public Carpeta getCarpetaPorNombre(String cadena){
        switch(cadena){
            case "/": return getRaiz();
            case "..": return padre;
            case ".": return this;
            default: 
                if(this.auxiliar(cadena)==-1) return this;
                else return c[this.auxiliar(cadena)];
        }
    }
    private int auxiliar(String cadena){
        int j=-1;
        for(int i=0;i<nc;i++){
            if(cadena.equals(c[i].nombre)) j=i;
        }
        return j;
    }

    public void añadirFichero(String nombre, int tamaño){
        if(nf>f.length) f=Arrays.copyOf(f,f.length+10);
        f[nf]=new Fichero(nombre,tamaño);
        nf++;       
    }
    public void añadirCarpeta(String nombre){
        if(nc>=c.length) c=Arrays.copyOf(c,c.length+10);
        c[nc]=new Carpeta(nombre,this);
        nc++;   
    }
    
    public String toString(){
        return nombre+" --- "+this.getTamaño();
    }
    
    public void escribeContenido(){
        System.out.println(". --- "+this.getTamaño());
        for(int i=0;i<nc;i++)
            System.out.println("C "+c[i].getNombre()+" --- "+c[i].getTamaño());
        for(int j=0;j<nf;j++)
            System.out.println("F "+f[j].getNombre()+" --- "+f[j].getTamaño());
    }
    
}
