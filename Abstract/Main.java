

public class Main {

    public static void main (String[] args){

       // Akademisyen a = new Akademisyen("Esra","tetikesra48@gmail.com", "05555555555", "bilgisayar", "lab","java");
       // a.giris();
        Calisan c = new Calisan("Efe", "efe@gmail.com", "5033335555");
        c.giris();
        Memurlar m = new Memurlar("Tuğçe", "tugce@gmail.com", "05333333333", "kalite", 50);
        m.giris();

        Calisan[] girisListesi = {c,m};
        Calisan.listele(girisListesi);
    }
    

}