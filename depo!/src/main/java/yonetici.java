public class yonetici extends calisan{
    private String kademe;

    public yonetici(String kademe, String isim, String soyisim, String telefon, int maas) {
        super(isim, soyisim, telefon, maas);
        this.kademe = kademe;
    }

    public String getKademe() {
        return kademe;
    }

    public void setKademe(String kademe) {
        this.kademe = kademe;
    }
    public void zamYap(int zamMiktari){
        System.out.println(getIsim()+" Çalışanlara "+zamMiktari+" kadar maaş arttırdı");
        
    } 
       
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println(kademe+".kademeden yönetici");
        
    }
    
    
}
