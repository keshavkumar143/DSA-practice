import java.util.*; 
//Tower of Hanoi
//Time complexcity: O(2^n-1) || O(2^n)
public class ques20 {
    public static void towerOfHanoi(int n, String source, String helper, String Destination){

        if(n==1){
           System.out.println("transfer disk " + n + " from " + source + " to " +Destination);
          return; 
        }
          
        towerOfHanoi(n-1, source, helper, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " +Destination); 
    
        towerOfHanoi(n-1, helper, source, Destination);
      }
      
      
      public static void main(String[] args) {
        int n = 2; 
        towerOfHanoi(n, "S", "H", "D");
      }
}
