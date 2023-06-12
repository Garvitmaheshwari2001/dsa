package recursion;

public class lastIndex {

    static int solve(int[] arr, int target, int currIdx) {
        if (currIdx < 0) {
            return -1;
        }
        if (arr[currIdx] == target) {
            return currIdx;
        }
        return solve(arr, target, currIdx - 1);
    }

    static void solve1(int[] arr, int target, int currentIndex, int lastIndex) {
        if (currentIndex < 0) {
            return;
        }

        if (arr[currentIndex] == target) {
            lastIndex = currentIndex;
            System.out.println("last index using void function is " +lastIndex);
            return;
        }

        solve1(arr, target, currentIndex - 1, lastIndex);
        
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 30, 20 };
        int target = 30;

        int idx = solve(arr, target, arr.length - 1);
        System.out.println(idx);
        int lastIndex = -1;
        solve1(arr, target, arr.length - 1, lastIndex);
    }
}
