class hayvan{
    private String isim;

    public hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
     return "hayvan konuşuyor";
    
    }

}


class kedi extends hayvan{

    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Miavlıyor...";
    }

}

class kopek extends hayvan{

    public kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Havlıyor...";
        
    }
}

class at extends hayvan{

    public at(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Kişniyor...";
        
    }
}

public class Polymorphism {
    public static void konustur(hayvan Hayvan){
        System.out.println(Hayvan.konus());
    }
    
            
            
    public static void main(String[] args) {
        /*hayvan Hayvan=new hayvan("Lucky");
        System.out.println(Hayvan.konus());
        
         hayvan Hayvan=new kedi("Lucky");
        System.out.println(Hayvan.konus());*/
        
        konustur(new kedi("kedi "));
        konustur(new kopek("köpek "));
        konustur(new at ("at "));
    }
}
