
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("A sayısını girin.");
        a = input.nextInt();
        
        switch(a){
            case 1:
                System.out.println("Sayınız = 1.");
                break;

            case 2:
                System.out.println("Sayınız = 2.");
                break;

            case 3:
                System.out.println("Sayınız = 3.");
                break;

            default:
                System.out.println("Sayınız 3'den büyük.");
                break;
        }
    }
}
