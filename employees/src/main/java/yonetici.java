
public class yonetici extends employee{
    private int sorumluKisiSayisi;

    public yonetici(String ad, String soyad, int id,int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi=sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();  
        System.out.println("Sorumlu Kisi Sayisi:"+this.sorumluKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd()+"Çalışanlara "+ zamMiktari+" TL zamn yaptı");
    
    }
}
