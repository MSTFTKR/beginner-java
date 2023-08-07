

/*Şuana kadar öğrendiklerimi test ediyorum*/

import java.util.Scanner; 


public class Depo {

    public static void main(String[] args) {
        stok Stok=new stok(5, 'S');
        
        ozellik Ozellik=new ozellik("Beyaz", "saten", "Dar");
        
        urun Urun=new urun("Beyaz rahat elbise", Stok, Ozellik);
        
        //Urun.getStok().adet();
        Scanner scanner=new Scanner(System.in);         
        System.out.println("satış adedini gir");
        int satisAdedi=scanner.nextInt();
        scanner.nextLine();
        Urun.getStok().satis(satisAdedi);
        Urun.getStok().adet();
        //Urun.bilgileriGoster();
        //Urun.getStok().bilgileriGoster();
        
       personel Personel=new personel("kalite kontrol", 115, "Mustafa", "Teker", "531215651", 15000);
        
        calisan Calisan=new calisan("Ali", "Must", "1515153", 555);
       
        Personel.bilgileriGoster();
        Personel.satisYap(satisAdedi);
        System.out.println("Güncel Satış adedi: "+Personel.getSatisAdedi());
        
      
    }
}
