import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int sicaklik;
        System.out.println("Hava sıcaklığını girin.");
        sicaklik = input.nextInt();

        if(sicaklik >= 30) {
            System.out.println("Önerilen etkinlik  : YÜZME.");
        }
        else if (sicaklik >= 5) {
            System.out.println("Önerilen etkinlik : SİNEMA.");
        }
        else {
            System.out.println("Önerilen etkinlik : KAYAK.");
        }

    }
}
