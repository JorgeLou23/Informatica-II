package monoidegrupo;

public class MonoideGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       mod10[] a = new mod10[10];
       for(int i=0;i<a.length;i++){
           a[i] = new mod10(i);
       }
       for(int i=0;i<a.length;i++){
           System.out.println(a[i].toString() + " " + a[i].inverso().toString());
       }
    }
    
    public static <E extends Monoide<E>> E sumarArray(E[] array) {
        E res = array[0].neutro();
        for(int i=0;i<array.length;i++){
            res = array[i].operar(res);
        }
        return res;
    }
    
}

class mod10 implements Grupo<mod10>{
    private final int a;
    public mod10(int a){
        this.a=(a%10 + 10)%10;
    }
    
    public mod10 neutro(){
        return new mod10(0);
    }
    
    public mod10 operar(mod10 e1){
        return new mod10(this.a+e1.a);
    }
    
    public mod10 inverso(){
        return new mod10(10-this.a);
    }
    public String toString(){
        return "[" + String.valueOf(a) + "]";
    }
}

interface Monoide<E> {
    public E neutro();
    public E operar(E e1);
}
interface Grupo<E> extends Monoide<E> {
    public E inverso();
}
