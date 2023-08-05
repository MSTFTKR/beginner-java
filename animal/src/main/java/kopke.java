
public class kopke extends hayvan{
    private int disSayisi;
    
    public kopke(String isim, int kilo, int boy, int ayakSayisi,int disSayisi ){
    super(isim,kilo,boy,ayakSayisi);
    this.disSayisi=disSayisi;
    
    
    }
    public void hareketeGec(int hiz){
        System.out.println("Köpek "+hiz+" km hız ile hareker ediyor..");
    }
    public void kos(int hiz){
        System.out.println("köpek koşuyor");
        hareketeGec(hiz);
    }        
           
    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
    
}
