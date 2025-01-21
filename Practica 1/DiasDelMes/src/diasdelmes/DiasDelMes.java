/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasdelmes;

import java.util.Scanner;

/**
 *
 * @author ciencias
 */
public class DiasDelMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce el número del día, mes y año:");
        int Día = miteclado.nextInt();
        int Mes = miteclado.nextInt();
        int Año = miteclado.nextInt();
        System.out.println("Ese mes tiene " + numero(Mes,Año) + "días");
        System.out.println("Ese es el día número " + diadelaño(Día,Mes,Año));
    }
    
    public static boolean bisiesto(int z) {
        if(z%4!=0)
            return false;
        else
            if(z%100!=0)
                return true;
            else
                return (z%400==0);       
    }
    
    public static int numero(int y,int z) {
        switch(y){
            case 2: if(bisiesto(z))
                        return 29;
                    else return 28;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            default: return 31;
            
        }
    }
    
    public static int diadelaño(int x, int y, int z) {
        int i=1, res=0;
        while (i<y){
            res=res+numero(i,z);
            i++;
        }
        res=res+x;
        return res;    
    }
}
