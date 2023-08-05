
import java.util.Scanner;


public class atmislem {
    public void islem(hesap hesapCek){
       login Login=new login();
         
       
       Scanner scanner=new Scanner(System.in);
      
        System.out.println("bankama hoşgeldin");
        System.out.println("------------------");
        System.out.println("Kullanıcı girişi:");
        int girishak=3;
        while (true){
            if (Login.login(hesapCek)){
                System.out.println("giriş başarılı");  
                break;
            }
            else {
                System.out.println("giriş başarısız.");
                girishak-=1;
                System.out.println("Kalan hakkınız"+girishak);
                
            }
            if(girishak==0){
                System.out.println("giriş hakkımız bitti");
                return;
            }
        
        
        }
        System.out.println("------------");
        String islemler="1-Bakiye görüntüle\n"+"2-Para Yatır\n"+"3-Para Çek\n"+"q- Çıkış";
        
        while (true) {            
            System.out.println("İşlem Seç\n"+islemler);
            String islem=scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:"+hesapCek.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                
                hesapCek.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesapCek.paraCek(tutar);
            }
            else {
                System.out.println("hatli giriş yaptınız");
            }
            
           
        }
        
        
        
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
