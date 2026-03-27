
import java.util.Scanner;

public class If_Else{
    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("A sayısını girin.");
        a = input.nextInt();
        System.out.println("B sayısını girin.");
        b = input.nextInt();

        if(a==b){
            System.out.println("A ve B birbirine eşittir.");
        }
        else if(a>b) {
            System.out.println("A, B'den büyüktür.");
        }
        else {
            System.out.println("A, B'den küçüktür.");
        }
    }
}
