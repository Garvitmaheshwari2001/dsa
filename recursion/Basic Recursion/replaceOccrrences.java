package recursion;

import java.util.Arrays;

public class replaceOccrrences {

public static int replaceOccurrences(int[] arr, int target, int replacement, int currentIndex) {
    if (currentIndex == arr.length) {
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    if (arr[currentIndex] == target) {
        arr[currentIndex] = replacement;
     return   replaceOccurrences(arr, target, replacement, currentIndex + 1);
 } else {

     return replaceOccurrences(arr, target, replacement, currentIndex + 1);
 }
}

public static void solve(int[] arr, int target, int replacement, int currentIndex) {
    if (currentIndex >= arr.length) {
        System.out.println(Arrays.toString(arr));
        return;
    }

    if (arr[currentIndex] == target) {
        arr[currentIndex] = replacement;
    }

    solve(arr, target, replacement, currentIndex + 1);
}

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 30, 20};
        int target = 30;
        int replacement = 100;
        
       solve(arr, target, replacement, 0);
       replaceOccurrences(arr, target, replacement, 0);
    }
}
