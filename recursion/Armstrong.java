package recursion;

public class Armstrong {
    public static int sum = 0;
    public static int res = 0;

    public static void main(String[] args) {
        int n = 153;
        int a = armstrong(n);
        if (a == n) {
            System.out.println("yes it is");
        } else {
            System.out.println("no its not");
        }
        arm(n, n);
    }

    public static void arm(int n, int a) {
        if (n == 0) {
            if (res == a) {
                System.out.println("Yes");
            }
            return;
        }
        int rem = n % 10;
        res = res + (int) Math.pow(rem, 3);
        arm(n/10,a);
}

    public static int armstrong(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum + (int) Math.pow(rem, 3);
        return armstrong(n/10);
}
}
