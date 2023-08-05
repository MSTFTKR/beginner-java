
public class Yonetici extends Calisan{ //subclass
    
    private int sorumluOlduguKisi;
    
    public Yonetici(String isim, int maas, String departman,int sorumluOlduguKisi){
        /*this.isim=isim;
        this.maas=maas;
        this.departman=departman;*/
        super(isim, maas, departman);
        this.sorumluOlduguKisi=sorumluOlduguKisi;
        
    }
    public void zamYap(int zamMiktarı){
        System.out.println("Çalışanlara "+zamMiktarı+" TL Zam Yapıldı");
    }
    public void bilgileriGoster(){
        /*System.out.println("isim:"+getIsim());
        System.out.println("Maaş:"+getMaas());
        System.out.println("Departman:"+getDepartman());*/
        super.bilgileriGoster();
        System.out.println("Sorumlu Olduğu Çalışan Sayını:"+sorumluOlduguKisi);
    }

    public int getSorumluOlduguKisi() {
        return sorumluOlduguKisi;
    }

    public void setSorumluOlduguKisi(int sorumluOlduguKisi) {
        this.sorumluOlduguKisi = sorumluOlduguKisi;
    }
    
    
}
