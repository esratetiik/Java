public class Operatorler {
    public static void main (String[] args){
        int a=10;
        int b=5;
        int toplam=a+b;
        int cikarma=a-b;
        int carpma=a*b;
        int bölme=a/b;
        int  mod=a%b;
        System.out.println("Toplama : " + toplam
            + "\nÇıkarma : " + cikarma
            + "\nÇarpma : " + carpma
            + "\nBölme : " + bölme
            + "\nMod : " + mod);

        toplam++;
        System.out.println("Toplam yeni değer : " +toplam);

        boolean kosul = (a>b);
        System.out.println(kosul);

        String sonuc = (a==b) ? "Doğru" : "Yanlış";
        System.out.println(sonuc);
    
    }

}