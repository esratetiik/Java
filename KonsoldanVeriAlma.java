import java.util.Scanner;

public class KonsoldanVeriAlma {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını girin: ");
        a = input.nextInt();
        System.out.println("B sayısını girin : ");
        b = input.nextInt();
        System.out.println("A  sayısı = " + a
            + "\nB sayısı = " + b); 

        double c;
        System.out.println("Double türünde veri girin: ");
        c = input.nextDouble(); //girerken virgüllü girmemiz gerek ama ekrana yazdırırken noktalı bastırıyor.
        System.out.println(c);

        String str;
        str = input.nextLine(); // Line dediğimizde girilen satırı komple alır. Sadece next derrsem ilk boşluğa kadar olan kısmı alır.
        System.out.println(str);
    }

}