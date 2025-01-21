package jerarquia;

import java.util.Arrays;

public class Carpeta extends Archivo {
    private Carpeta padre;
    private Archivo[] archivos;
    private int narchivos;

    public final static Carpeta RAIZ = new Carpeta();

    private Carpeta() {
        this("/", null);
    }
    private Carpeta(String nombre, Carpeta padre) {
        super(nombre);
        this.padre=padre;
        archivos = new Archivo[10];
        narchivos = 0;
    }

    public int getTamaño() {
        int res = 0;
        for(int i=0; i<narchivos; i++) res += archivos[i].getTamaño();
        return res;
    }

    public boolean isBorrable(){
        if(this==RAIZ) return false;
        else return narchivos==0;
    }

    private int buscarNombreArchivo(String nombre) {
        int i = 0;
        while (i<narchivos && !archivos[i].getNombre().equals(nombre)) i++;
        return i<narchivos ? i : -1;
    }

    public Carpeta getCarpetaPorNombre(String nombre) throws ExcepcionArchivo{
        Carpeta res;
        if ("..".equals(nombre)) res = (this==RAIZ ? RAIZ : padre);
        else if ("/".equals(nombre)) res = RAIZ;
        else if (".".equals(nombre)) res = this;
        else {
            int donde = buscarNombreArchivo(nombre);
            try{
                res = donde<0 ? this : (Carpeta)archivos[donde];
            }catch(ClassCastException e){
                throw new ExcepcionArchivo("No es una carpeta");
            }
        }
        return res;
    }

    private void auxiliar(Archivo a){
        if (narchivos==archivos.length) {
            archivos = Arrays.copyOf(archivos, narchivos+10);
        }
        archivos[narchivos++] = a;
    }
    public void añadirFichero(String nombre, int tamaño) 
            throws ExcepcionArchivo{
        if(this.buscarNombreArchivo(nombre)!=-1) 
            throw new ExcepcionArchivo("Ya existe un archivo con este nombre");
        else this.auxiliar(new Fichero(nombre,tamaño));
    }
    public void añadirCarpeta(String nombre) 
            throws ExcepcionArchivo{
        if(this.buscarNombreArchivo(nombre)!=-1) 
            throw new ExcepcionArchivo("Ya existe un archivo con este nombre");
        else this.auxiliar(new Carpeta(nombre, this));
    }
    
    public void eliminarArchivo(String nombre)
            throws ExcepcionArchivo{
        int ind = this.buscarNombreArchivo(nombre);
        if(ind==-1) 
            throw new ExcepcionArchivo("No existe un archivo con este nombre");
        else if(!archivos[ind].isBorrable())
            throw new ExcepcionArchivo("No se puede borrar este archivo");
        else{
            Archivo[] aux = Arrays.copyOf(archivos, narchivos+1);
            for(int i=ind;i<archivos.length;i++){
                archivos[i]=aux[i+1];
            }
            narchivos--;
            
        }      
    }

    public void escribeContenido() {
        System.out.format("   %-20s -- %5d", ".", getTamaño());
        System.out.println();
        for(int i=0; i<narchivos; i++) {
            System.out.println( archivos[i].tipo() + archivos[i]);
        }
    } 
    protected String tipo(){
        return " C ";
    }
}
