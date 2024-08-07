//Move all x at the end of the string using recusrion 
//Time complexity -> O(n+count) -> O(n)

public class ques22 {
    public static void moveAllX(String s, int count, int index, String newString) {

        if (index == s.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currCharacter = s.charAt(index);

        if (currCharacter == 'x') {
            count++;
            moveAllX(s, count, index + 1, newString);
        } else {
            newString += currCharacter;
            moveAllX(s, count, index + 1, newString);
        }

    }

    public static void main(String[] args) {
        String a = "axbcxxd";
        moveAllX(a, 0, 0, "");
    }

}
