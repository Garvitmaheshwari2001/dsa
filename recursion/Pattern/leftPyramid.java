public class leftPyramid {

    static void solve(int totalRow, int currRow,int currCol)
    {
       if(currRow >= totalRow)
           {return;}
           
           if (currCol <= currRow) {
               System.out.print("*");
               solve(totalRow, currRow, currCol + 1);
           }
           else {
               System.out.println();
               solve(totalRow, currRow+1, 0);
         }
    }
    public static void main(String[] args) {
        int n = 5;
        solve(n,0,0);
    }
    
}
