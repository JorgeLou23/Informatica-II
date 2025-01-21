package tarea04;
import figuras2d.*;

public class ClasificadorFigura1 implements Clasificador<Figura2D,Double>{
    public static ClasificadorFigura1 clas1 = new ClasificadorFigura1();
    private ClasificadorFigura1(){}
    public Double getCategoria(Figura2D x){
        return x.area();
    }
}
