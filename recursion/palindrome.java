package recursion;

public class palindrome {
    
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar != lastChar) {
            return false;
        } else {
            String subString = str.substring(1, str.length() - 1);
            return isPalindrome(subString);
        }
    }

    public static void checkPalindrome(String str, int start, int end) {
        if (start >= end) {
            System.out.println("true");
            return;
        }

        if (str.charAt(start) != str.charAt(end)) {
            System.out.println("false");
            return;
        }

        checkPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        checkPalindrome(str, 0, str.length()-1);
    }

}
