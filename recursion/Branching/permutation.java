public class permutation {

    public static void solve(String s,String res,int length)
    {
        if (res.length() == length) {
            System.out.print(res + " ");
            return;
        }
        char start = s.charAt(0);
        s = s.substring(1);
        for(int i=0;i<=res.length();i++)
        {
            StringBuilder sb = new StringBuilder(res);
            sb.insert(i, start);
            solve(s, sb.toString(), length);
        }
    }
    public static void main(String[] args) {
        solve("ABC", "", 3);
    }
    
}
