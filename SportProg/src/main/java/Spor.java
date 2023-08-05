
public class Spor {
     private int burpeeSayisi;
     private int pushupSayisi;
     private int situpSayisi;
     private int squatSayisi;

    public Spor(int burpetSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpetSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpetSayisi) {
        this.burpeeSayisi = burpetSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
     
    public void hareketYap(String hareketTuru, int sayi){
        if (hareketTuru.equals("burpee")){
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("pushup")) {
            pushupYap(sayi);   
        }
        else if (hareketTuru.equals("situp")) {
            situpYap(sayi);   
        }
        else if (hareketTuru.equals("squat")) {
            squatYap(sayi);   
        }
        else {
            System.out.println("Geçersiz Seçim");}
        
    }
    public void burpeeYap(int sayi){
    if(burpeeSayisi==0){
        System.out.println("burpee bitti");
    }
    if(burpeeSayisi-sayi<0){
        System.out.println("hedeflediğini geçtin tebrikler");
        burpeeSayisi=0;
        System.out.println("kalan burpee sayisi"+burpeeSayisi);
    }
    else {
    burpeeSayisi-=sayi;
    System.out.println("kalan burpee sayisi"+burpeeSayisi);
    }
    
    }
     public void pushupYap(int sayi){
    if(pushupSayisi==0){
        System.out.println("pushup bitti");
    }
    if(pushupSayisi-sayi<0){
        System.out.println("hedeflediğini geçtin tebrikler");
        pushupSayisi=0;
        System.out.println("kalan pushup sayisi"+pushupSayisi);
    }
    else {
    pushupSayisi-=sayi;
    System.out.println("kalan pushup sayisi"+pushupSayisi);
    }
    } public void situpYap(int sayi){
    if(situpSayisi==0){
        System.out.println("situp bitti");
    }
    if(situpSayisi-sayi<0){
        System.out.println("hedeflediğini geçtin tebrikler");
        situpSayisi=0;
        System.out.println("kalan situp sayisi"+situpSayisi);
    }
    else {
    situpSayisi-=sayi;
    System.out.println("kalan situp sayisi"+situpSayisi);
    }
    
    }
    public void squatYap(int sayi){
    if(squatSayisi==0){
        System.out.println("squat bitti");
    }
    if(squatSayisi-sayi<0){
        System.out.println("hedeflediğini geçtin tebrikler");
        squatSayisi=0;
        System.out.println("kalan squat sayisi"+squatSayisi);
    }
    else {
    squatSayisi-=sayi;
    System.out.println("kalan squat sayisi"+squatSayisi);
    }
    
    }
    
    
    public boolean kontrol(){
    
    return (burpeeSayisi==0)&&(pushupSayisi==0)&&(situpSayisi==0)&&(squatSayisi==0);
    }
    
    
    
    
    
    
    
}
