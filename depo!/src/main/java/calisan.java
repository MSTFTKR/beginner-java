
public class calisan {
    private String isim;
    private String soyisim; 
    private String telefon;
    private int maas;
    

    public calisan(String isim, String soyisim, String telefon, int maas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.telefon = telefon;
        this.maas=maas;
    }
    public void bilgileriGoster(){
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(telefon);
        System.out.println(maas);
        
    }
        
    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelegon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
    
    
}
