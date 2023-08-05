

public class hayvan {
  private String isim;
  private int kilo;
  private int boy;
  private int ayakSayisi;

    public hayvan(String isim, int kilo, int boy, int ayakSayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.ayakSayisi = ayakSayisi;
    }
    
    public void yemekYe(){
        System.out.println("Hayyvan yemek ior şuan");
    }
    public void hareketeGec(int hiz){
        System.out.println("Hayvan "+hiz+" km hız ile hareker ediyor..");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    
    
}
