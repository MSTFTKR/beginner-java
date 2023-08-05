
public class Composition {

    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920, 1080);
        Monitor monitor=new Monitor("VS197DE", "Asus", "18.5", resolution);
        
        Kasa kasa =new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        
        Anakart anakart=new Anakart("b250-Pro", "Asus", 10, "Windows 10");
        
        Bilgisayar bilgisayar=new Bilgisayar(monitor, kasa, anakart);
        
        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getMonitor().MonitoruKapat();
        bilgisayar.getAnakart().isletimSistemiYukle("Ubuntuu");
    }
}
