public class Memurlar extends Calisan {
    String departman;
    int mesai;

    public Memurlar (String adSoyad, String eposta, String telefon, String departman, int mesai){
        super(adSoyad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }

    public void giris(){
        System.out.print("Memur olarak ");
        super.giris() ;
        
    }
}
