
import java.util.Scanner;

public class Metods {

    public static void main(String[] args) {
        selam();
        //fakt();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("isim gir");
        //String isimm=scanner.nextLine();
        //parameter(isimm); 
        //topla(5, 02, 07);
        System.out.println(topla(5, 7, 5));
        isimpuan(50,"saa");
    }
    
    public static void selam(){
        System.out.println("selam");
        System.out.println("dostum");
    }
    public static void fakt() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi= scanner.nextInt();
        int i;
        int gecici=1;
        for (i=1; i<=sayi; i++){
            gecici*=i;
        }
        System.out.println(gecici);
        
    }
    public static void parameter(String isim){
    
           System.out.println("selam"+isim);    
    }
    public static int topla(int a, int b, int c) {
        //System.out.println("toplam:"+ (a+b+c));
        return a+b+c;
    }
    public static void isimpuan(String ad, int puan, String soyad) {
        System.out.println(ad+puan+soyad);
    }
    public static void isimpuan(int puan, String soyad) {
        System.out.println(puan+soyad);
    }    
    public static void isimpuan(String ad, int puan) {
        System.out.println(ad+puan);
    }       
            
            
}
