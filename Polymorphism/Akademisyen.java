
public class Akademisyen extends Calisan{
    
    String bolum, gorevler;
    String ders;

    public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders){
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler  = gorevler;
        this.ders = ders;
    }

    public void giris(){
        System.out.println(this.adSoyad + " akademisyen girişi yaptı.");
    }

   
}
