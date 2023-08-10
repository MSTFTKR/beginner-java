
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<String>();
        
        
        arrayList.add("Merhaba");
        arrayList.add("Nasılsın");
        arrayList.add("İyi Misin");
        arrayList.add("Günler Nasıl Geçiyor");
        arrayList.add("İyi Misin");
        
        
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size()); //arrayLİst boyutu
        arrayList.set(0, "Selam"); //güncellme,ilk deişim indexi , 2.yeni değer
        //arrayList.remove(3);     //direk "" şekilde ifade yazarak yada indexi yazarak silinebilirç
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            
        }
        //System.out.println(arrayList.indexOf("İyi Misin")); //ilk listede 2 tane aynı varsa ilkinin indexini verir
        //System.out.println(arrayList.lastIndexOf("İyi Misin")); // sondan başlayarak arar ilk buldudğu indexi gösterir.
        //System.out.println(arrayList.lastIndexOf("Merhaba"));
        /*ArrayList<Integer> arrayListsss= new ArrayList<Integer>();
        arrayListsss.add(5);
        arrayListsss.add(3);
        arrayListsss.add(1);
        
       
        for (int i = 0; i < arrayListsss.size(); i++) {
            System.out.println(arrayListsss.get(i));
            
        }*/
        
      
    }
}
