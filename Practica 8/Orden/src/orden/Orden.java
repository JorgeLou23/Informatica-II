/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orden;

import java.util.Comparator;
import static orden.Compara.comparar;

/**
 *
 * @author ciencias
 */
public class Orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] a = {11, 2, 42, 4, 5, 6, 7, 8, 9};
        ordena(a, comparar);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].intValue()+" ");
        }

    }

    public static <T> void ordena(T[] a, Comparator<T> c) {
        T aux = null;
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i+1; j < a.length; j++) {
                if (c.compare(a[j], aux) < 0) {
                    k = j;
                }
            }
            if (i != k) {
                aux = a[i];
                a[k] = a[i];
                a[i] = aux;
            }
        }
    }
}

class Compara implements Comparator<Integer> {

    public static final Compara comparar = new Compara();

    private Compara() {
    }

    public int compare(Integer a, Integer b) {
        if (a % 2 != b % 2) {
            return a % 2 - b % 2;
        } else if (a % 2 == 0) {
            return b - a;
        } else {
            return a - b;
        }
    }
}
