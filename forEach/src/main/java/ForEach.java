
public class ForEach {

    public static void main(String[] args) {
        String[] array={"armut","elma","Muz"};
        int[] array2={1,2,5,6,7,8,8};
        ex array1=new ex("musafa");
        
        ex[] arrays3={new ex("ali"),new ex("Mustafa"),new ex("MEhmet")};
        
        for (ex d: arrays3){
            d.yaz();
           
        }
       
        /*for(int b: array2){
             System.out.println(b);  
        }
        
        for(String a: array){
             System.out.println(a);  
        }*/
      
        
    }
}
