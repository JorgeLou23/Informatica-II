package AplicacionConExcep;

/**
 * Los objetos de esta clase representan biyecciones del conjunto de enteros
 * {0,...,n-1} en si mismo, donde n es un entero positivo arbitrario.
 */
public class Biyeccion extends Aplicacion {

    //TODO 05: escribir constructores similares a los de Aplicación (de copia
    //y a partir de un array que representa una aplicación que además debe ser
    //una biyección. Levantar las excepciones que se consideren oportunas.


    /* TODO 06 Implementa este método  ¿Debe levantar excepciones?
     */
    /**
     * Devuelve la biyección identidad en el conjunto {0..n-1}
     * @param n un entero
     * @return la biyección identidad en el conjunto  {0..n-1}
     */
    public static Biyeccion identidad(int n) {

    }

    /* TODO 07 Implementa este método.
     * ¿Debe levantar las excepciones especificadas en el constructor,
     * en el método preimagenDe de AplicacionBasica y en obtenUnElemento de
     * ConuuntoDeEnteros? Notar que, dado que este objeto es una biyección,
     * el conjunto preimagen de un elemento es un conjunto unipuntual
     * necesariamente.
     */
    /**
     * Devuelve la biyección inversa de esta biyección
     * @return la biyección inversa
     */
    public Biyeccion inversa() {
    }
}
