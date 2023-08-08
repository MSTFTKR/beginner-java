
public class islemler {
    public calisan classSec(String isim){
     if(isim.equals("personel")){
            return new personel("mağaza satış", 15, "Mustafa", "Tek", "1563", 20000);
            
           
        }
     
        if(isim.equals("yonetici")){
            return new yonetici("2", "Alparslan", "Tek", "21234520", 100000);
        } 
    
        else{
        return null;
        }
    }
    
}
