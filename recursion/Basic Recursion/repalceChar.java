package recursion;

public class repalceChar {
    static String fun(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "#" + fun(s.substring(2));
        } else {
            return s.charAt(0) + fun(s.substring(1));
        }
    }

    public static void fun1(String str) {
        if (str.length() <= 1) {
            System.out.print(str);
            return;
        }

        if (str.charAt(0) == str.charAt(1)) {
            System.out.print(str.charAt(0) + "#");
            fun1(str.substring(2));
        } else {
            System.out.print(str.charAt(0));
            fun1(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String input = "aabbcc";
        String res = fun(input);
        System.out.println(res);

        fun1(input);
    }
}
