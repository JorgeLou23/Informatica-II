package tarea04;

import figuras2d.*;
import java.util.*;

public class Tarea04 {

    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = "holisima";
        String s3 = "hoy";
        String s4 = "ayer";
        HashSet s = new HashSet();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        ClasificadorString c = new ClasificadorString(2);
//        Map m = clasif(s,c);
//        for(Object t: m.keySet()){
//            System.out.println(t);
//            System.out.println(m.get(t)); 
//        }
        
        
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(1,1);
        Punto p3 = new Punto(1,-1);
        Figura2D f1 = new Circulo(p1,3);
        Figura2D f2 = new Cuadrado(p1,2);
        try{
            Figura2D f3 = new Recta(p1,p2);
            Figura2D f4 = new Triangulo(p1,p2,p3);
            Figura2D f5 = new Segmento(p1,p2);
            HashSet ss = new HashSet();
            ss.add(f1);
            ss.add(f2);
            ss.add(f3);
            ss.add(f4);
            ss.add(f5);
            ss.add(p1);
            ss.add(p2);
            ss.add(p3);
//            Map m1 = clasif(ss,ClasificadorFigura1.clas1);
//            for(Object t: m1.keySet()){
//                System.out.println(t);
//                System.out.println(m1.get(t)); 
//            }
        
            Map m2 = clasif(ss,ClasificadorFigura2.clas2);
            for(Object t: m2.keySet()){
                System.out.println(t);
                System.out.println(m2.get(t)); 
            }
        } catch (Exception e){}
        

          
    }
    
    public static <T> Map<Class,List<T>> clasif(Collection<T> a,Clasificador<? super T,Class> b){
        Map<Class,List<T>> c = new HashMap<>();
        for(T t:a){
            if(!c.containsKey(b.getCategoria(t))){
                c.put(b.getCategoria(t), new ArrayList<>());
            }
            c.get(b.getCategoria(t)).add(t); 
        }
        return c;
    }
}
