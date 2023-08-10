
import java.util.ArrayList;


public class Songers {
    private ArrayList<String> SongersList=new ArrayList<String>();
    
    public void showSongers(){
        
        System.out.println("Şarkıcılar listesinde "+SongersList.size()+" kadar şarkıcı var");
        for (int i = 0; i < SongersList.size(); i++) {
            System.out.println((i+1)+". Şarkıcı :"+SongersList.get(i));
            
        }
    }
    
    public void addSonger(String name){
        SongersList.add(name);
        
        System.out.println("Şarkıcı Listesi GÜncellendi");
    
    
    }
    
    public void removeSonger(int position){
        String name=SongersList.get(position);
        SongersList.remove(position);
        System.out.println(name+" isimli şarkıcı listeden silindi...");
    }
    
    
    
    public void updateSonger(int index,String newName){
        SongersList.set(index, newName);
        System.out.println("Şarkıcı Listesi GÜncellendi");
    
        
    }
    public void findSonger(String songerName){
        
        int position=SongersList.indexOf(songerName);
        
        if(position==(-1)){
            System.out.println("Böyle bir şarkıcı bulunmuyor..");
        }
        else {
            System.out.println(songerName+" isimli şarkıcı"+(position+1)+". sırada..");
        }
    
    }
    
}
