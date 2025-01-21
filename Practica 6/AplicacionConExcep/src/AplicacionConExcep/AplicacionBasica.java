package AplicacionConExcep;

import java.util.*;

/**
 * Los objetos de esta clase representan aplicaciones del conjunto de enteros
 * {0,...,n-1} en si mismo, donde n es un entero positivo arbitrario.
 */
public class AplicacionBasica {
    /**
     * La aplicación se representa como un array de n enteros, siendo x[i] la
     * imagen del entero i por la aplicación.
     */
    private int[] elementos = null;

    /**
     * Construye una aplicación a partir de los valores contenidos en el
     * array. El dominio y codominio de la aplicación es el conjunto de enteros
     * no negativos estrictamente menores que la longitud del array. Por tanto,
     * el valor de cada componente debe encontrarse en dicho rango. La aplicación
     * que se construye asigna el valor de x[i] como imagen del entero i.
     * @param x array que representa la aplicación.
     * @throws AplicacionBasicaException si el array no representa una aplicación
     */
    public AplicacionBasica(int[] x) throws AplicacionBasicaException {
        if (x.length==0)
            throw new AplicacionBasicaException("No es una aplicación");
        for(int i=0; i<x.length; i++) {
            if (x[i] >= x.length || x[i] < 0)
                throw new AplicacionBasicaException("No es una aplicación");
        }
        elementos = Arrays.copyOf(x, x.length);
    }

    /**
     * Construye una copia de la aplicación x
     * @param x una aplicación
     */
    public AplicacionBasica(AplicacionBasica x) {
        elementos = Arrays.copyOf(x.elementos, x.getTamaño());
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    /**
     * Devuelve el número de elementos del dominio de esta aplicación.
     * @return el número de elementos del dominio de esta aplicación.
     */
    public int getTamaño() { return elementos.length; }

    /**
     * Devuelve la imagen del parámetro por esta aplicación.
     * @param elto un entero
     * @return la imagen de elto
     * @throws AplicacionBasicaException si elto no pertenece al dominio de
     * esta aplicación
     */
    public int imagenDe(int elto) throws AplicacionBasicaException{
        if(elto<0 || elto>=elementos.length)
            throw new AplicacionBasicaException(elto+" no pertenece al dominio");
        else return elementos[elto];
    }

    /**
     * Devuelve el conjunto imagen de esta aplicación.
     * @return el conjunto imagen
     */
    public ConjuntoDeEnteros imagen() {
        return new ConjuntoDeEnteros(elementos);
    }

    /**
     * Devuelve el conjunto de preimagenes de un valor del codominio de esta
     * aplicación.
     * @param elto un entero
     * @return el conjunto de preimagenes de elto
     * @throws AplicacionBasicaException si elto no pertenece al codominio de
     * esta aplicación.
     */
    public ConjuntoDeEnteros preimagenDe(int elto) throws AplicacionBasicaException{
        if(elto<1 || elto>elementos.length)
            throw new AplicacionBasicaException(elto+" no pertenece al codominio");
        else {
            ConjuntoDeEnteros res = new ConjuntoDeEnteros();
            for(int i=0; i<elementos.length; i++) {
                if(elementos[i]==elto) res.añadir(i);
            }
            return res;
        }
    }
}