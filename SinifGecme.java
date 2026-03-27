
import java.util.Scanner;

public class SinifGecme{
    public static void main(String[] args){
        int T, M, F, S, B;
        Scanner input = new Scanner(System.in);

        System.out.println("Sırasıyla Türkçe, Matematik, Fen bilgisi, Sosyal Bilimler ve Beden Eğitimi notlarınızın girin.");
        T = input.nextInt();
        M = input.nextInt();
        F = input.nextInt();
        S = input.nextInt();
        B = input.nextInt();
        
        double ortalama;
        ortalama = (T+M+F+S+B)/5;

        if(ortalama>=50){
            System.out.println("Ortalama: " + ortalama + " Tebriksss. Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Ortalama: " + ortalama + " Maalesef sınıfda kaldınız. Lütfen gelecek yıl daha çok çalışın.");
        }



    }
}
