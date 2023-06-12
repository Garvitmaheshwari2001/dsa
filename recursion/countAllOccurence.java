package recursion;

public class countAllOccurence {

    static int solve(int[] arr, int target, int currIdx,int res) {
        
        if (currIdx <0) {
            return res;
        }
        if (arr[currIdx] == target) {
            res++;
        }
        return solve(arr, target, currIdx - 1,res);
    }

    static void solve1(int[] arr, int target, int currentIndex, int count) {
        if (currentIndex < 0) {
            System.out.println(count);
            return;
        }
        if (arr[currentIndex] == target) {
            count++;
        }
        solve1(arr, target, currentIndex - 1, count);
        
    }

    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30, 40, 50, 30, 20 };
        int target = 30;
        int res = 0;
        int ans = solve(arr, target, arr.length-1,res);
        System.out.println(ans);

        int count = 0;
        solve1(arr, target, arr.length - 1, count);
    }
}
