public class Calisan {
    
    protected String adSoyad, eposta;
    protected String telefon;
    

    public Calisan (String adSoyad, String eposta, String telefon){
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta; 
    }

    protected void giris(){
        System.out.println(this.adSoyad + " çalışan girişi yaptı.");
    }

    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public String geteposta(){
        return eposta;
    }
    public void setEposta(String eposta){
        this.eposta = eposta;
    }
    public String gettelefon(){
        return telefon;
    }
    public void settelefon(String telefon){
        this.telefon = telefon;
    }

    
    

}
