import java.util.Scanner;

public class NotOrtalamasiProgrami {
    public static void main (String[] args){
        int quiz, vize, finall;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println ("Quiz notunu giriniz: ");
        quiz = input.nextInt(); 
        System.out.println ("vize notunu giriniz: ");
        vize = input.nextInt();
        System.out.println ("Final notunu giriniz: ");
        finall = input.nextInt();

        ortalama = (quiz*0.2) + (vize*0.2) + (finall*0.6);
        System.out.println("Not Ortalamanız: "+ ortalama);
        String sonuc = (ortalama>=50) ? "GEÇTİNİZ" : "KALDINIZ";
        System.out.println(sonuc);
    }

}