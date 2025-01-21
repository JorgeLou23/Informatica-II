/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechayhora;

import HoraDelDia.HoraDelDia;

/**
 *
 * @author ciencias
 */
public class FechaYHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoraDelDia hdd = new HoraDelDia(37,70,89);
        System.out.println(hdd.toString());
        HoraDelDia hdd2 = hdd.sumar(65);
        System.out.println(hdd2.toString());
        HoraDelDia.formato=1;
        System.out.println(hdd.toString());
        System.out.println(hdd2.toString());
        HoraDelDia hdd3 = new HoraDelDia(10,70,89);
        System.out.println(hdd3.toString());
    }
    
}
