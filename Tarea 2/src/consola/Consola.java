package consola;

import java.util.Scanner;
import jerarquia.Carpeta;
import jerarquia.ExcepcionArchivo;

public class Consola {

    private static Scanner sc = new Scanner(System.in);
    private Carpeta actual = Carpeta.RAIZ;

    public void prompt() {
        while (true) {
            System.out.print(actual.getNombre() + "> ");
            String comando = sc.next();
            try {
                switch (comando) {
                    case "cd":
                        String nombreDir = sc.next();
                        actual = actual.getCarpetaPorNombre(nombreDir);
                        break;
                    case "md":
                        nombreDir = sc.next();
                        actual.añadirCarpeta(nombreDir);
                        break;
                    case "crear":
                        String nombreFich = sc.next();
                        int tam = sc.nextInt();
                        actual.añadirFichero(nombreFich, tam);
                        break;
                    case "dir":
                        actual.escribeContenido();
                        break;
                    case "del":
                        String nombre = sc.next();
                        actual.eliminarArchivo(nombre);
                        break;
                    default:
                        System.out.println("Comando incorrecto");
                        break;
                    case "exit":
                        System.exit(0);
                }
                sc.nextLine();
            } catch(ExcepcionArchivo e){
                System.out.println(e.getMessage());
            }
        }
    }
}
