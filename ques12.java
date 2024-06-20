//Number of One Bits
//LEETCODE LINK --> https://leetcode.com/problems/number-of-1-bits/

import java.util.*;

public class ques12 {

    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = hammingWeight(n);

        System.out.println(res);
    }
}
