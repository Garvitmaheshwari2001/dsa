package recursion;

public class SumN {

    static int sum(int n) {
        if (n != 0) {
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
    
    
    static void sum1(int n , int result) {
        if (n == 1) {
            System.out.println(result);
            return;
        }
        result += n;
        sum1(n - 1, result);
   }

    public static void main(String[] args) {
        int res = sum(5);
        System.out.println(res);

        int result = 1;
        sum1(5, result);
    }
}