public class Atm {

    public static void main(String[] args) {
        atmislem ATMislem=new atmislem();
        hesap Hesap=new hesap("Mustafa", "mstf123", 2000);
        
                ATMislem.islem(Hesap);
                
        System.out.println("programdan çıkılıyor");
    }
}
