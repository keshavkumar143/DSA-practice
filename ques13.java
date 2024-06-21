//Reverse Bits
//LEETCODE LINK --> https://leetcode.com/problems/reverse-bits/
import java.util.*; 
public class ques13 {

        public static int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                result <<= 1;        
                result |= (n & 1);   
                n >>>= 1;            
            }
            return result;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = reverseBits(n);

        System.out.println(res);

    }
}
