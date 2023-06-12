package recursion;

public class seriesSum {
    private static double sum = 0.0;

    static void calculate(int n) {
        if (n == 1) {
            sum += 1.0;
        } else {
            double temp = (double) n / Math.pow(n, n);
            sum += temp;
            calculate(n - 1);
        }
    }
    
    static double calculate1(int n) {
        if (n == 1) {
            return 1.0;
        } else {
            double temp = (double) n / Math.pow(n, n);
            return temp + calculate1(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        calculate(n);
        System.out.println(sum);

        double ans = calculate1(n);
        System.out.println(ans);

    }
    
}
