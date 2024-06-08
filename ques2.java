//check weather Strings are anagram or not
//LEETCODE LINK --> https://leetcode.com/problems/valid-anagram/
import java.util.*;
import java.util.Arrays;

public class ques2 {

     public static boolean isAnagram(String s, String t) {

      char arr[] = s.toCharArray();
      char arr2[] = t.toCharArray(); 

    Arrays.sort(arr); 
    Arrays.sort(arr2); 

   return Arrays.equals(arr,arr2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.next(); 
        String t = sc.next(); 

        boolean res = isAnagram(s,t); 

        System.out.println(res);
    }
}
