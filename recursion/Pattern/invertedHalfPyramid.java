public class invertedHalfPyramid {
    static void solve(int totalRow, int currRow)
    {
       if(currRow >= totalRow)
           {return;}
           
           for (int i = 0; i < totalRow - currRow; i++) {
               System.out.print("*");
           }
           System.out.println();
          solve(totalRow, currRow+1);
    }
    public static void main(String[] args) {
        int n = 5;
        solve(n,0);
    }   
}
