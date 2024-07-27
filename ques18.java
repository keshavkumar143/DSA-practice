import java.util.*;
//Generate Parentheses
//Leetcode Link -> https://leetcode.com/problems/generate-parentheses/description/
public class ques18 {

    public static void gen(int n, int open, int close, String ans, ArrayList<String> arr) {
        if (open == n && close == open) {
            arr.add(ans);
            return;
        }

        if (open > n || close > open) {
            return;
        }

        gen(n, open + 1, close, ans + "(", arr);
        gen(n, open, close + 1, ans + ")", arr);
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        gen(n, 0, 0, "", arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> arr = generateParenthesis(n);
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
