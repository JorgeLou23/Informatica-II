package conjuntos;
import java.util.*;


public class Conjuntos {

    public static void main(String[] args) {
        String[] x = {"a","a","b"};
        String[] y = {"b","b","c"};
        Set<String> sx = new HashSet(Arrays.asList(x));
        Set<String> sy = new HashSet(Arrays.asList(y));
    }
    
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> c = new HashSet<>(a);
        c.addAll(b);
        return c;
    }
    
    public static <T> Set<T> interseccion(Set<T> a, Set<T> b){
        Set<T> c = new HashSet<>();
        c.retainAll(b);
        return c;
    }
    
    public static <T> Set<T> dif(Set<T> a, Set<T> b){
        Set<T> c = new HashSet<>();
        c.removeAll(b);
        return c;
    }
    
    public static <T> Set<T> difSim(Set<T> a, Set<T> b){
        Set<T> c = dif(union(a,b),interseccion(a,b));
        return c;
    }
}
