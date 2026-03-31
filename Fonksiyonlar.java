import java.util.Scanner; 

public class Fonksiyonlar {

    //OVERLOADING
    static int add (int a, int b){
        return a+b;
    }
    static int add (int a, int b, int c){
        return a+b+c; 
    }
    static double add (int a, int b, double c){
        return a+b+c; 
    }

    //RECURSIVE 
    static int f(int x){
        if (x==1){
            return 1;
        }
        return x + f(x-1);
    }

    public static void main (String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2, 0.5));
        System.out.println(f(5));

    }
    

    
}
