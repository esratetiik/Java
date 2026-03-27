import java.util.Scanner;

public class KDVHesaplamaProgrami {
    public static void main (String[] args){
        double fiyat, kdvliFiyat;
        double kdv=0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün fiyatını girin: ");
        fiyat = input.nextDouble();
        kdvliFiyat = (fiyat*kdv) + (fiyat);

        System.out.println("Kdvli fiyat: " + kdvliFiyat);
    }

}