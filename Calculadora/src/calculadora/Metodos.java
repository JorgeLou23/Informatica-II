package calculadora;

import java.util.*;

public class Metodos {
    static double operar(String op, double x, double y) throws Exception{
        switch(op){
            case "+": return x+y;
            case "-": return x-y;
            case "*": return x*y;
            case "/": return x/y;
            case "^": return Math.pow(x,y);
            case "%": return x%y;
            default: throw new Exception();
        }
    }
    static boolean esNumero(String num){
        try{
            Double.parseDouble(num);
            return true;
        }catch(Exception e){
            return false;
        } 
    }
    static boolean esOperador(String op){
        switch(op){
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
            case "%": return true;
            default: return false;
        }
    }
    private static int nivel(String op) throws Exception{
         switch(op){
            case "+":
            case "-": return 1;
            case "*":
            case "/":
            case "%": return 2;
            case "^": return 3;
            default: throw new Exception();
        }
    }
    static boolean masPrecedente(String op1, String op2) throws Exception{
        if(nivel(op1)>=nivel(op2)) return true; 
        else return false;
    }
}
