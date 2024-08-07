import java.util.*;
//Reverse the String using recursion 
public class ques17 {

    public static String reverseString(int index , String s){
        String ans = ""; 
        if(index < 0){
          return ans; 
        }
    
        ans += s.charAt(index) + reverseString(index-1,s); 
        return ans; 
      }

    public static void main (String[]args){
       String s = "abcd"; 
       String ans = reverseString(s.length()-1, s); 
       System.out.println(ans);
    }
}
