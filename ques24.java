//Subsequence of a String 

public class ques24 {


    public static void subsequences(String s, int index, String newString) {

        if (index == s.length()) {
            System.out.println(newString);
            return;
        }

        // Two call backs are needed in it
        char currentCharacter = s.charAt(index);

        // First call -> IT STATES THAT IT WILL CHOOSE THE CHARACTER
        subsequences(s, index + 1, newString + currentCharacter);

        // Second call -> IT STATES THAT IT WILL NOT CHOOSE THE CHARACTER

        subsequences(s, index + 1, newString);

    }

    public static void main(String[] args) {
        String s = "abc";
        subsequences(s, 0, "");
    }
}