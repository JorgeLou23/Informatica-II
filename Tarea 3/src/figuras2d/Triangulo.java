package figuras2d;

public class Triangulo extends Figura2D {
    private Punto a, b, c;
    public Triangulo(Punto a, Punto b, Punto c) throws Exception {
        double lado1 = new Segmento(a, b).longitud();
        double lado2 = new Segmento(b, c).longitud();
        double lado3 = new Segmento(c, a).longitud();
        if (lado1*lado2*lado3==0 ||
                lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2) {
            this.a = a; this.b = b; this.c = c;
        } else {
            throw new Exception("Los puntos " + a + ", " + b + " y " + c +
                    " no pueden ser los vértices de un triángulo");
        }
    }
    public double area() {
        try {
            Recta rbase = new Recta(a, b);
            Recta raltura = rbase.perpendicular(c);
            return new Segmento(a, b).longitud()*
                    new Segmento(c, rbase.interseccion(raltura)).longitud()/2;
        } catch (Exception e) {
            //si el triángulo existe no pueden producirse
            return 0;
        }
    }
    public String toString() {
        return "T{" + a + ", " + b + ", " + c + "}";
    }
}
