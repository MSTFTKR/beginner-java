
public class personel extends calisan{
    private String departman;
    private int satisAdedi; 

    public personel(String departman, int satisAdedi, String isim, String soyisim, String telefon, int maas) {
        super(isim, soyisim, telefon, maas);
        this.departman = departman;
        this.satisAdedi = satisAdedi;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSatisAdedi() {
        return satisAdedi;
    }

    public void setSatisAdedi(int satisAdedi) {
        this.satisAdedi = satisAdedi;
    }
    public int satisYap(int satisAdedi){
        return this.satisAdedi+=satisAdedi;
    
    }
    
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println(departman);
        System.out.println(super.getIsim()+" "+ satisAdedi+ " adet sattı");
    }
    
    
}
