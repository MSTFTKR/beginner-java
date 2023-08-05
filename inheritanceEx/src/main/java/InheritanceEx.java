/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author musta
 */
public class InheritanceEx {

    public static void main(String[] args) {
        Yonetici yonetici1=new Yonetici("Mustafa", 15000, "IT",5);
        yonetici1.bilgileriGoster();
        yonetici1.zamYap(500);
        System.out.println(yonetici1.getSorumluOlduguKisi());
    }
}
