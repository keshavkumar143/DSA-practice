//Valid Parentheses
//Lettcode Link -> https://leetcode.com/problems/valid-parentheses/

import java.util.*;

public class ques11 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (st.empty()) {
                return false;
            } else if (st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
            }

            else if (st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            }

            else if (st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            }

            else {
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isValid(s));
    }
}
