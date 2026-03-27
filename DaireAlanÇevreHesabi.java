import java.util.Scanner;

public class DaireAlanÇevreHesabi {
    public static void main (String[] args){
        double r, alan,  cevre;
        int pi=3;
        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: ");
        r = input.nextDouble();
        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Dairenin çevresi: " + cevre
            + "\nDairenin alanı: " + alan);
    }

}