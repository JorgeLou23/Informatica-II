package AplicacionConExcep;

public class AplicacionBasicaException extends Exception {
    public AplicacionBasicaException(String texto) {
        super(texto);
    }
    public AplicacionBasicaException() {}
}