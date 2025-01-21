package aplicacionconexcepciones;

public class AplicacionBasicaException extends Exception {
    public AplicacionBasicaException(String texto) {
        super(texto);
    }
    public AplicacionBasicaException() {}
}