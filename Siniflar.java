public class Siniflar {
    
    public static void main(String[] args){

        Makine makine1 = new Makine(1,3);
        Makine makine2 = new Makine(4,2);

        System.out.println(makine1.sayi1);
        System.out.println(makine1.sayi2);
        System.out.println(makine2.sayi1);
        System.out.println(makine2.sayi2);
        System.out.println();

        makine1.sayi1 = 5;
        makine1.sayi2 = 10;

        makine2.sayi1 = 40;
        makine2.sayi2  =20;

        System.out.println(makine1.sayi1);
        System.out.println(makine1.sayi2);
        System.out.println(makine2.sayi1);
        System.out.println(makine2.sayi2);
        System.out.println();

        System.out.println(makine1.toplama());
        System.out.println(makine2.bolme());


    }
}
