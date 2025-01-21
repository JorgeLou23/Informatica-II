package figuras2d;

public class Circulo extends Figura2D {
    private Punto centro;
    private double radio;
    public Circulo(Punto c, double r) {
        centro = c; radio = r;
    }
    public String toString() {
        return "(c:" + centro + " r: " + radio + ")";
    }
    public double area() {
        return Math.PI*radio*radio;
    }
}
