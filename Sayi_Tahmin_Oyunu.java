import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin_Oyunu{
    
    public static void main(String[] args){
        int tahmin, can=5;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sayi = rand.nextInt(100);

        while(true){
            System.out.println("Tahmininizi giriniz:");
            tahmin = scan.nextInt();

            if(tahmin < sayi ) {
                System.out.println("Daha büyük bir sayı tahmin edin.");
                can--;
                System.out.println("Kalan hakkınız: " + can);
            }
            else if (tahmin > sayi){
                System.out.println("Daha küçük bir sayı tahmin edin.");
                can--;
                System.out.println("Kalan hakkınız: " + can);
            }
            else if (tahmin == sayi) {
                System.out.println("Tahmininiz doğru. Oyunu kazandınız!");
                break;
            }

            if (can == 0) {
                System.out.println("Hakkınız bitti. Oyunu kaybettiniz!");
                System.out.println("Tutulan sayı şuydu: " + sayi);
                break; 
            }
        }
        
    }
}
