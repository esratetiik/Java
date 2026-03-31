import java.util.Scanner; 

public class Atm_Projesi {
    public static void main (String[] args){
        int bakiye = 1000, input, miktar;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Güncel Bakiye : 1000 TL");

        while(bakiye>0) {
            System.out.println ("1.Para Yatır");
            System.out.println ("2.Para Çek");
            System.out.println ("3.Bakiye Sorgula");
            System.out.println ("4.Çıkış Yap");
            System.out.println ("Yapmak istediğiniz işlemi seçiniz.");
            input = scan.nextInt();

            if (input==1){
                System.out.println ("Yatırmak istediğiniz miktarı giriniz.");
                miktar = scan.nextInt();
                bakiye += miktar;
                
            }
            else if(input == 2){
                System.out.println ("Çekmek istediğiniz miktarı giriniz.");
                miktar = scan.nextInt();
                if(miktar>bakiye){
                    System.out.println ("Yeterli bakiye yok.");
                }else {
                    bakiye -= miktar;
                }
                
                
            }
            else if(input == 3){
                System.out.println ("Güncel bakiye: " + bakiye);
            }
            else if (input == 4){
                break;
            }
        }


    }
}
