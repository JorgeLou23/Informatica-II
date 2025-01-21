package consola;

import java.util.Scanner;
import jerarquia.*;

public class Consola {
    private static Scanner sc = new Scanner(System.in);
    //TODO El atributo actual representa la carpeta que tenemos
    //actualmente abierta. Podremos cambiar de directorio actual
    //utilizando el comando cd. Inicialmente la carpeta actual
    //debe ser la carpeta raíz.
    private Carpeta actual;
    
    public Consola(){
        actual=Carpeta.getRaiz();
    }
    //El constructor por defecto no puede llamar al constructor por defecto
    //de la clase Carpeta, puesto que este es privado
    
    public void prompt() {
        while(true) {
            System.out.print(actual.getNombre()+"> ");
            String comando = sc.next();
            switch(comando) {
                case "cd":
                    String nombreDir = sc.next();
                    //TODO cambia de carpeta actual. La nueva carpeta
                    //actual será la indicada por el String nombreDir
                    actual=actual.getCarpetaPorNombre(nombreDir);
                    break;
                case "md":
                    nombreDir = sc.next();
                    //TODO añade en la carpeta actual una subcarpeta llamda
                    //nombreDir
                    actual.añadirCarpeta(nombreDir);
                    break;
                case "crear":
                    String nombreFich = sc.next();
                    int tam = sc.nextInt();
                    //TODO añade en la carpeta actual un nuevo fichero
                    //de nombre nombreFich y tamaño tam
                    actual.añadirFichero(nombreFich, tam);
                    break;
                case "dir":
                    //TODO muestra el contenido de la carpeta actual
                    actual.escribeContenido();
                    break;
                default:
                    //Mensaje para indicar que el comando introducido
                    //es incorrecto NO HACER NADA AQUÍ
                    System.out.println("Comando incorrecto");
                    break;
                case "exit":
                    //El comando "exit" termina la sesión de la consola
                    //La siguiente instrucción termina la ejecución de la
                    //máquina virtual de java y, por tanto, del programa
                    //NO HACER NADA AQUÍ
                    System.exit(0);
            }
            sc.nextLine();
        }
    }
}
