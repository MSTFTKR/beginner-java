
public class account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    
    
    public account(){
        /*this.hesapNo="Bilgi Yok";
        this.bakiye=0;
        this.isim="Bilgi Yok";
        this.email="Bilgi Yok";
        this.telefonNo="Bilgi Yok";     */
        this("bilgis yok",0,"bilgi yok","bilgi yok","bilgi yok");
    }
    public account(String isim, String email, String telefonNo){
        /*this.hesapNo="Bilgilers yok";
        this.bakiye=0;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;*/
       this("bilgiler yok",0,isim,email,telefonNo);
      
    }
    
    
    public account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    
        
        
    }
    
    
    public void bilgiler(){
        System.out.println("bilgiler:"+this.email+this.bakiye+this.isim+this.hesapNo+this.telefonNo);
        
    }
    
    
    public void paraYatir(double miktar) {
        bakiye+=miktar;
        System.out.println("Yeni Bakiye"+bakiye);
    }
    public void paraCek(double miktar) {
        
        if (miktar>1500){
            System.out.println("br günde maks 1500");}
        if((bakiye-miktar)<0){
            System.out.println("o kadar paran yok. Bakiyen:"+bakiye);
            
        }
        else {
                
            bakiye-=miktar;
        System.out.println("Yeni Bakiye"+bakiye);}
    }
    
    
    
    
    
    public String getHesapNo() {
        return hesapNo;
    }

  
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
}
