package recursion;

public class Factorial {

    static int fact(int num){
        if(num == 0)
        {
            return 1 ;
        }
            return  num*fact(num-1);
        }
        
        static void fac(int num , int res)
        {
            if (num == 1) //base case
            {
                System.out.print(res);
                return;
            }
            fac(num - 1, res * num);
        }
        
        
    
    public static void main(String[] args) {
        int  result =	fact(5);
	System.out.println(result);
		
		fac(5,1);
    }
}
