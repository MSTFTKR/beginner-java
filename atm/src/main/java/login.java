
import java.util.Scanner;


public class login {
    public boolean login(hesap hesapcek) {
        Scanner scanner =new Scanner(System.in);
            System.out.println("kullanıcı adınızı giriniz");
            String kullaniciAdi=scanner.nextLine();
            System.out.println("Parolanını giriniz");
            String parola=scanner.nextLine();
        
            if(hesapcek.getKullaniciAdi().equals(kullaniciAdi)&& hesapcek.getParola().equals(parola)){
             return true;
            }
                       
            else {
                
                return false;
            }
            
    }



}
