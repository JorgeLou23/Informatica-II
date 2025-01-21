/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.Objects;

/**
 *
 * @author ciencias
 */
public class Carreteras {
    private Ciudades ci1,ci2;
    private int lon;
    
    public Carreteras(){
    }
    public Carreteras(Ciudades ci1, Ciudades ci2,int longitud){
        this.ci1=ci1;this.ci2=ci2;this.lon=lon;
    }
    
    public Carreteras union(Carreteras ca1,Carreteras ca2){
        if(ca1.ci1==ca2.ci1) 
            return new Carreteras(ca1.ci2,ca2.ci2,ca1.lon+ca2.lon);
        else if(ca1.ci2==ca2.ci1) 
            return new Carreteras(ca1.ci1,ca2.ci2,ca1.lon+ca2.lon);
        else if(ca1.ci1==ca2.ci2) 
            return new Carreteras(ca1.ci2,ca2.ci1,ca1.lon+ca2.lon);
        else if(ca1.ci2==ca2.ci2) 
            return new Carreteras(ca1.ci1,ca2.ci1,ca1.lon+ca2.lon);
        else{
            System.out.println("Estas carreteras no se pueden unir");
            return new Carreteras();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carreteras other = (Carreteras) obj;
        if (this.lon != other.lon) {
            return false;
        }
        if (Objects.equals(this.ci1, other.ci1)) {
            if (Objects.equals(this.ci2, other.ci2)) return true;
            else return false;
        }
        else if(!Objects.equals(this.ci1,other.ci2)) return false;
        else return (Objects.equals(this.ci2,other.ci1));
    }
    
    
}
