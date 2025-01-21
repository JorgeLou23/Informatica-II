package tarea04;

public class ClasificadorString implements Clasificador<String,String>{
    private final int n;
    public ClasificadorString(int n){
         if (n>1) this.n=n;
         else this.n=1;
    }
    //Solo tiene sentido crearlos para que tomen como categorias subcadenas de
    //tamaño al menos 1
    public String getCategoria(String a){
        return a.substring(0,Math.min(n,a.length()));
    }
    //Si el Clasificador intentara clasificar una cadena creando una subcadena
    //de más caracteres(n>a.length()) nos daría un error de índices, por lo
    //que el Clasificador de atributo n tiene sentido que pueda obtener como
    //categorías String de tamaño <n(a pesar de tener atributo n) si el String
    //original también tuviera tamaño <n 
}
