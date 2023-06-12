package recursion;

import javax.naming.spi.DirStateFactory.Result;

public class CountZero {

    static int count(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 10) {
            return 0;
        } else if (n % 10 == 0) {
            return 1 + count(n / 10);
        }
        return count(n / 10);
    }
    
    static void count1(int n, int result) {
        if (n == 0 || n < 10) {

            System.out.println("0");
            return;
        }
        int digit = n % 10;
        if (digit == n) {
            System.out.println(result);

            result += 1;
            count1(n / 10, result);
        }
    }
    public static void main(String[] args) {
        int res = count(102030);
        System.out.println(res);
        int result = 0;
        count1(102030,result);

    }
}
