
import java.util.Scanner;


public class MemoryGame {
        private static card[][] cards=new card[4][4];
        
        
    public static void main(String[] args) {
        
         cards[0][0]=new card('E');
         cards[0][1]=new card('A');
         cards[0][2]=new card('B');
         cards[0][3]=new card('F');
         cards[1][0]=new card('G');
         cards[1][1]=new card('A');
         cards[1][2]=new card('D');
         cards[1][3]=new card('H');
         cards[2][0]=new card('F');
         cards[2][1]=new card('C');
         cards[2][2]=new card('D');
         cards[2][3]=new card('H');
         cards[3][0]=new card('E');
         cards[3][1]=new card('G');
         cards[3][2]=new card('B');
         cards[3][3]=new card('C');
        
        //gameBoard();
        while (isTheGameOver()==false){
            gameBoard();
            addGuess();
        }
        
        
    }
    
    
       
    public static void addGuess() {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Birinci Tahmin(i ve j değerlerini boşluklu olarak girin..):");
            int i1=scanner.nextInt();
            int j1=scanner.nextInt();
            cards[i1][j1].setGuess(true);
            gameBoard();
            
            System.out.println("ikinci Tahmin(i ve j değerlerini boşluklu olarak girin..):");
            int i2=scanner.nextInt();
            int j2=scanner.nextInt();
            cards[i2][j2].setGuess(true);
            gameBoard();
            
            if (cards[i1][j1].getValue()==cards[i2][j2].getValue()){
                System.out.println("Doğru tahmin");
            }
            else{
                System.out.println("Yanlış Tahmin");
                cards[i1][j1].setGuess(false);
                cards[i2][j2].setGuess(false);
            }
        
    }
    public static boolean isTheGameOver(){
            
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              
                if (cards[i][j].isGuess()==false) {
                    return false;
                }
                
            }
            
        }
        return true;
    
    }
    
    
    public static void gameBoard() {
        for (int i = 0; i < 4; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < 4; j++) {
                
                
                if(cards[i][j].isGuess()==true){
                    System.out.print(" |"+cards[i][j].getValue()+"| ");
                }
                else {
                    System.out.print(" | | ");
                }
                
            }
            System.out.println("");
            
        }
        System.out.println("--------------------");
    }
}
