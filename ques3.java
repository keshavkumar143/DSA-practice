//Two Sum Problem
//LEETCODE LINK --> https://leetcode.com/problems/two-sum/

import java.util.*;

public class ques3 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum:");
        int k = sc.nextInt(); 

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = twoSum(arr, k);

        if (arr2.length == 2) {
            System.out.println("Indices of the elements that add up to the target sum: " + arr2[0] + ", " + arr2[1]);
        } else {
            System.out.println("No two elements add up to the target sum.");
        }
    }
}
