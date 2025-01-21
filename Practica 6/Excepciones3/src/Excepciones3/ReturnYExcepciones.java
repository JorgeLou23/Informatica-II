package excepciones3;

/* Ejecutar el método main de esta clase para valores de la variable n
 * entre 1 y 6 (comenzar por 6). El ejemplo contiene diversas clases
 * Excepción (llamadas Excepcioni). Para cada 1<= i <=5 se lanza la
 * correspondiente excepción en el método 'metodo'. Algunas son capturadas en
 * el mismo método, excepción 5 es capturada en main y excepción 4 nunca es
 * capturada. Notar también que excepción 5 deriva de excepción 4.
 *
 * Este ejemplo pretende mostrar la interrelación entre el resultado de una
 * función y el lanzamiento de excepciones, cuando la sentencias return se
 * ubican en diferentes lugares (código normal, código supervisdado en un
 * bloque try, código de un manejador catch y en el bloque finally).
 *
 * Antes de probar el código se debe intentar predecir cuál será el valor
 * de retorno del método 'metodo' si lo hay (que se muestra en pantalla
 * como se indica en la línea 28 del código), teninedo en cuenta que la
 * cláusula finally de una contrucción try/catch/finally siempre se ejecuta.
 */

import java.util.Scanner;

public class ReturnYExcepciones {
    public static void main(String[] args) throws Excepcion4 {
        Scanner miTeclado = new Scanner(System.in);
        try {
            System.out.print("Intro. un valor (1-6): ");
            System.err.println("RESULTADO---> " + metodo(miTeclado.nextInt()));
        } catch (Excepcion5 e) {
            e.capturada();
        } finally {
            System.err.println("--> Finally de main");
        }
        System.err.println("--> Ultima sentencia de main");
    }

    public static int metodo(int n) throws Excepcion4 {
        try {
            try {
                switch(n) {
                    case 1: throw new Excepcion1();
                    case 2: throw new Excepcion2();
                    case 3: throw new Excepcion3();
                    case 4: throw new Excepcion4();
                    case 5: throw new Excepcion5();
                }
                System.err.println("--> No excepcion 1-5");

                return n;

//            } catch (MiExcepcion mie) {
//                System.err.println("CAPTURO TODO");
//                mie.capturada();
            } catch (Excepcion1 e1) {
                e1.capturada();
            } catch (Excepcion2 e2) {
                e2.capturada();
                return n*100;
            } finally {
                System.err.println("--> Primer Finally");
            }
            System.err.println("--> Tras el primer try/catch/finally");

            return n*10;

        } catch (Excepcion3 e3) {
            e3.capturada();
        } finally {
            System.err.println("--> Segundo Finally");
//            return n*1000;
        }
        System.err.println("--> Tras el segundo try/catch/finally");
        return -n;
    }
}

class MiExcepcion extends Exception {
    public MiExcepcion() {}
    public MiExcepcion(String msg) {
        super(msg);
        System.err.println("Lanzada: " + this.getMessage());
    }
    public void capturada() {
        System.err.println("Capturada: " + this.getMessage());
        this.printStackTrace();
    }
}
class Excepcion1 extends MiExcepcion {
    public Excepcion1() { super("excepcion 1"); }
}

class Excepcion2 extends MiExcepcion {
    public Excepcion2() { super("excepcion 2"); }
}

class Excepcion3 extends MiExcepcion {
    public Excepcion3() { super("excepcion 3"); }
}

class Excepcion4 extends MiExcepcion {
    public Excepcion4() { super("excepcion 4"); }
    public Excepcion4(String msg) { super(msg); }
}

class Excepcion5 extends Excepcion4 {
    public Excepcion5() { super("excepcion 5"); }
}

//1- 10
//2- 200
//3- -3
//4- error
//5- no error, no resultado
//6- 6