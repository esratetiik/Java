

public class Math_String_Kutuphaneleri {
    
    public static void main(String[] args){

        System.out.println(Math.ceil(1.1));
        System.out.println(Math.cos(60));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.max(1.1,2.8));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.round(1.4));
        System.out.println(Math.abs(-1));
        System.out.println(Math.sqrt(16));

        System.out.println();

        String metin = "CODING";
        String metin1 = "TIME";
        System.out.println(metin.length());
        System.out.println(metin.concat(metin1));
        System.out.println(metin.indexOf('O'));
        System.out.println(metin.charAt(3));
        System.out.println(metin.contains("ODIN"));
        System.out.println(metin.endsWith("ING"));
        System.out.println(metin.toLowerCase());
    }
}
