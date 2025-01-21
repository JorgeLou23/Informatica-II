package excepciones2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);

        System.out.println("Introduce un entero: ");
        String s = miTeclado.next();
        try {
            System.out.println("Resultado: " + m1(s));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Resultado: " + m3(s));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
   }

    public static int verificaEntero(String s) throws NumberFormatException {
        System.out.println("      Soy el metodo verificaEntero");
        int n = Integer.parseInt(s);
        System.out.println("      Fin del metodo verificaEntero");
        return n;
    }

    public static int m1(String s) throws NumberFormatException {
        System.out.println("Soy el metodo m1");
        int n = m2(s);
        System.out.println("Fin de m1");
        return n;
    }

    public static int m2(String s) throws NumberFormatException {
        System.out.println("   Soy el metodo m2");
        int n = verificaEntero(s);
        System.out.println("   Fin de m2");
        return n;
    }

    public static int m3(String s) throws NumberFormatException {
        System.out.println("Soy el metodo m3");
        int n = verificaEntero(s);
        System.out.println("Fin de m3");
        return n;
    }
}
