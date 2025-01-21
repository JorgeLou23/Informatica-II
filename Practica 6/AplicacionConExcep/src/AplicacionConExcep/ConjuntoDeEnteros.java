package AplicacionConExcep;

import java.util.*;

/**
 * Las instancias de esta clase representan un conjunto de enteros. Como tales
 * no contienen elementos repetidos.
 * @author afrances
 */
public class ConjuntoDeEnteros {
    /**
     * Contenedor de los elementos del contjunto.
     */
    private Set<Integer> eltos = null;

    /**
     * Inicializa este conjunto como el vacío.
     */
    public ConjuntoDeEnteros() {
        eltos = new HashSet<Integer>();
    }

    /**
     * Construye un conjunto cuyos elementos son las componentes del array.
     * Si el array contiene elementos duplicados sólo los inserta en el
     * conjunto una vez.
     * @param x lista de elementos del conjunto
     */
    public ConjuntoDeEnteros(int[] x) {
        eltos = new HashSet<Integer>();
        for(int e : x) eltos.add(e);
    }

    /**
     * Inicializa este conjunto como una copia del parámetro.
     * @param x Conjunto del que se construye una copia.
     */
    public ConjuntoDeEnteros(ConjuntoDeEnteros x) {
        eltos = new HashSet<Integer>(x.eltos);
    }

    /**
     * Devuelve el número de elementos del conjunto: un entero no negativo.
     * @return el cardinal del conjunto.
     */
    public int cardinal() { return eltos.size(); }

    /**
     * Determina si el parámetro pertence a este conjunto.
     * @param x un entero
     * @return verdad sí y sólo si el parámetro pertenece a este conjunto.
     */
    public boolean pertence(int x) {
        return eltos.contains(x);
    }

    /**
     * Añade el elemento <CODE> x </CODE> a este conjunto. El conjunto no
     * es modificado si ya contenía al elemento.
     * @param x un nuevo elemento
     */
    public void añadir(int x) {
        eltos.add(x);
    }

    @Override
    public String toString() {
        return eltos.toString();
    }

    /**
     * Devuelve un elemento arbitrario de este conjunto.
     * @return un elemento de este conjunto
     * @throws ConjuntoException si el conjunto está vacío
     */
    public int obtenUnElemento() throws ConjuntoException {
        if (eltos.isEmpty()) throw new ConjuntoException("Conjunto vacío");
        else return eltos.iterator().next();
    }

    /**
     * Devuelve el mayor elemento de este conjunto
     * @return el máximo del conjunto
     * @throws ConjuntoException si el conjunto está vacío
     */
    public int maximo() throws ConjuntoException {
        if (eltos.isEmpty()) throw new ConjuntoException("Conjunto vacío");
        else {
            int res = -1;
            for(int x : eltos) {
                if (x > res) res = x;
            }
            return res;
        }
    }
}