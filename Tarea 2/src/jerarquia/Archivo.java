package jerarquia;

public abstract class Archivo {
    private String nombre;
    public Archivo(){}
    public Archivo(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    public abstract int getTamaño();
    public String toString() {
        return String.format("%-20s -- %5d", this.getNombre(), this.getTamaño());
    }
    //Nos vale esta implementación para ambas clases derivadas, por lo que
    //si lo definimos como método no abstracto no es necesario redefinirlo.
    
    public abstract boolean isBorrable();
    protected abstract String tipo();
    //Notar que debemos definirlo en la clase abstracta porque en el método
    //escribeContenido lo utilizamos para un objeto, que generalmente es un
    //Archivo, no sabemos de que clase derivada concreta es.
    //Al estar todas las clases derivadas en el mismo paquete, también
    //podríamos darle nivel de acceso de paquete(idem con las redefiniciones).
    
}
