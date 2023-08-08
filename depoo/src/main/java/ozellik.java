
public class ozellik {
    private String renk;
    private String kumas;
    private String kalip;
    

    public ozellik(String renk, String kumas, String kalip) {
        this.renk = renk;
        this.kumas = kumas;
        this.kalip = kalip;
        
    }

    public void bilgileriGoster(){
        System.out.println(renk);
        System.out.println(kalip);
        System.out.println(kumas);
        
    
    
    }
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKumas() {
        return kumas;
    }

    public void setKumas(String kumas) {
        this.kumas = kumas;
    }

    public String getKalip() {
        return kalip;
    }

    public void setKalip(String kalip) {
        this.kalip = kalip;
    }
    
    
}
