package recursion;

import java.util.Scanner;
public class Prime {
    
    static int prime(int y, int i) {
        if (i < y) {
            if (y % i != 0) {
                return (prime(y, ++i));
            } else {
                return 0;
            }
        }
        return 1;
    }
    
    static void prime1(int num,int x) {
        if (num % x == 0) {
            System.out.println("the numner is not prime");
            return;
        }
        if (x * x > num) {
            System.out.println("the number is prime");
            return;
       }
        prime1(num, x+1);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = s.nextInt();
        int res = prime(n,2);
        if(res == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n + " is not prime number");
        }
        
        prime1(n,2);
    }
}
