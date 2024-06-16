//Buy and Sell Crypto
//Linkedin Problem --> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.util.*;

public class ques10 {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = 0;

        if (prices.length == 1) {
            return 0;
        }

        while (i < prices.length && j < prices.length) {
            if (j < prices.length) {
                int k = prices[j] - prices[i];

                if (k > max) {
                    max = k;
                }
            }
            j++;

            if (j == prices.length) {
                i++;
                j = i + 1;
            }
        }

        if (max < 0) {
            return 0;
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = maxProfit(arr);

        System.out.println(res);
    }
}