/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class employee {
    private String ad;
    private String soyad;
    private int id;

    public employee(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    public void bilgileriGoster(){
            System.out.println("Çalışan Bilgileri");
            System.out.println("ad: "+ad);
            System.out.println("Soyad: "+soyad);
            System.out.println("id"+id);
    }
            
            
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
