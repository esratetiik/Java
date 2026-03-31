import java.util.Scanner; 

public class Fonksiyonlar {

    static void f(int x){
        int result = (x+2)*6;
        System.out.println(result);
    }

    static void  power (int s1, int s2){
        int result = 1;
        for(int i = 1; i<=s2; i++){
            result *= s1;
        }
         System.out.println(result);
    }

    static int multi(int a, int b){
        int result;
        result = a*b;
        return result;
    }
    public static void main (String[] args){
        f(4);
        f(6);
        power(2,3);
        power(3,2);

        int result = multi (2,6);
        System.out.println(result);

    }
}
