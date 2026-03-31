import java.util.Scanner; 

public class Ornekler {
    public static void main (String[] args){

        /* 
        // Örnek 1: Faktöriyel Hesabı
        int i, sonuc=1;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        for (int k=1; k<=i; k++){
            sonuc *= k;
        }
        System.out.println(sonuc);

        */

        /* 
        // Harmonik Sayılar 
        double i;
        double sonuc=0;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        for(double k=1; k<=i; k++){
            sonuc += 1/k;
        }
        System.out.println(sonuc);
        */

/* 
        //Yıldızlarla Üçgen Yapma
        int star;
        Scanner input = new Scanner(System.in);
        star = input.nextInt();
        int i=1;
        while (i<=star) {
            int k=1;
            while(k<=i){
                System.out.print(" * ");
                k++;
            }
            System.out.println();
            i++;
        }

        */

        /* 
        //Üslü sayı Hesaplama
        int taban,us, sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Tabanı giriniz.");
        taban = input.nextInt();
        System.out.println("Üssü giriniz.");
        us = input.nextInt();
        
        
        int a=1;
        while (a<=us){
            sonuc *= taban;
            a++;
        }
         System.out.println(sonuc);
        */

        /* 
        // Negatif değer girilene kadar kullanıcıdan alınan sayılardan sadece çift olanları toplayam program
        int i, toplam = 0;
        Scanner scan = new Scanner (System.in);

        do{
            System.out.println("Lütfen sayı giriniz.");
            i=scan.nextInt();
            if(i % 2 == 0 && i >= 0) {
                toplam += i;
            }
            
        } while(i>=0);
        System.out.println(toplam);
*/
/* 
        // Asal sayı mı bulma
        Scanner input = new Scanner (System.in);
        int i;
        boolean asal = true;
        System.out.println("Sayı girin.");
        i=input.nextInt();
        for (int k=2; k< i; k++){
            if (i % k == 0){
                asal = false;
                break;
            }
        }
        if (asal){
            System.out.println("Girilen sayı asal.");
        }else {
            System.out.println("Girilen sayı asal değildir.");
        }
        */


        /* 
        //Fibonacci Serisi
        Scanner scan = new Scanner (System.in);
        System.out.println("Sayı girin.");
        int input = scan.nextInt();
        int s1=0,s2=1,toplam;

        for (int i=1;i<=input; i++){
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2=toplam;
        }

        */
       /*
       // Ebob - Ekok

        Scanner scan = new Scanner (System.in);
        int s1, s2, ebob =1, ekok;
        System.out.println("Sayıları girin");
        s1 = scan.nextInt();
        s2 = scan.nextInt();

        int min = (s1<s2) ? s1 : s2;
        for (int i=min ; i>0 ; i--){
            if ((s1%i==0) && (s2%i==0)){
                ebob = i;
                break;
            }
        }
        ekok = (s1*s2) / ebob;
        System.out.println("Ekok: " + ekok);
        System.out.println("Ebob: " + ebob);

 */


    }
}
