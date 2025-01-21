package aplicacionconexcepciones;

/**
 * Los objetos de esta clase representan aplicaciones del conjunto de enteros
 * {0,...,n-1} en si mismo, donde n es un entero positivo arbitrario, de la
 * misma forma que su clase base 'AplicacionBasica' a la que se ha añadido
 * la funcionalidad necesaria para realizar la composición de aplicaciones.
 */
public class Aplicacion extends AplicacionBasica {
    private int[] elementos = null;

    //TODO 01: escribir constructores para esta clase similares a los de
    //AplicacionBasica (de copia y a partir de un array)

    /**
     * Devuelve la aplicación g·f
     * @param f una aplicación
     * @param g otra aplicación
     * @return la aplicación f compuesta con g
     * @throws AplicacionBasicaException
     */
    /* TODO 02: Modificar el método para que sea correcto.
     * Observar que f y g se puede componer si y sólo si el conjunto imagen
     * de f está contenido en el dominio de g: lanzar una excepción en otro
     * caso. Notar que el método imagenDe (de AplicacionBasica) especifica una
     * una excepción. Tal y como esta programado el algoritmo ¿se levantará
     * en alguna ocasión dicha excepción? Obrar en consecuencia.
     */
    public static Aplicacion componer(Aplicacion f, Aplicacion g) {
        if (f.imagen().maximo() >= g.getTamaño()) {
            //...
        }
        int[] x = new int[f.getTamaño()];
        for (int i = 0; i < x.length; i++) {
                x[i] = g.imagenDe(f.imagenDe(i));
        }
        return new Aplicacion(x);
    }

    /**
     * Devuelve la aplicación que resulta al componer esta aplicación con la
     * referenciada por el parámetro.
     * @param g una aplicación
     * @return la aplicación this·g
     * @throws AplicacionBasicaException
     */
    /* TODO 03 Implementa este método ¿Debe lanzar alguna excepción?
     */
    public Aplicacion componerIzda(Aplicacion g) {
        return componer(this, g);
    }

    /**
     * Devuelve la aplicación que resulta al componer la
     * referenciada por el parámetro con esta aplicación.
     * @param f una aplicación
     * @return la aplicación f·this
     * @throws AplicacionBasicaException
     */
    /* TODO 04 Implementa este método ¿Debe lanzar alguna excepción?
     */
    public Aplicacion componerDcha(Aplicacion f) {
        return componer(f, this);
    }
}