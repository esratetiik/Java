

public class Donguler {
    public static void main (String[] args){

        System.out.println("While Döngüsü");


        int i=0;
        while(i<=10) {
            System.out.print(i + "  ");
            i++;
        }
        
        System.out.println();


        System.out.println("Do-While Döngüsü");
        int a = 10;
        do {
            System.out.print(a + "  ");
            a++;
        }while (a <= 10);

        System.out.println();
        
        System.out.println("For Döngüsü");

        for(int b=1; b<=10; b++){
            System.out.print(b + "  ");
        } 
        for(int c=1; c<=5; c++){
            for(int d=1; d<=5; d++){
                System.out.print(c + "  "  + d + "  ");
            }
        }
        System.out.println();

        for(int k=0; k<=10; k++){
            
            if(k == 5){
                break;      // 5' kadar yazdırır.
            }else {
                System.out.println(k);
            }
        }

        System.out.println();
        
        for(int l=0; l<=10; l++){
            
            if(l == 5){
                continue;      // 5'i atlar.
            }else {
                System.out.println(l);
            }
        }



    }
}
