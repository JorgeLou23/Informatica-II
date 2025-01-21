package figuras2d;

public class Segmento extends FiguraSinArea {
    private Punto primero, segundo;
    public Segmento(double x1, double y1, double x2, double y2) {
        primero = new Punto(x1, y1);
        segundo = new Punto(x2, y2);
    }
    public Segmento(Punto p, Punto s) {
        primero = p; segundo = s;
    }
    public double longitud() {
        double x = primero.getX()-segundo.getX();
        double y = primero.getY()-segundo.getY();
        return Math.sqrt(x*x + y*y);
    }
    public String toString() {
        return "[]" + primero + " -> " + segundo + "]";
    }
}
