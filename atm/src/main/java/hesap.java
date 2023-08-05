/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int miktar){
        this.bakiye+=miktar;
        System.out.println("Yeni bakie:"+this.bakiye);
    }
    public void paraCek(int miktar){
    if (miktar>this.bakiye){
        System.out.println("Bakiyeniz Yetersiz. Mevcut bakiyebiz:"+this.bakiye);
    }
    if(miktar>1500){
        System.out.println("bir günde maksimum 1500 tl çekebilirsiniz");
    }    
    else {
        this.bakiye-=miktar;
        System.out.println("yeni bakiyeniz"+this.bakiye);
    }
    
    
    }
    
}
