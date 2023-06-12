package recursion;

public class Power {

   static int pow(int n)
   {
       if (n != 0) {
           return (2 * (pow(n - 1)));
       } else {
           return 1;
       }
   }

   
public static void pow1(int n, int result) {
    if (n == 0) {
        System.out.println(result);
        return; // Base case: stop recursion
    }
    result *= 2; // Multiply result by 2
    pow1(n - 1, result);
    
}
   
    public static void main(String[] args) {
       int res =  pow(5);
       System.out.println(res);
       int result = 1;
       pow1(5, result);
    
    }
}
