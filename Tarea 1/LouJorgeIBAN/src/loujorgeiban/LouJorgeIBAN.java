package loujorgeiban;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Jorge Lou
 */

public class LouJorgeIBAN {

    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        System.out.println("Introduce el código de la entidad bancaria, de sucursal, y de cuenta: ");
        String entidad = miteclado.next();
        String sucursal = miteclado.next();
        String cuenta = miteclado.next();
        String CCC = generaCCC(entidad,sucursal,cuenta);
        formateaCCC(CCC);
        String IBAN = generaIBAN("ES", CCC, digitoControlIBAN("ES",CCC));
        formateaIBAN(IBAN);
        
        System.out.println("Introduce un código de cuenta completo, y su país: ");
        String cuenta2 = miteclado.next();
        String pais = miteclado.next();
        String IBAN2 = generaIBAN(pais, cuenta2, digitoControlIBAN(pais,cuenta2));
        formateaIBAN(IBAN2);
    }
    public static int digitoControl(String a){
        int res = 0;
        int aux = 1;
        for(int i=0;i<a.length();i++){
            res = (res + (aux * a.charAt(i))) % 11;
            aux = (aux*2)%11;   
        }
        if (res<=1) return res;
        else return 11-res;
    }
            
    public static String generaCCC(String a, String b,String c){
        String aux = "00";
        int c1 = digitoControl(aux.concat(a.concat(b)));
        int c2 = digitoControl(c);
        String control = (String.valueOf(c1)).concat(String.valueOf(c2));
        return a.concat(b.concat(control.concat(c)));
    }
    
    public static void formateaCCC(String a){
        System.out.print("Código CCC de la cuenta:  ");
        for(int i=0;i<4;i++)
            System.out.print(a.charAt(i));
        System.out.print(" ");
        for(int i=4;i<8;i++)
            System.out.print(a.charAt(i));
        System.out.print(" ");
        for(int i=8;i<10;i++)
            System.out.print(a.charAt(i));
        System.out.print(" ");
        for(int i=10;i<20;i++)
            System.out.print(a.charAt(i));
        System.out.println();
    }
    
    public static long digitoControlIBAN(String a, String b){
        String aux = "00";
        String c = b.concat(a.concat(aux));
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)>='A'&&c.charAt(i)<='Z') aux=aux.concat(String.valueOf(c.codePointAt(i)-55));
            // Especificación de entrada: las letras deben estar en mayúsculas
            else aux=aux.concat(String.valueOf(c.charAt(i)));
        }
        BigInteger total = new BigInteger(aux);
        BigInteger modulo = BigInteger.valueOf(97);
        BigInteger resto = total.remainder(modulo);
        return 98-resto.longValue();  
    }
    
    public static String generaIBAN(String a, String b, long c){
        if(c<10) return a.concat("0").concat(String.valueOf(c)).concat(b);
        else return a.concat(String.valueOf(c)).concat(b);
    }
    
    public static void formateaIBAN(String a){
        System.out.print("Código IBAN de la cuenta:  ");
        int i=0;
        while(i+3<a.length()){
            System.out.print(a.charAt(i));
            System.out.print(a.charAt(i+1));
            System.out.print(a.charAt(i+2));
            System.out.print(a.charAt(i+3));
            System.out.print(" ");
            i+=4;
        }
        for(int j=i;j<a.length();j++)
            System.out.print(a.charAt(j));
        System.out.println();
    }
}