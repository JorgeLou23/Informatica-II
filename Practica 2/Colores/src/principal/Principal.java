package principal;

import colores.Colores;

public class Principal {
    public static void main(String[] args) {
        Colores c = new Colores(25,50,75);
        System.out.println(c.getRed());
        c.setRed(50);
        System.out.println(c.getRed());
        
    }
}
