
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author musta
 */
import java.util.Scanner;
public class SportProg {

    public static void main(String[] args) {
    
        Scanner scanner=new Scanner(System.in);
        System.out.println("Spor programına hşgeldin");
        String hareketler = "Geçerli hareketler\n+"
                            + "burpee\n+"
                            + "Pushup\n+"
                            + "Situp\n+"
                            +"squat\n";
        System.out.println(hareketler);
        System.out.println("program oluştur");
        System.out.println("burpee sayısı:");
        int burpee=scanner.nextInt();
        System.out.println("pushup sayısı:");
        int pushup=scanner.nextInt();
        System.out.println("situp sayısı:");
        int situp=scanner.nextInt();
        System.out.println("squat sayısı:");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Spor spor =new Spor(burpee, pushup, situp, squat);
        
        System.out.println("Program başlıyor...");
        while (spor.kontrol()==false) {
            System.out.println("Hareket Türü(burpee,pushup,situp,squat");
            String tur=scanner.nextLine();
            System.out.print("kaç tane yapmak istiyorsun");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            spor.hareketYap(tur, sayi);
            
            
        }
    }
    
}
