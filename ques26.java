import java.util.*;

//Check if Two Chessboard Squares Have the Same Color
//LEETCODE LIKE --> https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/description/

//CONTEST WEEKLY 413

public class ques26 {
    public static String result(String s) {
        int n = (int) s.charAt(0);
        int j = (int) s.charAt(1);

        return (((n % 2 == 0 && j % 2 == 0) || (n % 2 != 0 && j % 2 != 0))) ? "black" : "white";

    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String k = result(coordinate1);
        String l = result(coordinate2);
        return k.equals(l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinate1 = sc.next();
        String coordinate2 = sc.next();

        boolean result = checkTwoChessboards(coordinate1, coordinate2);

        System.out.println(result);
    }
}
