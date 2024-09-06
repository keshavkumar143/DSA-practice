import java.util.*;

public class ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        int prefix_sum[] = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }   

        prefix_sum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }

        for (int i = 0; i < prefix_sum.length; i++) {
            System.out.print(prefix_sum[i] + " ");
        }

        sc.close();

    }
}