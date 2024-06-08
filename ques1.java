///Do array has Duplicates 
//LEETCODE LINK --> https://leetcode.com/problems/contains-duplicate/
import java.util.HashSet;
import java.util.Scanner;

public class ques1 {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            if (!hs.add(num)) { 
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean res = hasDuplicate(arr);

        System.out.println(res);
    }
}
