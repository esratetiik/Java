import java.util.Scanner; 

public class Palindrom_Sayilar {

    static boolean isPalindrom (int input){
        int temp, tersSayi = 0, kalan;
        temp =input;

        while (temp != 0){
            kalan = temp % 10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;
        }
        if (tersSayi == input)
            return true;
        else 
            return false;

    }

    

    public static void main (String[] args){
        System.out.println(isPalindrom(123));
        System.out.println(isPalindrom(1221));

    }
    

    
}
