
import java.util.Scanner;

public class Employees {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar Programına hosgeldin");
        String islemler="işlemler...\n"
                +"1-Yazılımcı işlemleri \n"
                +"2-Yönetici işlemleri\n"
                +"q-Çıkış";
        System.out.println("----------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------");
        
        while (true) {            
            System.out.println("İşleminizi seçin:");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (islem.equals("1")){
                 programmer Programmer=new programmer("Mustafa", "Teker", 4242, "php,java");
                     String yazilimciislem="işlemler...\n"
                             +"1-Format att \n"
                             +"2-bilgileri göster\n"
                             +"q-Çıkış";
                     System.out.println("----------------------------");
                     System.out.println(yazilimciislem);
                     System.out.println("----------------------------");
        
                 while (true) {                    
                    System.out.println("İşleminizi seçin:");
                    String islemsecimi=scanner.nextLine();
                    
                    if(islemsecimi.equals("q")){
                       System.out.println("Programdan çıkılıyor");
                        break;
                        }
                    else if (islemsecimi.equals("1")){
                        System.out.println("İşletm sistemi:");
                        String isletimsistemi=scanner.nextLine();
                        
                        Programmer.formatAt(isletimsistemi);
                        
                        
                        }
                    else if (islemsecimi.equals("2")){
                        Programmer.bilgileriGoster();
                        }
                    else{ 
                        System.out.println("Geçersiz işlem");
                    }
                    
                }
            }
                        else if (islem.equals("2")){
                             yonetici Yonetici=new yonetici("Ramazan", "Teker", 245, 20);
                                 String yoneticiislem="işlemler...\n"
                                         +"1-zam yap \n"
                                         +"2-bilgileri göster\n"
                                         +"q-Çıkış";
                                 System.out.println("----------------------------");
                                 System.out.println(yoneticiislem);
                                 System.out.println("----------------------------");

                        while (true) {                    
                                System.out.println("İşleminizi seçin:");
                                String islemsecimi=scanner.nextLine();

                                if(islemsecimi.equals("q")){
                                   System.out.println("Programdan çıkılıyor");
                                    break;
                                    }
                                else if (islemsecimi.equals("1")){
                                    System.out.println("zam miktari:");
                                    int zamMiktari=scanner.nextInt();
                                    scanner.nextLine();

                                    Yonetici.zamYap(zamMiktari);


                                    }
                                else if (islemsecimi.equals("2")){
                                    Yonetici.bilgileriGoster();
                                    }
                                else{ 
                                    System.out.println("Geçersiz işlem");
                                }
                        }
                        }
            else{
                System.out.println("Geçersiz işlem");
            }
            
                       
                        
                        
        }
    }
}
        
    

