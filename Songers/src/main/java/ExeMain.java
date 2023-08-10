
import java.util.Scanner;


public class ExeMain {
    private static Songers songers=new Songers();
    private static Scanner scanner=new Scanner(System.in);
    
    
    public static void makeProcess(){
    
        System.out.println("0-İşlemleri Görüntüle");
        System.out.println("1-Şarkıcıları Görüntüle");
        System.out.println("2-Şarkıcı Ekle");
        System.out.println("3-Şarkıcı Güncelle");
        System.out.println("4-Şarkıcı Sil");
        System.out.println("5-Şarkıcı Ara");
        System.out.println("6-Çıkış");
        
    
    }
    
    public static void main(String[] args) {
        
        
        System.out.println("\t Şarkıcı uygulamasına hoşgeldin");
        
        makeProcess();
        
        boolean close=false;
        int choice;
        
        while(!close){
            System.out.println("işlem seç:");
            choice=scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 0:
                    makeProcess();
                    break;
                default:
                case 1:
                    songers.showSongers();
                    break;
                    
                case 2:
                    System.out.println("Eklemek İstediğiniz sanatöıyı yazın.");
                    String name=scanner.nextLine();
                    songers.addSonger(name);
                    break;
                    
                case 3:
                    System.out.println("Güncellemek istediğiniz indexi Yazınız");
                    int index=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Şarkıcıyı Yazınız");
                    String newName=scanner.nextLine();
                    songers.updateSonger(index, newName);
                    break;
                    
                case 4:
                        System.out.println("Sİlmek istediğiniz şarkıcının indecini giriniz.");
                        int position=scanner.nextInt();
                        songers.removeSonger(position);
                    break;
                    
                case 5:
                        System.out.println("şarkıcı ara");
                        String songerName=scanner.nextLine();
                        songers.findSonger(songerName);
                        
                    break;
                
                case 6:
                       System.out.println("Çıkış Yapılıyor");
                       close=true;
                    break;
                
            }
        } 
    }
}
