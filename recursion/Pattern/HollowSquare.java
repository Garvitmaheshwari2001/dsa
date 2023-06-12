

public class HollowSquare {
    static void printStar(int length,int row)
    {
        if(row<=0)
        {
            return;
        }
        if(row == length || row == 1)
        {
            for (int i = 0; i < length; i++) {
                System.out.print("*");
            }
        }
        else {
            System.out.print("*");
            for (int i = 0; i < length - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        printStar(length, row-1);
    }
    public static void main(String[] args) {
        int n =5;
        printStar(5,5);
    }
    
}
