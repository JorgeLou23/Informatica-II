package figuras2d;

public class Recta extends FiguraSinArea {
    //ec. general de la recta en el plano ax + by + c = 0, (a,b)!=(0,0)
    private double a, b, c;    //coeficientes de la recta
    
    public Recta(double a, double b, double c) throws Exception {
        if (a==0 && b==0) throw new Exception();
        this.a = a; this.b = b; this.c = c;
    }
    //Crea la recta que pasa por los puntos a y b, que deben ser distintos
    public Recta(Punto a, Punto b) throws Exception {
        this.a = b.getY()-a.getY();
        this.b = -b.getX()+a.getX();
        if (this.a==0 && this.b==0) throw new Exception();
        this.c = -a.getX()*this.a - a.getY()*this.b;
    }
    //Devuelve la recta que pasa por el punto p y es perpendicular a ésta recta
    public Recta perpendicular(Punto p) {
        try {
            return new Recta(-b, a, p.getX()*b-p.getY()*a);
        }catch(Exception e) {
            //La recta perpendicular existe siempre.
            return null;
        }
    }
    //Devuelve el punto de interseccion de la recta r con esta recta.
    //null si las rectas son paralelas.
    public Punto interseccion(Recta r) {
        if (this.a*r.b==this.b*r.a) return null;    //paralelas
        double det = this.a*r.b - this.b*r.a;
        double x = -this.c*r.b + r.c*this.b;
        double y = this.c*r.a - r.c*this.a;
        return new Punto(x/det, y/det);
    }
    
    public String toString() {
        return String.format("%+5.2f·x%+5.2f·y%+5.2f = 0", a, b, c);
    }
}
