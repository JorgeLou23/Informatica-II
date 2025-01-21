package jerarquia;

public class Fichero extends Archivo{
    private int tamaño;

    Fichero(String nombre, int tamaño) {
        super(nombre);
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

     public boolean isBorrable(){
         return true;
    }
    
    protected String tipo(){
        return " F ";
    }
}
