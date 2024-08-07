//Remove duplicates using recursion 
public class ques23 {
    public static boolean arr[] = new boolean[26];

    public static void removeDuplicate(String s, int index, String newString) {

        if (index == s.length()) {
            System.out.println(newString);
            return;
        }

        char currentCharacter = s.charAt(index);

        if (arr[currentCharacter - 'a'] == false) {

            newString += currentCharacter;

            arr[currentCharacter - 'a'] = true;

            removeDuplicate(s, index + 1, newString);
        } else {

            removeDuplicate(s, index + 1, newString);
        }

    }

    public static void main(String[] args) {
        String s = "abbccda";
        removeDuplicate(s, 0, "");
    }

}
