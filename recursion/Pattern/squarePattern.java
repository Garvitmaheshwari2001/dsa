public class squarePattern {
    static int count = 0;

    static void solve(int num) {
        if(count <=0)
            return;
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
        count--;
        solve(num);
    }
    public static void main(String[] args) {
        count = 4;
        solve(count);
    }
}
