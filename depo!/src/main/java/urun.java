
public class urun {
    private String isim;
    private stok Stok;
    private ozellik Ozellik;

    public urun(String isim, stok Stok, ozellik Ozellik) {
        this.isim = isim;
        this.Stok = Stok;
        this.Ozellik = Ozellik;
    }
    
    
    public void bilgileriGoster(){
        System.out.println(isim);
        System.out.println(Stok.getBeden());
        System.out.println(Stok.getStokAdet());
        System.out.println(Ozellik.getKalip());
        System.out.println(Ozellik.getKumas());
        System.out.println(Ozellik.getRenk());
    
    
    }
    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public stok getStok() {
        return Stok;
    }

    public void setStok(stok Stok) {
        this.Stok = Stok;
    }

    public ozellik getOzellik() {
        return Ozellik;
    }

    public void setOzellik(ozellik Ozellik) {
        this.Ozellik = Ozellik;
    }
    
    
}
