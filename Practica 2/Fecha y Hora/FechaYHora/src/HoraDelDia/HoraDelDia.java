/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoraDelDia;

/**
 *
 * @author ciencias
 */
public class HoraDelDia {
    private int horas, minutos,segundos;
    public static int formato=0;
    
    public HoraDelDia(){
        horas=0; minutos=0; segundos=0;
    }
    public HoraDelDia(int seg){
        segundos=seg; horas=0; minutos=0;
        this.arreglar();
    }
    public HoraDelDia(int hor,int min,int seg){
        horas=hor; minutos=min; segundos=seg;
        this.arreglar();
    }    
    
    private void arreglar(){
        while(segundos>=60){
            segundos-=60;
            minutos+=1;
        }
        while(minutos>=60){
            minutos-=60;
            horas+=1;
        }
        while(horas>=24){
            horas-=24;
        } 
    }
    
    public String toString(){
        if(formato==0)
            return aux(horas)+":"+aux(minutos)+":"+aux(segundos);
        else{
            String m = "a.m.";
            if(horas>=12){
                horas-=12;
                m="p.m.";
            }
            return aux(horas)+":"+aux(minutos)+":"+aux(segundos)+" "+m;
        }
    }
    public static String aux(int n){
        if(n<10)
            return "0".concat(String.valueOf(n));
        else return String.valueOf(n);
    }
    public void cambiar(int hor, int min, int seg){
        horas=hor; minutos=min; segundos=seg;
        this.arreglar();
    }
    public void cambiar(int seg){
        segundos=seg; minutos=0; horas=0;
        this.arreglar();
    }
    public HoraDelDia sumar(int n){
        HoraDelDia hdd = new HoraDelDia(horas,minutos,segundos+n);
        hdd.arreglar();
        return hdd;
    }
}

