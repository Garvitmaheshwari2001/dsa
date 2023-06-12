public class Pyramid {

    static void solve(int totalrow, int currRow)
    {
        if (currRow > totalrow) {
            return;
        }
        printspace(totalrow - currRow);
        printstar(2*currRow-1);
        System.out.println();
        solve(totalrow, currRow + 1);
    }

    static void printspace(int count) {
        if (count <= 0) {
            return;
        }
        System.out.print(" ");
        printspace(count - 1);
    }
    
    static void printstar(int count)
    {
        if(count<=0)
        {
            return;
        }
        System.out.print("*");
        printstar(count-1);
    }
    public static void main(String[] args) {
        solve(5, 1);
    }
    
}
