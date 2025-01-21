/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ciencias
 */
public class Racional {
    private int num,den;
    
    public Racional(int x,int y){ 
        if(y==0) {num=1;den=0;}
        else {num=x; den=y;}
    }

    public String toString() {
        return num + "/" + den ;
    }

    public Racional canonico() {
        Racional can = new Racional(num/mcd(num,den),den/mcd(num,den));
        return can;
    }
    
    public static int mcd(int n1, int n2){
        int res=1, i=2;
        while(i<=n1&&i<=n2){
            if(n1%i==0&&n2%i==0){
                res*=i;n1/=i;n2/=i;
            }
            else i++;
        }
        return res;
    }
    
    @Override
    public int hashCode() {
        int hash = 17;
        Racional can = this.canonico();
        hash = 31 * hash + can.num;
        hash = 31 * hash + can.den;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Racional other = (Racional) obj;
        return this.num*other.den == other.num*this.den;
        }
    
    public static Racional sumar(Racional a, Racional b){
        Racional c = new Racional(a.num*b.den+a.den*b.num,a.den*b.den);
        return c.canonico();
    }
}
