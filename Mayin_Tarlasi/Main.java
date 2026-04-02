import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        System.out.println("Mayın tarlasına hoşgeldiniz. Lütfen oynamak istediğiniz boyutları giriniz: ");
        Scanner scan = new Scanner(System.in);
        int row, col;
        row = scan.nextInt();
        col = scan.nextInt();
        
        MayinTarlasi mayin = new MayinTarlasi(row, col);
        mayin.run();
    }

    
}