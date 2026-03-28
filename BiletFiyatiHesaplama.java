
import java.util.Scanner;

public class BiletFiyatiHesaplama{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int km,yas,tip;

        System.out.println("Mesafeyi girin.");
        km = input.nextInt();
        System.out.println("\nYaşı girin.");
        yas = input.nextInt();
        System.out.println("\nTek gidiş için 1, gidiş dönüş için 2 girin.");
        tip = input.nextInt();

        double fiyat;
        fiyat = km*0.10;

        if (yas<12) {
            fiyat = fiyat*0.5; // 12 yaş altına yüzde elli indirim
        }
        else if  (yas>=12 && yas<=24) {
            fiyat = fiyat * 0.9; // 12-24 arasına yüzde 10 indirim
        }
        else if (yas>65) {
            fiyat = fiyat * 0.7; // 65 yaş üstüne yüzde 30 indirim 
        }

        if (tip == 2){
            fiyat = fiyat*0.8;
        }

        System.out.println("Bilet fiyatınız : " + fiyat);



    }
}
