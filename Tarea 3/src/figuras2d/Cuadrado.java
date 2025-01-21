package figuras2d;

public class Cuadrado extends Figura2D {
    private Punto origen;
    private double ancho;
    public Cuadrado(Punto o, double ancho) {
        this.origen = o;
        this.ancho = ancho;
    }
    public String toString() {
        return "[o:" + origen + " ancho: " + ancho + "]";
    }
    public double area() {
        return ancho*ancho;
    }
}
