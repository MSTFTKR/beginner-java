
public class stok{
    private int stokAdet;
    private char beden; 

    public stok(int stokAdet, char beden) {
        this.stokAdet = stokAdet;
        this.beden = beden;
    }

    public int getStokAdet() {
        return stokAdet;
    }

    public void setStokAdet(int stokAdet) {
        this.stokAdet = stokAdet;
    }

    public char getBeden() {
        return beden;
    }

    public void setBeden(char beden) {
        this.beden = beden;
    }
    public void adet(){
        System.out.println(beden+" bedeninden "+stokAdet+" adet kalmıştır.");
        if (stokAdet<=3 && stokAdet>0){
            System.out.println("Stok Azaldı. Mevcut stok:"+stokAdet);
        }
        if (stokAdet<=0){
            System.out.println("Stok Bitti");
        }
    }
    public void bilgileriGoster(){
        System.out.println(stokAdet);
        System.out.println(beden);
     
        
    
    
    }
    public int satis(int satisAdedi){
        if(satisAdedi<=0){
             System.out.println("Geçersiz işlem");
         } 
        if(stokAdet<satisAdedi){
             System.out.println("Stok Yetersiz. İşlem iptal edildi. Mevcut stok:"+stokAdet);
         }
             
        else{
         
         stokAdet-=satisAdedi;
        }
        
        return stokAdet;
         
    }
    
    
}

