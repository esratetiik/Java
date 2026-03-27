
import java.util.Scanner;

public class HesapMakinesi{
    public static void main(String[] args){
        int a,b;
        String islem;
        Scanner input = new Scanner(System.in);

        System.out.println("A sayısını girin.");
        a = input.nextInt();
        System.out.println("B sayısını girin.");
        b = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi giriniz.");
        islem = input.next();
        
        switch(islem){
            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "x":
                System.out.println(a*b);
                break;
            
            case "/":
                System.out.println(a/b);

            default:
                System.out.println("Geçersiz işlem girdiniz.");
                break;
        }
    }
}
