//PRODUCT OF ARRAY EXCEPT SELF
import java.util.Scanner;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] arr = new int[n];

        // Calculate left product array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Calculate right product array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Calculate the result array
        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }

        return arr;
    }
}

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] result = sol.productExceptSelf(nums);

        System.out.println("The product of array except self is:");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
