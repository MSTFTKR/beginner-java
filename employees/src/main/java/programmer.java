/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class programmer extends employee{
    private String bildigiDil;
    public programmer(String ad, String soyad, int id, String bildigiDil) {
        super(ad, soyad, id);
        this.bildigiDil=bildigiDil;
    }
    public void formatAt(String işletimSistemi){
    System.out.println(getAd()+" "+işletimSistemi+ "'ni yüklyor ");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Bildiği Diller:"+this.bildigiDil);
    
    
    }
}
