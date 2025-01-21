package excepciones1;

//El objetivo es definir cuatro versiones distintas de un mismo
//método cambiando, en cada caso, la forma de gestionar las
//excepciones que se puedan producir
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        Scanner miTeclado = new Scanner(System.in);

        //Array de string que usamos como ejemplo
        String[] x = {"1", "-2", "asdf", null, "4", "rst", "5"};
        String[] y = {"1", "-2", "10", null, "4", "rst", "5"};

        System.out.println("Tratamiento de excepciones");
        System.out.println("--------------------------");
        System.out.println("1.- Ningun tratamiento especial");
        System.out.println("2.- try...catch");
        System.out.println("3.- throws/throw");
        System.out.println("4.- Definir excepciones especificas");
        System.out.println();
        System.out.println("Elige un numero: ");
        opcion = miTeclado.nextInt();
        System.out.println();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + suma1(y));
                break;
            case 2:
                System.out.println("El resultado de la suma es: " + suma2(x));
                break;
            case 3:
                try {
                    System.out.println("El resultado de la suma es: " + suma3(x));
                } catch (Exception e) {
                    System.out.println("Excepcion capturada: " + e.getMessage());
                    e.printStackTrace();
                }
                break;
            case 4:
                boolean error = false;
                do {
                    try {
                        System.out.println("El resultado de la suma es: " + suma4(x));
                        error = false;
                    } catch (MiExcepcion e) {
                        error = true;
                        System.out.println("Excepcion capturada: " + e.getMessage());
                        System.out.println("Introduce un valor correcto");
                        x[e.getIndice()] = miTeclado.next();
                    }
                } while (error);
                break;
            default:
                System.out.println("No es una opcion valida");
        }

    }

    //Sin ningún tratamiento especial
    public static String suma1(String[] datos) {
        int res = 0;
        for (int i = 0; i < datos.length; i++) {
            int aux = Integer.parseInt(datos[i]);
            if (aux < 0) {
                System.out.println(datos[i] + " es negativo");
                System.out.println();
            } else {
                res = res + aux;
            }
        }
        return String.valueOf(res);
    }

    //Usando la instrucción try...catch
    public static String suma2(String[] datos) {
        int res = 0;

        try {
            for (int i = 0; i < datos.length; i++) {
                int aux = Integer.parseInt(datos[i]);
                if (aux < 0) {
                    System.out.println(datos[i] + " es negativo");
                    System.out.println();
                } else {
                    res = res + aux;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
            e.printStackTrace();
        }

        return String.valueOf(res);
    }

    //TODO 01: escribe un método suma2bis como el anterior cuyo bucle se detenga
    //al localizar una componente del array datos que no contiene un entero.
    //TODO 02: implementa suma3 de modo similar a suma1, pero lanzando
    //cualquier tipo de excepción cuando se detecta un entero negativo.
    //En el programa principal invoca este método capturando las expceciones
    //que puede lanzar.
    public static String suma3(String[] datos) throws Exception {
        int res = 0;
        for (int i = 0; i < datos.length; i++) {
            int aux = Integer.parseInt(datos[i]);
            if (aux < 0) {
                throw new Exception(datos[i] + " es negativo");
            } else {
                res = res + aux;
            }
        }
        return String.valueOf(res);
    }

    //TODO 03: implementa suma4 de modo similar a suma2, pero capturando
    //las posibles excepciones NullPointerException y NumberFormatException.
    //En los correspondientes bloques catch (¿cuántos son necesarios?)
    //no tratamos, en realidad, el problema, sino que transformamos la
    //excepción lanzando una nueva de la clase MiExcepcion.
    //En el programa principal invoca este método capturando todas las
    //posibles excpeciones y solicitando al usuario que introduzca por
    //teclado un valor correcto cuando se descubre uno erróneo en el array.
    public static String suma4(String[] datos) throws MiExcepcion {
        int res = 0;
        int i = 0;
        try {
            for (i = 0; i < datos.length; i++) {
                int aux = Integer.parseInt(datos[i]);
                if (aux < 0) {
                    throw new MiExcepcion("Negativo en el índice " + i + " ("
                            + datos[i] + ")", i);
                } else {
                    res = res + aux;
                }
            }
        } catch (NumberFormatException e) {
            throw new MiExcepcion("No hay un entero en el indice" + i + " ("
                    + datos[i] + ")", i);
        } catch (NullPointerException e) {
            throw new MiExcepcion("Null en el indice " + i, i);
        }

        return String.valueOf(res);
    }
}

//Definición, por herencia, de un nuevo tipo de excepción.
class MiExcepcion extends Exception {

    private int indice;

    public MiExcepcion(String texto, int i) {
        super(texto);
        indice = i;
    }

    public int getIndice() {
        return indice;
    }
}
