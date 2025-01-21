package tarea04;
import figuras2d.*;

public class ClasificadorFigura2 implements Clasificador<Figura2D,Class>{
    public static ClasificadorFigura2 clas2 = new ClasificadorFigura2();
    private ClasificadorFigura2(){}
    public Class<? extends Figura2D> getCategoria(Figura2D x){
        return x.getClass();
    } 
}
